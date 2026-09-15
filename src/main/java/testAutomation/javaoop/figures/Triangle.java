package testAutomation.javaoop.figures;

public class Triangle extends Figure {

    private double A;
    private double B;
    private double C;
    private double H = 5;

    public Triangle(Double a, Double b, Double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    @Override
    public double getPerimeter() {
        return this.A + this.B + this.C;
    }

    @Override

    public double getArea() {
        return (this.H * this.C) / 2;
    }
}

