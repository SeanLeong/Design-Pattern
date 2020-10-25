package Create.SingleInstance;

/**
 * @ClassName: Hungry
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/20 11:03
 */
public class Hungry {

    /**
     * 直接创建起来，需要的直接返回
     */
    private static Hungry hungry = new Hungry();

    private Hungry() {
        System.out.println("创建了一个Hungry对象，他的hasCode:" + this.hashCode());
    }

    public static Hungry getInstance(){
        return hungry;
    }
}
