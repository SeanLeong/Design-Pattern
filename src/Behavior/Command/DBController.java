package Behavior.Command;

import Behavior.Command.Command.DBCommand;
import Behavior.Command.Command.SelectDBCommand;
import Behavior.Command.Command.UpdateDBCommand;

import java.util.*;

/**
 * @ClassName: DBController
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:47
 */
public class DBController {

    private Stack<DBCommand> undoCommands;
    public DBController() {
        this.undoCommands = new Stack<>();
    }

    public void excute(DBCommand command){
        command.excute();
        //如果是查询，就不执行撤回
        if(!(command instanceof SelectDBCommand)) {
            undoCommands.push(command);
        }
    }

    public void rollBack(){
        if(!undoCommands.empty()) {
            DBCommand command = undoCommands.pop();
            command.undo();
        }
    }
}
