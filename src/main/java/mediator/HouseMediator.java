package mediator;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 * @description:
 */
public interface HouseMediator {
    void send(String message, Colleague from);
}
