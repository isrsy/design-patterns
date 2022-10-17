package factory;

/**
 * @author: rensiyu
 * @createTime: 2022/09/27
 */
public class Main {
    public static void main(String[] args) {
        Coin copperCoin = CoinFactory.getCoin(CoinType.COPPER);
        Coin goldCoin = CoinFactory.getCoin(CoinType.GOLD);
        System.out.println(copperCoin.getDescription());
        System.out.println(goldCoin.getDescription());

    }
}
