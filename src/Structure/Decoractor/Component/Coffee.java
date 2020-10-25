package Structure.Decoractor.Component;

/**
 * @ClassName: Coffee
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/20 10:14
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }

    @Override
    public String desc() {
        return super.getName();
    }
}
