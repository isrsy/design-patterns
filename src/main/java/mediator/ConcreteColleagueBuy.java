package mediator;

import java.util.Collections;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class ConcreteColleagueBuy implements Colleague {
    protected HouseMediator mediator;

    public ConcreteColleagueBuy(HouseMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String msg) {
        this.mediator.send(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(msg);
    }
}
