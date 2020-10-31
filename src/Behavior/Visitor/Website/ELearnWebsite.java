package Behavior.Visitor.Website;

import Behavior.Visitor.Visitor;

/**
 * @ClassName: ELearnWebsite
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 16:13
 */
public class ELearnWebsite extends Website {

    public ELearnWebsite(String title) {
        super(title);
    }

    @Override
    public void visited(Visitor visitor) {
        System.out.println("在线学习网址被访问");
        visitor.visit(this);
    }
}
