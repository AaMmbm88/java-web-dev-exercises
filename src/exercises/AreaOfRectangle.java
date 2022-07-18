package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rectangle length in inches: ");
        Double rectLength = input.nextDouble();

        System.out.println("Enter rectangle width in inches: ");
        Double rectWidth = input.nextDouble();

        Double area = rectLength * rectWidth;

        System.out.println("The area of the rectangle is " + area + " inches." );
    }
}
