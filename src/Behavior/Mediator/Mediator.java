package Behavior.Mediator;


public interface Mediator {
    /*
        中介者接口一般定义组件中间的通信
     */
    //注册组件
    void register(Components components);
    //通知中介
    void relay(Components components);
}
