package Behavior.Command.Command;

/**
 * @ClassName: DBCommand
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:29
 */
public interface DBCommand {
    /*
        命令接口：
                命令类中只需要列出几个需要被实现的命令，
                这些命令会被具体的实现类传导到具体的执行者(action)中。
                执行者根据这些命令执行对应的操作即可。
     */
    //执行命令
    void excute();
    //回滚
    void undo();
}
