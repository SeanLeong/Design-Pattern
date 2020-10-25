package Structure.FlyWeight;

/**
 * @ClassName: Milk
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/22 10:14
 */
public class Milk {
    /*
        牛奶的外部属性
     */
    private String brand;
    private String price;
    private MilkType milkType;

    public Milk(String brand, String price, MilkType milkType) {
        this.brand = brand;
        this.price = price;
        this.milkType = milkType;
    }

    public void getInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Milk{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", milkType=" + milkType.toString() +
                '}';
    }
}
