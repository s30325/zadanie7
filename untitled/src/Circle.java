public class Circle implements Figure {
    public double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}