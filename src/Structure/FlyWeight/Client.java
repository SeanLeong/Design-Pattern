package Structure.FlyWeight;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/22 10:27
 */
public class Client {

    public static void main(String[] args) {
        MilkType dz = MilkFactory.getMilkType(MilkFactory.DZ);
        Milk ytdz = new Milk("燕塘", "3.5", dz);
        ytdz.getInfo();


        MilkType hz = MilkFactory.getMilkType(MilkFactory.HZ);
        Milk ythz = new Milk("燕塘", "4.5", hz);
        ythz.getInfo();

        MilkType hz2 = MilkFactory.getMilkType(MilkFactory.HZ);
        Milk mnhz = new Milk("蒙牛", "2.5", hz2);
        mnhz.getInfo();

        System.out.println(MilkFactory.getTypeNum());
    }
}
