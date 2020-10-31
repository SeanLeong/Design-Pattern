package Behavior.Visitor;

import Behavior.Visitor.Website.BilibiliWebsite;
import Behavior.Visitor.Website.ELearnWebsite;

/**
 * @ClassName: NormalStudent
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 16:17
 */
public class NormalStudent implements Visitor {
    @Override
    public void visit(BilibiliWebsite website) {
        System.out.println("在B站学习：" + website.getTitle() + "，十分钟后刷起来动态");
    }

    @Override
    public void visit(ELearnWebsite website) {
        System.out.println("在学习网站学习：" + website.getTitle() + "，并睡得很香");
    }
}
