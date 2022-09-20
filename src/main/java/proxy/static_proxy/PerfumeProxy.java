package proxy.static_proxy;

import proxy.Store;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 3:35 PM
 * @description: Alice代理商
 */
public class PerfumeProxy implements Store {
    private Store store;

    public PerfumeProxy(Store store) {
        this.store = store; //这里我们内部维护了一个提供服务的真实对象
    }

    @Override
    public void provide(double price) {
        //这里可以在执行代理方法前，做一些逻辑处理
        before();
        store.provide(price); //执行真实提供的方法
        after(); //我们可以在执行后做默写逻辑操作
    }

    public void before() {
        System.out.println("执行方法前置通知________________________");
    }

    public void after() {
        System.out.println("执行方法后置通知________________________");
    }
}
