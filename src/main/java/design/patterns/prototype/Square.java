package design.patterns.prototype;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
