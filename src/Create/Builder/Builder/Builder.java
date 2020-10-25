package Create.Builder.Builder;

import Create.Builder.Bean.Food;
import Create.Builder.Bean.Good;

/**
 * @ClassName: Builder
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/11 11:57
 */
public abstract class Builder {
    /*
        建造者类（抽象）：真正负责建造的，在这里会规定一些必要的建造动作
     */
    public abstract Builder setName(String name);
    public abstract Builder setPrice(double price);
    public abstract Builder setWeight(int weight);
    public abstract Builder setNumber(int number);
}
