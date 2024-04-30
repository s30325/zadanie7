public class Rectangle implements Figure{
    public double sideA;
    public double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double getArea() {
        return sideA*sideB;
    }

    @Override
    public double getPerimeter() {
        return 2*sideA+2*sideB;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}

