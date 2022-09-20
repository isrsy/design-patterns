package proxy.dynamic;

import org.junit.Test;
import proxy.MyTransaction;
import proxy.PerfumeSupplier;
import proxy.Store;
import proxy.WineSupplier;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 3:47 PM
 * @description: JDK动态代理测试用例
 */
public class JdkProxyTest {

    @Test
    public void invoke() {
        MyTransaction myTransaction = new MyTransaction();
        // 先创建一个真实的供应商对象
        PerfumeSupplier perfumeSupplier = new PerfumeSupplier();
        WineSupplier wineSupplier = new WineSupplier();
        // 创建一个代理人对象
        // 将供应商对象传入
        JdkProxy jdkProxy = new JdkProxy();
        Store perfumeInstance = (Store) jdkProxy.getProxyInstance(perfumeSupplier, myTransaction);
        // 实现动态代理
        perfumeInstance.provide(1000.00);
        Store winInstance = (Store) jdkProxy.getProxyInstance(wineSupplier, myTransaction);
        winInstance.provide(999.00);
    }
    /*
    执行方法前置通知________________________
    已成功购买一瓶法国香奈儿香水，花费1000.0元
    执行方法后置通知________________________
    执行方法前置通知________________________
    已成功购买一瓶啤酒，花费999.0元
    执行方法后置通知________________________
    */
}