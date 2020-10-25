package Structure.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: City
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/21 9:39
 */
public class City extends Unit {
    private List<Unit> collegeList = new ArrayList<>();

    public City(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void getInfo() {
        System.out.println("城市名:" + super.getName() + ",描述：" + super.getDesc());
        System.out.println("================================");
        for(Unit unit : collegeList){
            unit.getInfo();
        }
    }

    @Override
    protected void add(Unit unit) {
        collegeList.add(unit);
    }

}
