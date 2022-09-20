package proxy.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.MyTransaction;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 4:14 PM
 * @description: cglib
 */
public class CglibProxy implements MethodInterceptor {
    //目标类
    private Object target;
    //增强类
    private MyTransaction myTransaction;


    public Object getProxyInstance(Object target, MyTransaction myTransaction) {
        this.target = target;
        this.myTransaction = myTransaction;
        Enhancer enhancer = new Enhancer();
        //设置需要增强类的加载器对象
        enhancer.setClassLoader(target.getClass().getClassLoader());
        //设置方法拦截器，代理工厂
        enhancer.setCallback(this);
        enhancer.setSuperclass(target.getClass());
        System.out.println(target.getClass().getName());
        //创建代理类
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        myTransaction.beginTransaction();
        Object res = method.invoke(this.target, objects);
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
