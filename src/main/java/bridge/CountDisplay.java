package bridge;

/**
 * 类的层次结构
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    /**
     * 新添加的功能
     */
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
