package Behavior.Memento;

/**
 * @ClassName: Originator
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 16:40
 */
public class Originator {
    /**
     * 原发类（它会产生一个快照，并交给备忘录记录）
     * 这个类可以是实现某个接口，我这里从简
     */

    private String name;
    private String chapter;
    private String status;
    private String time;

    public Originator(String name, String chapter, String status, String time) {
        this.name = name;
        this.chapter = chapter;
        this.status = status;
        this.time = time;
    }

    //保存当前的状态属性
    public Memento currState(){
        return new Memento(this.name, this.chapter, this.status, this.time);
    }

    //撤回到之前的状态属性
    public void revoke(Memento memento){
        this.name = memento.getName();
        this.chapter = memento.getChapter();
        this.status = memento.getStatus();
        this.time = memento.getTime();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", chapter='" + chapter + '\'' +
                ", status='" + status + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
