package Create.Builder.Builder;

import Create.Builder.Bean.Drink;

/**
 * @ClassName: FoodBuilder
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/13 16:54
 */
public class DrinkBuilder extends Builder {

    /**
     * 我这里的Builder返回的是同一个Bean对象，也可以返回不同的Bean对象（示例：FoodBuilder）
     */
    Drink drink;

    public DrinkBuilder(){
        drink = new Drink();
    }

    @Override
    public Builder setName(String name) {
        drink.setName(name);
        return this;
    }

    @Override
    public Builder setPrice(double price) {
        drink.setPrice(price);
        return this;
    }

    @Override
    public Builder setWeight(int weight) {
        drink.setWeight(weight);
        return this;
    }

    @Override
    public Builder setNumber(int number) {
        drink.setNumber(number);
        return this;
    }

    public Drink getProduct() {
        return drink;
    }
}
