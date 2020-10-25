package Behavior.Command.Command;

import Behavior.Command.Action.DB;

/**
 * @ClassName: DeleteDBCommand
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:41
 */
public class SelectDBCommand implements DBCommand {

    private DB db;
    private String[] a;
    public SelectDBCommand(DB db, String...a) {
        this.db = db;
        this.a = a;
    }

    @Override
    public void excute() {
        db.select(a);
    }

    @Override
    public void undo() {
        //查询不需要undo,这里空实现
    }
}
