package design.patterns.builder;

public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

}
