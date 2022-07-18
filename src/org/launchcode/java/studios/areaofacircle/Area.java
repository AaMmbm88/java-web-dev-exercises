package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of circle in parsecs: ");
        Double circleRadius = input.nextDouble();

        if (circleRadius < 0 || circleRadius.isNaN()){
            System.out.println("Error, radius must be a positive number. Thank you and goodbye!");
            input.close();
        }

        Double area = getArea(circleRadius);

        System.out.println("The area of a circle of " + circleRadius + "is " + area + " parsecs." );
    }
}
