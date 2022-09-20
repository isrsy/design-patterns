package proxy.dynamic;

import proxy.MyTransaction;
import proxy.Store;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 3:41 PM
 * @description: JDK动态代理
 */
public class JdkProxy implements InvocationHandler {
    //目标类
    private Object target; // 代理人内部维护了一个提供商品的真实对象
    //增强类
    private MyTransaction myTransaction;

    public Object getProxyInstance(Object target, MyTransaction myTransaction) {
        this.target = target;
        this.myTransaction = myTransaction;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    /**
     * @param proxy  the proxy instance that the method was invoked on
     * @param method 对应于在代理实例上调用的接口方法的方法实例。方法对象的声明类将是在其中声明方法的接口，该接口可能是代理类通过其继承方法的代理接口的超级接口。
     * @param args   包含在代理实例上的方法调用中传递的参数值的对象数组，如果接口方法不采用参数，则null。原始类型的参数包裹在适当的原始包装类别的实例中，例如java.lang.integer或java.lang.boolean。
     * @return 从代理实例上的方法调用返回的值。如果接口方法的返回类型是原始类型，则该方法返回的值必须是相应的原始包装类别的实例。否则，它必须是可分配给声明的返回类型的类型。如果此方法返回的值是null，并且接口方法的返回类型是原始的，则将通过代理实例上的方法调用来抛出NullPoInterException。如果该方法返回的值与上述所述的接口方法的声明返回类型不兼容，则ClassCastException将通过代理实例上的方法调用抛出。
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        myTransaction.beginTransaction();
        Object res = method.invoke(this.target, args);
        myTransaction.commit();
        after();
        return res;
    }

    private void before() {
        System.out.println("执行方法前置通知________________________");
    }

    private void after() {
        System.out.println("执行方法后置通知________________________");
    }
}
