package Create.Factory;


import Create.Factory.Bean.Product;

/**
 * @ClassName: Test
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/10 21:56
 */
public class Test {
    public static void main(String[] args) {
        /*
            使用工厂类创建产品,根据自己实际的需求，找到对应工厂的具体实现类
            工厂模式的尽管可以保证开闭原则，但是使用起来会产生大量的类，不利于管理。
         */
        ProductFactory productFactory = new ProductAFactory();
        Product A = productFactory.createProduct();
        productFactory = new ProductBFactory();
        Product B = productFactory.createProduct();
        productFactory = new ProductCFactory();
        Product C = productFactory.createProduct();

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());

    }
}
