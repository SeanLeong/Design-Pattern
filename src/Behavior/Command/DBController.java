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
    /**
     * 用于保存已经执行了的命令，以方便回滚
     */
    private Stack<DBCommand> undoCommands;

    public DBController() {
        this.undoCommands = new Stack<>();
    }

    /*
        面向Client编程，这里我封装了执行和撤回方法
        在执行方法中，进行记录
        在客户端那边只需要传入命令，并在命令中执行具体的执行者就好了
        当然，我们也可以在Controller中写定，不过这里的实现是在DBCommand的构造方法中指定执行者
     */
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
