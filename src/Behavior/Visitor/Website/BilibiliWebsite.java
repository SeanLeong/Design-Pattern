package Behavior.Visitor.Website;

import Behavior.Visitor.Visitor;

/**
 * @ClassName: BilibiliWebsite
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 16:10
 */
public class BilibiliWebsite extends Website {

    public BilibiliWebsite(String title) {
        super(title);
    }

    @Override
    public void visited(Visitor visitor) {
        System.out.println("bilibili被访问了");
        visitor.visit(this);
    }
}
