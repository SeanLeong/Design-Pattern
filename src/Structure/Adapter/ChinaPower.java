package Structure.Adapter;

/**
 * @ClassName: ChinaPower
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/17 16:00
 */
public class ChinaPower implements Power {
    @Override
    public void getHightPower() {
        System.out.println("提供220V高电压");
    }
}
