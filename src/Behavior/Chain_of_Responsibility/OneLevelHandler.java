package Behavior.Chain_of_Responsibility;

/**
 * @ClassName: OneLevelHandler
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/28 10:37
 */
public class OneLevelHandler extends Handler {


    public OneLevelHandler(String name) {
        super(name);
    }

    @Override
    void handle(MyRequest request) {
        if(request.getAuthority() == 1){
            System.out.println(this.name + "处理了" + request.getRequestName());
        }else{
            //这里处理不了，下一个进行处理
            handler.handle(request);
        }
    }
}
