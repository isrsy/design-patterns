package state;

import state.Context;
import state.State;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class ConcreteStateB implements State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
