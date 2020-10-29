package Behavior.Strategy.Pay;

/**
 * @ClassName: CashPayStrategy
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/29 15:09
 */
public class CashPayStrategy implements PayStrategy {
    @Override
    public void pay(float cost) {
        System.out.println("使用现金支付" + cost + "元");
    }
}
