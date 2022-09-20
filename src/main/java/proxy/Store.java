package proxy;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 3:33 PM
 * @description: 商店接口
 */
public interface Store {
    /**
     * 表示提供商品的方法
     * @param price 价格
     */
    void provide(double price);
}
