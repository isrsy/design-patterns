package mediator;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class BJHouseMediator implements HouseMediator {

    private Colleague to;
    private Colleague from;

    public void setTo(Colleague to) {
        this.to = to;
    }


    public void setFrom(Colleague from) {
        this.from = from;
    }

    @Override
    public void send(String message, Colleague from) {
        to.receiveMessage(from.toString() + message);
    }
}
