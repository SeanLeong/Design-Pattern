package Behavior.Strategy.Shop;

/**
 * @ClassName: OnlineShopStrategy
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/29 15:13
 */
public class OnlineShopStrategy implements ShopStrategy {
    @Override
    public void shop(String name) {
        System.out.println("在网上商城购买了" + name);
    }
}
