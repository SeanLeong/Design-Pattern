package Create.Builder.Bean;

/**
 * @ClassName: Drink
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/13 16:55
 */
public class Drink extends Good{

    private String name = "默认饮料";
    private double price = 100;
    private int weight = 100;
    private int number = 100;

    public Drink() {
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
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", number=" + number +
                '}';
    }
}
