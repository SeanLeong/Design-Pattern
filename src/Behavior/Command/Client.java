package Behavior.Command;

import Behavior.Command.Action.DB;
import Behavior.Command.Command.*;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:57
 */
public class Client {
    public static void main(String[] args) {
        DBController dbController = new DBController();
        //执行者
        DB db1 = new DB("数据库1");
        DB db2 = new DB("数据库2");

        /*
            客户端给controller发出指令，并指定具体的执行者
         */
        System.out.println("====================excute======================");
        //插入
        dbController.excute(new InsertDBCommand(db1, "a", "b", "c"));
        //删除
        dbController.excute(new DeleteDBCommand(db2, "a", "b", "c"));
        //查询
        dbController.excute(new SelectDBCommand(db1, "a", "b", "c"));
        //修改
        dbController.excute(new UpdateDBCommand(db2, "a", "b"));
        System.out.println("==================rollBack========================");
        dbController.rollBack();
        dbController.rollBack();
        dbController.rollBack();
        dbController.rollBack();
        //这边只会执行三次，因此查询不会回滚
    }
}
