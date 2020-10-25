package Create.Builder.Bean;

/**
 * @ClassName: Good
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/17 10:53
 */
public class Good {

    private String name;
    private double price;
    private int weight;
    private int number;

    public Good() {
    }

    public Good(String name, double price, int weight, int number) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", number=" + number +
                '}';
    }
}
