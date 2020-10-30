package Structure.Bridge;

import Structure.Bridge.Brand.Brand;

/**
 * @ClassName: Device
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/19 10:11
 */
public abstract class Device {

    /**
     * Device充当了Bridge的角色。将设备（Device）和品牌（Brand）连接起来
     * Brand聚合到Device中，因为Brand是一个抽象的接口，从而降低耦合关系
     */
    protected Brand brand;
    public Device(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        brand.info();
    }
}

class Phone extends Device{

    public Phone(Brand brand) {
        super(brand);
    }

    public void info() {
        super.info();
        System.out.println("手机");
    }
}

class Laptop extends Device{

    public Laptop(Brand brand) {
        super(brand);
    }

    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}