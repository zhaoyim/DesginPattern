package design.patterns.prototype;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    void draw() {
        System.out.println("Inside Circle:: draw() method.");
    }
}
