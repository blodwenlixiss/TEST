package testAutomation.javaoop.figures;

public class Circle {
    private double Radius;
    public static int numberOfCircleInstances;

    public Circle(double radius) {
        this.Radius = radius;
        numberOfCircleInstances++;
    }

    public double GetRadius() {
        return this.Radius;
    }

    public void SetRadius(double radius) {
        this.Radius = radius;
    }
    public static int getNumberOfCircleInstances() {
        return numberOfCircleInstances;
    }
}
