package Behavior.Mediator;

public abstract class Components {
    Mediator mediator;
    //发消息
    abstract void send();
    //接受消息
    abstract void receive();
    //设置中介者
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
