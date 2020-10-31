package Behavior.Visitor;

import Behavior.Visitor.Website.BilibiliWebsite;
import Behavior.Visitor.Website.ELearnWebsite;

/**
 * @ClassName: Visitor
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 16:06
 */
public interface Visitor {

    void visit(BilibiliWebsite website);

    void visit(ELearnWebsite website);
}
