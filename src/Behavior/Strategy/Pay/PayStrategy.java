package Behavior.Strategy.Pay;

/**
 * @ClassName: PayStrategt
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/29 15:04
 */
public interface PayStrategy {
    /*
        支付策略
     */
    void pay(float cost);
}
