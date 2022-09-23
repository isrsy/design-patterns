package bridge;

/**
 * 类的实现层次结构
 */
public class StringDisplayImpl extends DisplayImpl {

    private String string;
    private int length;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.length = string.length();
    }


    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
