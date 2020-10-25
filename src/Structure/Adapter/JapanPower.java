package Structure.Adapter;

/**
 * @ClassName: JapanPower
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/17 15:57
 */
public class JapanPower implements Power{


    /*
    日本的电压110V
     */
    @Override
    public void getHightPower() {
        System.out.println("提供110V高电压");
    }
}
