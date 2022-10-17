package observer;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 * 具体观察者
 */
public class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");

    }
}
