package Structure.Adapter;

/**
 * @ClassName: Adapter
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/17 16:01
 */
public class Adapter implements PhoneCharger{
    private Power power;
    public Adapter(Power power) {
        this.power = power;
    }

    /*
            充电器和插座之间适配器
         */
    @Override
    public void getLowPower() {
        //插座提供电
        power.getHightPower();
        System.out.println("转为手机能接受的低电压");
    }

}
