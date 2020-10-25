package Behavior.Command.Command;

/**
 * @ClassName: DBCommand
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:29
 */
public interface DBCommand {
    //执行命令
    void excute();
    //回滚
    void undo();
}
