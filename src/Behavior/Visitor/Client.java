package Behavior.Visitor;

import Behavior.Visitor.Website.BilibiliWebsite;
import Behavior.Visitor.Website.ELearnWebsite;
import Behavior.Visitor.Website.Website;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 16:25
 */
public class Client {
    public static void main(String[] args) {
        Visitor goodStudent = new GoodStudent();
        Visitor normalStudent = new NormalStudent();


        BilibiliWebsite bilibili = new BilibiliWebsite("Java设计模式");
        goodStudent.visit(bilibili);
        normalStudent.visit(bilibili);
        System.out.println("=============================");
        ELearnWebsite website = new ELearnWebsite("数据库原理");
        goodStudent.visit(website);
        normalStudent.visit(website);

    }
}
