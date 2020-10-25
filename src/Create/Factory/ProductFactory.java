package Create.Factory;


import Create.Factory.Bean.Product;

/**
 * @ClassName: ProductFactory
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/10 21:35
 */
public abstract class ProductFactory {
    /*
        这里定义一个产品工厂（可以是接口也开始是抽象类中的抽象方法），工厂里头定义工厂的行为方法
        具体实现的方法放到具体的工厂里面实现
     */
    public abstract Product createProduct();

}
