package Behavior.Observer;

public class Subscriber {
    /*
        消息订阅者（充当观察者）：它能接受发布者的推送的消息
        这里可以抽象的接口，不同的具体实现类的执行方式可以不同
        这里就简单写了，只有一种订阅者（执行方法一样）
     */

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void send(Publisher publisher){
        System.out.println(this.name + "收到了推送，标题：" + publisher.getTitle());
    }

    public void subscribe(Publisher publisher){
        publisher.subscribe(this);
    }
}
