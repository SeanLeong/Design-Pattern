package Behavior.Chain_of_Responsibility;

/**
 * @ClassName: MyRequest
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/28 10:22
 */
public class MyRequest {
    /*
        一个请求：如果处理者没有办法处理，就给下一个处理者处理；如果能处理就直接处理了，不传了
     */
    private int authority;  //我这里写死，1/2/3
    private String requestName;

    public MyRequest(int authority, String requestName) {
        this.authority = authority;
        this.requestName = requestName;
    }

    public int getAuthority() {
        return authority;
    }

    public String getRequestName() {
        return requestName;
    }
}
