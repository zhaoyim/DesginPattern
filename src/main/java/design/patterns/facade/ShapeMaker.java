package design.patterns.facade;

public class ShapeMaker {

    private Shape circle;
    private Shape square;
    private Rectangle rectangle;

    public ShapeMaker(Shape circle, Shape square, Rectangle rectangle) {
        this.circle = circle;
        this.square = square;
        this.rectangle = rectangle;
    }


    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

}
