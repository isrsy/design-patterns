package factorymethod;

import factorymethod.core.Factory;
import factorymethod.core.IDFactory;
import factorymethod.core.Product;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDFactory();
        Product product1 = factory.create("小明");
        Product product2 = factory.create("小红");
        product1.use();
        product2.use();
    }
}
