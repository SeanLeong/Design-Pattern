package Create.Builder.Builder;

import Create.Builder.Bean.Food;

/**
 * @ClassName: FoodBuilder
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/13 16:54
 */
public class FoodBuilder extends Builder {

    private String name;
    private double price;
    private int weight;
    private int number;

    public FoodBuilder(){
    }

    @Override
    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public Builder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Builder setNumber(int number) {
        this.number = number;
        return this;
    }

    public Food getProduct() {
        return new Food(name, price, weight, number);
    }
}
