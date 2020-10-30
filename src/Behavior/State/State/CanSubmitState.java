package Behavior.State.State;

import Behavior.State.Exam;

/**
 * @ClassName: CanSubmitState
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 22:06
 */
public class CanSubmitState implements State {

    private Exam exam;

    public CanSubmitState(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void look() {
        System.out.println(exam.getName() + ":可以查看试卷");
    }

    @Override
    public void write() {
        System.out.println(exam.getName() + ":已开考可以开始作答");
    }

    @Override
    public void submit() {
        System.out.println(exam.getName() + ":可以提交");
    }

    @Override
    public void searchGrade() {
        System.out.println(exam.getName() + ":暂无考试成绩");
    }
}
