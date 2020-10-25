package Structure.Proxy.Dynamic;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/23 19:52
 */
public class Client {

    public static void main(String[] args) {
        Bank atm = new ATM();
        //给工厂传入需要代理的接口类
        ProxyFactory factory = new ProxyFactory(atm);
        //使用工厂类创建一个代理对象
        Bank bank = (Bank)factory.newBankProxyInstance();
        //使用代理对象调用方法
        bank.getMoney(1000);
    }
}
