package Structure.Decoractor.Decoractor;

import Structure.Decoractor.Component.Drink;

/**
 * @ClassName: MilkType
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/20 10:23
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        super.setName("MilkType");
        super.setPrice(2.0f);
    }
}
