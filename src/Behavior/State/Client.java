package Behavior.State;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 22:01
 */
public class Client {


    public static void main(String[] args) {

        //正常流程
        Exam exam = new Exam("好试卷");
        exam.begin();
        exam.look();
        exam.write();
        exam.submit();
//        exam.write(); //已经提交再作答就不行了
        exam.searchGrade();

        System.out.println("================================");
        //非正常
        Exam exam2 = new Exam("坏试卷");
        exam2.begin();
        exam2.look();
        exam2.submit();
    }
}
