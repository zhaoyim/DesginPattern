package design.patterns.factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equals("CIRCLE")) {
            return new Circle();
        }
        if (type.equals("RECTANGLE")) {
            return new Rectangle();
        }
        if (type.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
