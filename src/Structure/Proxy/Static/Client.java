package Structure.Proxy.Static;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/23 16:40
 */
public class Client {
    public static void main(String[] args) {

        //附近找不到ATM，附近有便利店。便利店也是从ATM中取得钱。
        //这里有点像是桥接模式（同一个接口算桥接吗？）
        Bank proxy = new BankProxy(new ATM());

        //也可以直接在代理类的构造方法直接初始化bank（方案2）
        //Bank proxy = new BankProxy();
        proxy.getMoney(10000);
    }
}
