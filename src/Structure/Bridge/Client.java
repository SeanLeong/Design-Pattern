package Structure.Bridge;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/19 10:17
 */
public class Client {

    public static void main(String[] args) {
        //创建一个苹果电脑
        Laptop appleLaptop = new Laptop(new Apple());
        appleLaptop.info();
        //创建华为手机
        Phone huaweiPhone = new Phone(new HuaWei());
        huaweiPhone.info();

    }
}
