package Behavior.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Caretaker
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 17:01
 */
public class Caretaker {
    /*
        备忘录类，用于保存不同时期的快照信息
     */

    List<Memento> mementoList;
    int recentIndex;

    public Caretaker() {
        this.mementoList = new ArrayList<>();
        recentIndex = -1;
    }

    public void add(Memento memento){
        mementoList.add(memento);
        recentIndex++;
    }

    public Memento getRecent(){
        if(recentIndex > 0)
            return mementoList.get(recentIndex--);
        else
            return mementoList.get(0);
    }
}
