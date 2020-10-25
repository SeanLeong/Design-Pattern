package Structure.Decoractor;


import Structure.Decoractor.Component.Drink;
import Structure.Decoractor.Component.LongBlack;
import Structure.Decoractor.Component.ShortBlack;
import Structure.Decoractor.Decoractor.Milk;
import Structure.Decoractor.Decoractor.Sugar;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/20 10:28
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=========第一杯=========");
        Drink coffee = new LongBlack();
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);
        System.out.println(coffee.cost());
        System.out.println(coffee.desc());


        System.out.println("=========第二杯=========");
        Drink coffee2 = new ShortBlack();
        coffee2 = new Sugar(new Milk(coffee2));
        System.out.println(coffee2.cost());
        System.out.println(coffee2.desc());
    }
}
