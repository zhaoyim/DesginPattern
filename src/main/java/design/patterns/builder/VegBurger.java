package design.patterns.builder;

public class VegBurger extends Burger {
    public String name() {
        return "Veg Burger";
    }

    public float price() {
        return 25f;
    }
}
