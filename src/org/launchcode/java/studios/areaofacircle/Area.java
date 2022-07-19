package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of circle in parsecs: ");
        Double circleRadius = input.nextDouble();

        while (circleRadius < 0){
            System.out.println("Error, radius must be a positive number. Please re-enter radius of circle.");
            circleRadius = input.nextDouble();
        };

        Double area = getArea(circleRadius);

        System.out.println("The area of a circle of " + circleRadius + "is " + area + " parsecs." );
    }
}
