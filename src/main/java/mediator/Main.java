package mediator;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class Main {
    public static void main(String[] args) {
        BJHouseMediator mediator = new BJHouseMediator();
        Colleague buy = new ConcreteColleagueBuy(mediator);
        Colleague sell = new ConcreteColleagueSell(mediator);

        mediator.setFrom(sell);
        mediator.setTo(buy);
        
        buy.sendMessage("我租房");

        sell.sendMessage("我这里有房子");
        
    }
}
