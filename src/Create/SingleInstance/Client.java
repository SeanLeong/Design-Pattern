package Create.SingleInstance;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/20 11:00
 */
public class Client {
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            Lazy instance = Lazy.getInstance();
        }

        for(int i=0; i<100; i++){
            Hungry hungry = Hungry.getInstance();
        }
    }
}
