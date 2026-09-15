package testAutomation.javaoop.util;

import testAutomation.javaoop.figures.Circle;
import testAutomation.javaoop.figures.Rectangle;

public class Util {
    public static String CircleToString(Circle circle) {
        return "Circle: radius - " + circle.GetRadius();
    }

    public static void compareRectangles(Rectangle r1, Rectangle r2) {
        if (r1.getPerimeter() > r2.getPerimeter()) {
            System.out.println("Rectangle with Perimeter: " + r1.getPerimeter() + " is greater than " + r2.getPerimeter());
        } else if (r1.getPerimeter() < r2.getPerimeter()) {
            System.out.println("Rectangle with Perimeter: " + r2.getPerimeter() + " is greater than " + r1.getPerimeter());
        } else {
            System.out.println("Rectangles are equal");
        }
    }
}
