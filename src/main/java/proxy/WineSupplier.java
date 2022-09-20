package proxy;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 4:02 PM
 * @description: 酒水供应商
 */
public class WineSupplier implements Store {

    public void sell() {
        System.out.println("卖酒.......");
    }
    @Override
    public void provide(double price) {
        System.out.println("已成功购买一瓶啤酒，花费" + price + "元");
    }
}
