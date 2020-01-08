package design.patterns.flyweight;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> circles = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circles.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circles.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
