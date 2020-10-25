package Create.Builder.Bean;

/**
 * @ClassName: Food
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/13 16:31
 */
public class Food extends Good{

    private String name = "默认套餐";
    private double price = 100;
    private int weight = 100;
    private int number = 100;

    public Food() {
    }

    public Food(String name, double price, int weight, int number) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", number=" + number +
                '}';
    }
}
