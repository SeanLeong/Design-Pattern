package Behavior.State.State;

import Behavior.State.Exam;

/**
 * @ClassName: GradedState
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 22:10
 */
public class GradedState implements State {

    private Exam exam;

    public GradedState(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void look() {
        System.out.println(exam.getName() + ":考试已结束，不得查看试卷");
    }

    @Override
    public void write() {
        System.out.println(exam.getName() + ":考试已结束，不得作答");
    }

    @Override
    public void submit() {
        System.out.println(exam.getName() + ":考试已结束，不得提交");
    }

    @Override
    public void searchGrade() {
        System.out.println(exam.getName() + ":成绩出来了。。。。。。");
    }
}
