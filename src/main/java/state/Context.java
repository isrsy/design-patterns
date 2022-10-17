package state;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class Context {
    private State state;

    public Context() {
        // 初始化，并定义当前状态
        this.state = new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
