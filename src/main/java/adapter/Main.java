package adapter;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
public class Main {
    public static void main(String[] args) {
        // 船长只会row 划船方法，不会使用帆船
        Captain captain = new Captain(new RowingBoat());
        captain.row();
        // 船长可以使用适配器来使用帆船
        captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
