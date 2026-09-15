package testAutomation.javaoop.runners;

import testAutomation.javaoop.figures.Circle;
import testAutomation.javaoop.util.Util;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            var circle = new Circle(random.nextInt(20));
            System.out.println(Circle.getNumberOfCircleInstances());
            var result = Util.CircleToString(circle);
            System.out.println(result);
        }


    }
}