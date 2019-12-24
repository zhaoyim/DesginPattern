package design.patterns.abstractFactory;

public class ShapeFactory extends AbstractFactory {
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equals("CIRCLE")) {
            return new Circle();
        }
        if (shape.equals("SQUARE")) {
            return new Square();
        }
        if (shape.equals("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
