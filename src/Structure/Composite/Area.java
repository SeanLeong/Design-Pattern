package Structure.Composite;

/**
 * @ClassName: Area
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/21 10:21
 */
public class Area extends Unit {

    public Area(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void getInfo() {
        System.out.println("区的名称：" + super.getName() + ",它的描述：" + super.getDesc());
    }

}
