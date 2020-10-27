package Behavior.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcernMediator
 * @Description：便利店，他们是中介，与不同的批发商进行交互
 * @author: SeanLeong
 * @date: 2020/10/27 11:13
 */
public class ConcernMediator implements Mediator {

    /*
        中介实现类中通常需要保存各个组件的引用
     */
    private List<Components> componentsList;

    public ConcernMediator() {
        this.componentsList = new ArrayList<>();
    }

    /*
        register就是注册方法，组件需要将自己注册到具体的代理实现类中
     */
    @Override
    public void register(Components components) {
        if(!componentsList.contains(components)) {
            componentsList.add(components);
            components.setMediator(this);
        }
    }

    /*
        relay方法用于组件通知中介：具体的执行内容根据自己业务场景定义
        这里就是通知除了components的其他组件
     */
    @Override
    public void relay(Components components) {
        componentsList.forEach(c -> {
            if(!c.equals(components)){
                //组件接收通知
                c.receive();
            }
        });
    }
}
