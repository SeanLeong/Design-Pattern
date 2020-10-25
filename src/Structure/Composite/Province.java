package Structure.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Province
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/21 9:32
 */
public class Province extends Unit {

    private List<Unit> cityList = new ArrayList<>();

    public Province(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Unit unit){
        cityList.add(unit);
    }

    @Override
    public void getInfo() {
        System.out.println("省名:" + super.getName() + ",描述：" + super.getDesc());
        System.out.println("================================");
        for(Unit unit : cityList){
            unit.getInfo();
        }
    }


}
