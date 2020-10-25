package Create.Factory;

import Create.Factory.Bean.Product;

/**
 * @ClassName: ProductAFactory
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/17 10:29
 */
public class ProductBFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return  new Product("产品B", "200", "200");
    }
}
