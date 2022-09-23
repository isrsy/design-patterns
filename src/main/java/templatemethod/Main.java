package templatemethod;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay();
        charDisplay.display();

        AbstractDisplay stringDisplay = new StringDisplay();
        stringDisplay.display();
    }
}
