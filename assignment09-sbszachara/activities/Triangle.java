package activities;
public class Triangle extends Shape {
    private double side;

    public Triangle(position pos, String fillColor, String lineColor, double s) {
        super(pos, fillColor, lineColor);
        this.side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(new position(), "blue", "purple", 10);
    }
    @Override
    public double Area() {
        return (Math.sqrt(3) / 4) * (side * side);
    }
}
