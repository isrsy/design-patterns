package command;

/**
 * 具体命令
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
