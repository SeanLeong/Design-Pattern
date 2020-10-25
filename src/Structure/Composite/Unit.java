package Structure.Composite;

/**
 * @ClassName: Unit
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/21 9:29
 */
public abstract class Unit {
    private String name;
    private String desc;

    public Unit(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected abstract void getInfo();

    protected void modifyInfo(String name, String desc){
        this.setName(name);
        this.setDesc(desc);
    }

    protected void add(Unit unit){
        throw new UnsupportedOperationException();
    }
}
