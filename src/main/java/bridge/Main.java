package bridge;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("hello,world!"));
        Display display2 = new CountDisplay(new StringDisplayImpl("hello,china!"));

        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("Hello,RTY!"));

        display1.display();
        display2.display();
        countDisplay.display();
        countDisplay.multiDisplay(3);
    }
}
