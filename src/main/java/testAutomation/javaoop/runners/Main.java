package testAutomation.javaoop.runners;

import testAutomation.javaoop.figures.Circle;
import testAutomation.javaoop.figures.Rectangle;
import testAutomation.javaoop.figures.Triangle;
import testAutomation.javaoop.util.Util;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        Random random = new Random();
//
//        for (int i = 0; i < 5; i++) {
//            var circle = new Circle(random.nextInt(20));
//            System.out.println(Circle.getNumberOfCircleInstances());
//            var result = Util.CircleToString(circle);
//            System.out.println(result);
//        }
//

        var rectangle = new Rectangle(13.0, 16.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        var rectangle2 = new Rectangle(10.0, 15.0);
        System.out.println("Rectangle1 Area: " + rectangle2.getArea());
        System.out.println("Rectangle1 Perimeter: " + rectangle2.getPerimeter());

        var triangle = new Triangle(13.0, 16.0, 22.0);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        Util.compareRectangles(rectangle, rectangle2);
    }
}