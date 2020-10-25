package Structure.Decoractor.Decoractor;

import Structure.Decoractor.Component.Drink;

/**
 * @ClassName: Sugar
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/20 10:26
 */
public class Sugar extends Decorator {
    public Sugar(Drink drink) {
        super(drink);
        super.setName("Sugar");
        super.setPrice(0.5f);
    }
}
