package Behavior.Strategy.Shop;

/**
 * @ClassName: OfflienShopStrategy
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/29 15:12
 */
public class OfflienShopStrategy implements ShopStrategy {
    @Override
    public void shop(String name) {
        System.out.println("在线下商店购买了" + name);
    }
}
