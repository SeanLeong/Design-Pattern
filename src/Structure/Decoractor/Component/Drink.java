package Structure.Decoractor.Component;

public abstract class Drink {

    private float price = 0.0f;
    private String name;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract float cost();

    public abstract String desc();
}
