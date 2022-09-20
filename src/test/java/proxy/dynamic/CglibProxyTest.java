package proxy.dynamic;

import org.junit.Test;
import proxy.MyTransaction;
import proxy.PerfumeSupplier;
import proxy.Store;
import proxy.WineSupplier;

import static org.junit.Assert.*;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 4:48 PM
 * @description:
 */
public class CglibProxyTest {

    @Test
    public void intercept() {
        MyTransaction myTransaction = new MyTransaction();
        PerfumeSupplier perfumeSupplier = new PerfumeSupplier();
        WineSupplier wineSupplier = new WineSupplier();
        CglibProxy cglibProxy = new CglibProxy();
        Store perfumeInstance = (Store) cglibProxy.getProxyInstance(perfumeSupplier, myTransaction);
        perfumeInstance.provide(9999);
        Store winInstance = (Store) cglibProxy.getProxyInstance(wineSupplier, myTransaction);
        winInstance.provide(8888);
    }
}