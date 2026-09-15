package testAutomation.javaoop.figures;

public class Rectangle extends Figure {
    private double A;
    private double B;

    public Rectangle(Double A, Double B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public double getArea() {
        return this.A * this.B;
    }

    @Override
    public double getPerimeter() {
        return (this.A + this.B) * 2;
    }
}
