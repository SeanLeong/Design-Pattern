package Behavior.Memento;

import java.util.Date;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 17:07
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        //caretaker作为一个originator的备忘录，保存originator不同时期的状态
        Caretaker caretaker = new Caretaker();


        //第一次保存
        Originator originator = new Originator("开始", "第一章", "简单", new Date().toString());
        caretaker.add(originator.currState());
        Thread.sleep(1000);

        //改变后，第二次保存（偷懒，直接初始化，一般setter就好）
        originator = new Originator("进阶", "第二章", "普通", new Date().toString());
        caretaker.add(originator.currState());
        Thread.sleep(1000);

        //改变后，第三次保存
        originator = new Originator("高阶", "第三章", "困难", new Date().toString());
        caretaker.add(originator.currState());
        Thread.sleep(1000);

        //改变后，不保存，开始撤回
        originator = new Originator("顶级", "第四章", "变态", new Date().toString());

        //第一次撤回，4->3
        originator.revoke(caretaker.getRecent());
        System.out.println(originator);
        Thread.sleep(1000);

        //第二次撤回, 3->2
        originator.revoke(caretaker.getRecent());
        System.out.println(originator);
        Thread.sleep(1000);

        //第三次撤回, 2->1
        originator.revoke(caretaker.getRecent());
        System.out.println(originator);
        Thread.sleep(1000);
    }
}
