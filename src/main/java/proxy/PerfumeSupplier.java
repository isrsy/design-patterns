package proxy;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 3:19 PM
 * @description: 香水供应商
 */
public class PerfumeSupplier implements Store {

    public void sell() {
        System.out.println("卖香水.......");
    }

    @Override
    public void provide(double price) {
        System.out.println("已成功购买一瓶法国香奈儿香水，花费" + price + "元");
    }
}
