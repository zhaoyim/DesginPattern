package design.patterns.bridge;

public class RedCircle implements DrawAPI {
    public void draw(int radius, int x, int y) {
        System.out.println("Draw Circle[color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
