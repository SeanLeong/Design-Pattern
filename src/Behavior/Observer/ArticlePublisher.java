package Behavior.Observer;

/**
 * @ClassName: ArticlePublisher
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 10:44
 */
public class ArticlePublisher extends Publisher{


    public ArticlePublisher(String title) {
        super(title);
    }

    public ArticlePublisher() {
        super();
    }

    @Override
    void update(String title) {
        System.out.println("更新文章内容:" + title);
        this.publish();
    }
}
