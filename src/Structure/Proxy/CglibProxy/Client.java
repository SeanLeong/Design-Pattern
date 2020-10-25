package Structure.Proxy.CglibProxy;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/23 21:06
 */
public class Client {
    public static void main(String[] args) {
        ATM atm = new ATM();
        ProxyFactory factory = new ProxyFactory(atm);
        ATM atmProxy = (ATM) factory.newProxyInstance();
        atmProxy.getMoney(1000);
    }
}
