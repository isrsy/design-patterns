package mediator;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 * @description:
 */
public interface Colleague {
    void sendMessage(String msg);

    void receiveMessage(String msg);
}
