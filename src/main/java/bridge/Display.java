package bridge;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
public class Display {
    private final DisplayImpl display;

    public Display(DisplayImpl display) {
        this.display = display;
    }
    
    public final void display() {
       open();
       print();
       close();
    }

    protected void open() {
        display.rawOpen();
    }

    protected void print() {
        display.rawPrint();
    }

    protected void close() {
        display.rawClose();
    }


}
