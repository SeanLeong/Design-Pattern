package Behavior.Observer;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 10:56
 */
public class Client {

    public static void main(String[] args) {
        //内容发布者
        Publisher articlePublisher = new ArticlePublisher();
        Publisher videoPublisher = new VideoPublisher();
//
//
        //订阅者
        Subscriber user_1 = new Subscriber("用户1");
        Subscriber user_2 = new Subscriber("用户2");
        Subscriber user_3 = new Subscriber("用户3");

        user_1.subscribe(articlePublisher);

        user_2.subscribe(videoPublisher);

        user_3.subscribe(articlePublisher);
        user_3.subscribe(videoPublisher);

        articlePublisher.setTitle("头条内容资料流出，只要掌握这一项技能，你将超过99%的开发者！");
        System.out.println("=============================================================");
        videoPublisher.setTitle("高并发你不得不知道的那些事！");
    }
}
