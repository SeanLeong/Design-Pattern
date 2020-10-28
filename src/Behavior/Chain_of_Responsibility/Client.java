package Behavior.Chain_of_Responsibility;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/28 10:43
 */
public class Client {
    public static void main(String[] args) {
        //声明处理者
        Handler oneHandler = new OneLevelHandler("一级处理者");
        Handler twoHandler = new TwoLevelHandler("二级处理者");
        Handler threeHandler = new ThreeLevelHandler("三级处理者");

        //设置责任链
        oneHandler.setHandler(twoHandler);
        twoHandler.setHandler(threeHandler);
        threeHandler.setHandler(oneHandler);//  这里我串成了一个环，根据业务不同自行选择

        //上面可以是使用工厂模式，然后返回要给最低等级的处理者给客户端。我这里简单写了

        MyRequest request = new MyRequest(1, "删除请求");
        threeHandler.handle(request);   //传入环的好处，在于不管使用哪个等级的处理者调用处理方法都问题不大

    }
}
