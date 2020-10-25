package Structure.Decoractor.Decoractor;

import Structure.Decoractor.Component.Drink;

/**
 * @ClassName: Decorator
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/20 10:19
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String desc() {
        return super.getName() + " && " + drink.desc();
    }
}
