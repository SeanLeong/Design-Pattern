package Behavior.Command.Command;

import Behavior.Command.Action.DB;

/**
 * @ClassName: DeleteDBCommand
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:41
 */
public class DeleteDBCommand implements DBCommand {

    /*
        DB就是执行者，这里我们也可以是一个抽象的接口类
        a用于记录插入的数据，以方便后面undo操作
     */
    private DB db;
    private String[] a;
    public DeleteDBCommand(DB db, String...a) {
        this.db = db;
        this.a = a;
    }

    /*
        下面两个就是具体的命令，和执行者执行方法
     */
    @Override
    public void excute() {
        db.delete(a);
    }

    @Override
    public void undo() {
        db.insert(a);
    }
}
