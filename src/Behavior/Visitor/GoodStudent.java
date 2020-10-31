package Behavior.Visitor;

import Behavior.Visitor.Website.BilibiliWebsite;
import Behavior.Visitor.Website.ELearnWebsite;

/**
 * @ClassName: GoodStudent
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 16:15
 */
public class GoodStudent implements Visitor {
    @Override
    public void visit(BilibiliWebsite website) {
        System.out.println("在B站学习：" + website.getTitle() + "，一学就是十个小时");
    }

    @Override
    public void visit(ELearnWebsite website) {
        System.out.println("在E-learning网站学习：" + website.getTitle());
    }
}
