package Behavior.Command.Command;

import Behavior.Command.Action.DB;

/**
 * @ClassName: InsertDBCommand
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:34
 */
public class InsertDBCommand implements DBCommand {

    private DB db;
    private String[] a;

    public InsertDBCommand(DB db, String...a) {
        this.db = db;
        this.a = a;
    }

    @Override
    public void excute() {
        db.insert(a);
    }

    @Override
    public void undo() {
        db.delete(a);
    }
}
