package Behavior.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Publisher
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 10:24
 */
public abstract class Publisher {
    /*
        消息发布者（充当被观察者），他的核心方法：订阅/取消订阅/推送消息
     */

    private List<Subscriber> subscriberList;
    private String title;

    public Publisher(String title) {
        subscriberList = new ArrayList<>();
        this.title = title;
    }

    public Publisher() {
        subscriberList = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void cancel(Subscriber subscriber) {
        if(subscriberList.contains(subscriber)){
            subscriberList.remove(subscriber);
        }
    }

    public void publish() {
        if(subscriberList.size() != 0){
            for(Subscriber s : subscriberList){
                s.send(this);
            }
        }
    }

    //更新内容
    abstract void update(String title);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        update(title);
    }
}
