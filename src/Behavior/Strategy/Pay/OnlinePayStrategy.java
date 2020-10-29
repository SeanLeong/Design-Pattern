package Behavior.Strategy.Pay;

/**
 * @ClassName: OnlinePayStrategy
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/29 15:10
 */
public class OnlinePayStrategy implements PayStrategy {
    @Override
    public void pay(float cost) {
        System.out.println("使用电子支付" + cost + "元");
    }
}
