package Create.SimpleFactory;


import Create.SimpleFactory.Bean.Product;

/**
 * @ClassName: ProductFactory
 * @Description:题目工厂类（工厂方法模式）
 * @author: SeanLeong
 * @date: 2020/10/10 20:25
 */
public class ProductFactory {

    public final static String A = "A";
    public final static String B = "B";
    public final static String C = "C";


    //使用一个简单工厂方法来创建对象
    public Product createProduct(String type){
        /*
            简单工厂模式：
                用户传入想要创建的对象实例类型，由工厂负责创建并返回
                type就是传入的对象实例类型，工厂创建的可以是不同的类（或由继承自一个类），也可以是同一个类，但是参数不同。
                懒得写那么多bean了，直接就一个product，传入不同的参数
         */
        Product product = null;
        switch (type){
            case A:
                product = new Product("产品A", "100", "100");
                break;
            case B:
                product = new Product("产品B", "200", "200");
                break;
            case C:
                product = new Product("产品B", "300", "300");
                break;
        }
        return product;
    }

}
