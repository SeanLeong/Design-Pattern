package Create.Builder;

import Create.Builder.Bean.Drink;
import Create.Builder.Bean.Food;
import Create.Builder.Builder.DrinkBuilder;
import Create.Builder.Builder.FoodBuilder;

/**
 * @ClassName: Test
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/13 20:12
 */
public class Test {
    public static void main(String[] args) {

        Director director = new Director();

        /*
            构建Drink，
         */
        DrinkBuilder drinkBuilder = new DrinkBuilder();
        Drink first_drink = drinkBuilder.getProduct();
        System.out.println(first_drink.toString());   //输出默认饮料
        director.builderDrink(drinkBuilder);
        Drink second_dirnk = drinkBuilder.getProduct();
        //同一个对象实例
        System.out.println(first_drink.toString());
        System.out.println(second_dirnk.toString());   //按照构造去输入饮料

        FoodBuilder foodBuilder = new FoodBuilder();
        Food first_food = foodBuilder.getProduct();
        System.out.println(first_food.toString());
        director.builderFood(foodBuilder);
        Food second_food = foodBuilder.getProduct();
        //不同的对象实例
        System.out.println(first_food.toString());
        System.out.println(second_food.toString());


        /*
            在Builder中，可以自定义不同的构造方式，Drink和Food的构造就不一样。
         */
    }
}
