public class Parallelogram implements Figure{
    public double baseSide;
    public double side;
    public double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }
    @Override
    public double getArea() {
        return height*baseSide;
    }

    @Override
    public double getPerimeter() {
        return 2*baseSide+2*side;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
}