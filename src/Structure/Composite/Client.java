package Structure.Composite;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/21 10:25
 */
public class Client {

    public static void main(String[] args) {
        Unit province = new Province("广东省", "全国第一经济强省");

        Unit gz = new City("广州市", "广东省省会");
        Unit sz = new City("深圳市", "经济特区");
        province.add(gz);
        province.add(sz);

        Unit by = new Area("白云区", "不错的");
        Unit th = new Area("天河区", "挺好的");
        gz.add(by);
        gz.add(th);

        Unit ns = new Area("南山区", "可以的");
        Unit lg = new Area("龙岗区", "蛮好的");
        sz.add(ns);
        sz.add(lg);

        province.getInfo();



        sz.getInfo();
    }
}
