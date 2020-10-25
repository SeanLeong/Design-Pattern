package Structure.Adapter;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/17 15:44
 */
public class Client {
    public static void main(String[] args) {
        PhoneCharger charger = new Adapter(new ChinaPower());
        charger.getLowPower();
        PhoneCharger charger2 = new Adapter(new JapanPower());
        charger2.getLowPower();
    }
}
