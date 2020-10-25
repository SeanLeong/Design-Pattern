package Behavior.Command.Command;

import Behavior.Command.Action.DB;

/**
 * @ClassName: DeleteDBCommand
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:41
 */
public class DeleteDBCommand implements DBCommand {

    private DB db;
    private String[] a;
    public DeleteDBCommand(DB db, String...a) {
        this.db = db;
        this.a = a;
    }

    @Override
    public void excute() {
        db.delete(a);
    }

    @Override
    public void undo() {
        db.insert(a);
    }
}
