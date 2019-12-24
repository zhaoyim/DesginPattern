package design.patterns.bridge;

public class GreenCircle implements DrawAPI {
    public void draw(int radius, int x, int y) {
        System.out.println("Draw Circle[color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
