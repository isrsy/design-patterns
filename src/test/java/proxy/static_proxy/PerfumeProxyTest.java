package proxy.static_proxy;

import org.junit.Test;
import proxy.PerfumeSupplier;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 3:39 PM
 * @description:
 */
public class PerfumeProxyTest {

    @Test
    public void provide() {
        //我们需要实例化代理对象与香奈儿供应商对象
        PerfumeSupplier chanelSupplier = new PerfumeSupplier();
        PerfumeProxy proxy = new PerfumeProxy(chanelSupplier); //将香奈儿供应商传入
        // 实现代理
        proxy.provide(1998.99); //实现了方法增强
    }
}