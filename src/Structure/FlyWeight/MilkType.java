package Structure.FlyWeight;

/**
 * @ClassName: MilkType
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/22 10:09
 */
public class MilkType {
    /**
     * 我们把牛奶设置为一个“享元”，将内部状态放入里头
     */

    //类型：盒装、瓶装、袋装。。。
    private String type;

    //容量
    private int capacity;

    /*
        享元不提供修改属性的方法，只给一个构造器用于创建
        该类中的属性就是内部属性，重复高
     */
    public MilkType(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void getInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "MilkType{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
