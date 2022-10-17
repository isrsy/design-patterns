package mediator;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class ConcreteColleagueSell implements Colleague {
    private final HouseMediator mediator;

    public ConcreteColleagueSell(HouseMediator mediator) {this.mediator = mediator;}

    @Override
    public void sendMessage(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(msg);
    }
}
