package Behavior.Command.Command;

import Behavior.Command.Action.DB;

/**
 * @ClassName: DeleteDBCommand
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:41
 */
public class UpdateDBCommand implements DBCommand {

    private DB db;
    private String a;
    private String b;
    public UpdateDBCommand(DB db, String a, String b) {
        this.db = db;
        this.a = a;
        this.b = b;
    }

    @Override
    public void excute() {
        db.update(this.a, this.b);
    }

    @Override
    public void undo() {
        db.update(this.b, this.a);
    }
}
