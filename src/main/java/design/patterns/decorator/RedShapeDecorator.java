package design.patterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        setReadBorder(decoratorShape);
    }

    private void setReadBorder(Shape shape) {
        System.out.println("Border Color: Red");
    }

}
