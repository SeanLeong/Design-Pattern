package Create.SimpleFactory;

import Create.SimpleFactory.Bean.Product;

/**
 * @ClassName: Test
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/10 20:45
 */
public class Test {

    public static void main(String[] args) {
        //使用工厂类创建产品
        ProductFactory productFactory = new ProductFactory();
        Product A = productFactory.createProduct(ProductFactory.A);
        Product B = productFactory.createProduct(ProductFactory.B);
        Product C = productFactory.createProduct(ProductFactory.C);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        /*
            简单工厂的好处：
                用户不用关心对象实例是怎么创建的，只需要知道工厂并且传入一个需要的实例类型，就能拿到对应的类
                如果实例的创建比较简单就不一定需要使用工厂模式，如果比较实例创建比较复杂并且可重复的话，可以考虑使用工厂模式
                简单工厂模式不需要创建很多的类，在实际开发中也更加常用，但是不符合开闭原则
         */
    }
}
