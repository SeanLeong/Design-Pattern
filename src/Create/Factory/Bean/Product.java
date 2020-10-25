package Create.Factory.Bean;

/**
 * @ClassName: Product
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/17 9:52
 */
public class Product {
    private String name;
    private String weight;
    private String price;

    public Product(String name, String weight, String price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
