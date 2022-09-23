package factorymethod.core;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product product = createProduct(owner);
        register(product);
        return product;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void register(Product product);

}
