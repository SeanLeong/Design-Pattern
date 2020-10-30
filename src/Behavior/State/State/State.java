package Behavior.State.State;

/**
 * @ClassName: State
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 21:56
 */
public interface State {

    /*
    这里模拟一场考试的的不同状态下的行为
    状态有：开考前/发卷时间/开考后/交卷时间/答题结束/成绩批改后
    行为分别是：
        查看试卷内容
        答题
        提交
        查看成绩
     */

    void look();
    void write();
    void submit();
    void searchGrade();
}
