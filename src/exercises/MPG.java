package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven: ");
        Double milesDriven = input.nextDouble();

        System.out.println("How much gas have you consumed (in gallons): ");
        Double gasConsumed = input.nextDouble();

        Double mpg = milesDriven / gasConsumed;

        System.out.println("You have gotten " + mpg + " miles per gallon on this trip." );
    }
}
