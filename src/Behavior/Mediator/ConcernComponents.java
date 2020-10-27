package Behavior.Mediator;

/**
 * @ClassName: ConcernComponents
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/27 14:55
 */
public class ConcernComponents extends Components {

    @Override
    void send() {
        System.out.println(this.hashCode() + "发送消息");
        mediator.relay(this);
    }

    @Override
    void receive() {
        System.out.println(this.hashCode() + "接收到了消息");
    }
}
