package state;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class ConcreteStateA implements State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
