package Behavior.Strategy;

import Behavior.Strategy.Pay.CashPayStrategy;
import Behavior.Strategy.Pay.PayStrategy;
import Behavior.Strategy.Shop.OfflienShopStrategy;
import Behavior.Strategy.Shop.ShopStrategy;

/**
 * @ClassName: Shopping
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/29 15:14
 */
public class Shopping {
    /*
        这里需要协调不同得策略，构造方法可以给定默认策略（不给问题不大），但是需要提供自定义策略的方法（构造器/set方法）
     */
    private PayStrategy payStrategy;
    private ShopStrategy shopStrategy;

    public Shopping(){
        this.payStrategy = new CashPayStrategy();
        this.shopStrategy = new OfflienShopStrategy();
    }

    public Shopping(PayStrategy payStrategy, ShopStrategy shopStrategy) {
        this.payStrategy = payStrategy;
        this.shopStrategy = shopStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void setShopStrategy(ShopStrategy shopStrategy) {
        this.shopStrategy = shopStrategy;
    }

    public void shopping(String name, float cost){
        shopStrategy.shop(name);
        payStrategy.pay(cost);
    }
}
