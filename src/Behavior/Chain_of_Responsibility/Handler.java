package Behavior.Chain_of_Responsibility;

/**
 * @ClassName: Handler
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/28 10:28
 */
public abstract class Handler {

    Handler handler;  //保存下一个处理者
    String name;    //处理者的名字

    public Handler(String name) {
        this.name = name;
    }

    //设置下一个处理者
    void setHandler(Handler handler) {
        this.handler = handler;
    }

    //传入需要处理的请求
    abstract void handle(MyRequest request);
}
