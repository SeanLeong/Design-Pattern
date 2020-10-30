package Behavior.Memento;

/**
 * @ClassName: Memento
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 16:42
 */
public class Memento {

    /**
     * 备忘录，我们这里不一定要记录原发类的所有的属性
     * 备忘录也开始是抽象的接口，让具体类去实现，我这里依旧从简
     */
    private String name;
    private String chapter;
    private String status;
    private String time;

    public Memento(String name, String chapter, String status, String time) {
        this.name = name;
        this.chapter = chapter;
        this.status = status;
        this.time = time;
    }

    /*
        下面的都是get方法，参数在构造器进行初始化，之后就在不允许修改
     */
    public String getName() {
        return name;
    }

    public String getChapter() {
        return chapter;
    }

    public String getStatus() {
        return status;
    }

    public String getTime() {
        return time;
    }

    public String getInfo(){
        return "Memento{" +
                "name='" + name + '\'' +
                ", chapter='" + chapter + '\'' +
                ", status='" + status + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
