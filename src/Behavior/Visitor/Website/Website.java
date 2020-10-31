package Behavior.Visitor.Website;

import Behavior.Visitor.Visitor;

/**
 * @ClassName: Website
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 16:09
 */
public abstract class Website {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Website(String title) {
        this.title = title;
    }

    abstract void visited(Visitor visitor);
}
