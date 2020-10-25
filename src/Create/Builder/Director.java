package Create.Builder;

import Create.Builder.Builder.Builder;

/**
 * @ClassName: Director
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/13 17:00
 */
public class Director {

    public void builderDrink(Builder builder){
        builder.setName("colar");
        builder.setNumber(99);
        builder.setPrice(99);
        builder.setWeight(99);
    }

    public void builderFood(Builder builder){
        /*
            使用链式编程：前提建造者的建造动作要返回Builder
         */
        builder.setName("hambuger").setNumber(101).setPrice(101).setWeight(101);
    }
}
