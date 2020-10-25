package Create.SingleInstance;

/**
 * @ClassName: Lazy
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/20 10:56
 */
public class Lazy {
    /**
     * 实现一个懒汉的单例模式
     */
    private static Lazy lazy;

    /**
     * 构造器私用
     */
    private Lazy(){
        System.out.println("创建了一个Lazy对象，它的hasCode:" + this.hashCode());
    }


    /**
     * 这个方法有风险，在多线程的情况下
     * @return
     */
    public static Lazy getInstance(){
        if(lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }
}
