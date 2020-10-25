package Behavior.Command.Action;

/**
 * @ClassName: DB
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/25 20:35
 */
public class DB {
    private String name;

    public DB(String name) {
        this.name = name;
    }

    private String getValue(String[] a){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            sb.append(a[i] + ",");
        }
        return sb.toString();
    }

    public void insert(String... a){
        System.out.println("在" + name + "插入数据:" + getValue(a));
    }

    public void delete(String... a){
        System.out.println("在" + name + "删除数据:" + getValue(a));
    }

    public void select(String... a){
        System.out.println("在" + name + "查询数据:" + getValue(a));
    }

    public void update(String a, String b){
        System.out.println("在" + name + "把" + a + "改成" + b);
    }
}
