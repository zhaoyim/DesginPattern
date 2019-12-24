package design.patterns.builder;

public class ChickenBurger extends Burger {
    public String name() {
        return "Chicken Burger";
    }

    public float price() {
        return 50f;
    }
}
