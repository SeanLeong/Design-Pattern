package Structure.Proxy.Static;

/**
 * @ClassName: BankProxy
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/23 16:38
 */
public class BankProxy implements  Bank{
    private Bank bank;

    public BankProxy(Bank bank) {
        this.bank = bank;
    }

    //方案2
    public BankProxy() {
        this.bank = new ATM();
    }

    @Override
    public void getMoney(int money) {
        System.out.print("银行代理:");
        bank.getMoney(money);
        System.out.println("扣除手续费：" + Float.valueOf(money) * 0.001 + "元");
    }
}
