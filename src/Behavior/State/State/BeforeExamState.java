package Behavior.State.State;

import Behavior.State.Exam;

/**
 * @ClassName: BeforeExamState
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 22:01
 */
public class BeforeExamState implements State{

    private Exam exam;

    public BeforeExamState(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void look() {
        System.out.println(exam.getName() + ":未开考无法查看试卷");
    }

    @Override
    public void write() {
        System.out.println(exam.getName() + ":未开考无法作答");
    }

    @Override
    public void submit() {
        System.out.println(exam.getName() + ":未开考无法提交");
    }

    @Override
    public void searchGrade() {
        System.out.println(exam.getName() + ":未开考无法查看考试成绩");
    }
}
