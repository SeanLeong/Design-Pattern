package Structure.Proxy.Static;

/**
 * @ClassName: ATM
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/23 16:37
 */
public class ATM implements Bank {
    @Override
    public void getMoney(int money) {
        System.out.println("取钱：" + money + "元");
    }
}
