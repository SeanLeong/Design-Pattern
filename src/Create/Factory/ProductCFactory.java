package Create.Factory;

import Create.Factory.Bean.Product;
import Create.Factory.ProductFactory;

/**
 * @ClassName: ProductAFactory
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/17 10:29
 */
public class ProductCFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return  new Product("产品C", "300", "300");
    }
}
