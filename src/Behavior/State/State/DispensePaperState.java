package Behavior.State.State;

import Behavior.State.Exam;

/**
 * @ClassName: DispensePaperState
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 22:03
 */
public class DispensePaperState implements State {

    private Exam exam;

    public DispensePaperState(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void look() {
        System.out.println(exam.getName() + ":可以查看试卷");
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
