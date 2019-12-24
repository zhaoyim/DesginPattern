package design.patterns.builder;

public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
}
