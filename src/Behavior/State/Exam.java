package Behavior.State;

import Behavior.State.State.*;

/**
 * @ClassName: Exam
 * @Description:考试类
 * @author: SeanLeong
 * @date: 2020/10/30 22:11
 */
public class Exam {
    //初始化当前的状态
    private State state = null;
    //试卷名称
    private String name;

    private int time;

    public Exam(String name) {
        this.state = new BeforeExamState(this);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //下面这些行为方法根据state会有不同的执行策略（这里有点像策略模式，因为我没有在行为方法中写状态转移，这是状态模式和策略模式的区别
    // 策略模式各个策略互相不认识，而状态模式直接的状态通常需要关联）

    //开始前
    void begin() {
        System.out.println(name + ":开始考试");
        if(state instanceof BeforeExamState)
            state = new DispensePaperState(this);
    }
    //查看试卷
    void look() {
        state.look();
        if(state instanceof DispensePaperState)
            state = new ExamingState(this);
    }

    void write() {
        state.write();
        if(state instanceof ExamingState)
            state = new CanSubmitState(this);
    }
    void submit(){
        state.submit();
        if(state instanceof CanSubmitState)
            state = new GradedState(this);
    }
    void searchGrade(){
        state.searchGrade();
    }
}
