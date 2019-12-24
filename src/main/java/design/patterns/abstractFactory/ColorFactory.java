package design.patterns.abstractFactory;

public class ColorFactory extends AbstractFactory {
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equals("RED")) {
            return new Red();
        }
        if (color.equals("BLUE")) {
            return new Blue();
        }
        if (color.equals("GREEN")) {
            return new Green();
        }
        return null;
    }

    public Shape getShape(String shape) {
        return null;
    }
}
