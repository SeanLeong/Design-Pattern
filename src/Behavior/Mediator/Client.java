package Behavior.Mediator;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/27 14:57
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcernMediator();
        Components components1 = new ConcernComponents();
        Components components2 = new ConcernComponents();
        Components components3 = new ConcernComponents();
        Components components4 = new ConcernComponents();

        mediator.register(components1);
        mediator.register(components2);
        mediator.register(components3);
        mediator.register(components4);

        components1.send();


    }
}
