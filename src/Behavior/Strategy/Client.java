package Behavior.Strategy;

import Behavior.Strategy.Pay.CashPayStrategy;
import Behavior.Strategy.Pay.OnlinePayStrategy;
import Behavior.Strategy.Shop.OfflienShopStrategy;
import Behavior.Strategy.Shop.OnlineShopStrategy;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/29 15:18
 */
public class Client {

    public static void main(String[] args) {
        //客户端这里展示使用构造器设置策略
        Shopping shopping = new Shopping(new OnlinePayStrategy(), new OnlineShopStrategy());
        shopping.shopping("手机", 4999);
        System.out.println("==============================");
        shopping.setPayStrategy(new CashPayStrategy());
        shopping.shopping("电脑", 9999);
    }
}
