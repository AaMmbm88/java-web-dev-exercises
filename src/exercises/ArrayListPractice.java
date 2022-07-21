package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String [] args){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(10);
        integers.add(11);
        integers.add(12);
        integers.add(13);
        integers.add(14);
        integers.add(15);
        integers.add(16);
        integers.add(17);
        integers.add(18);

            int sum = 0;
            for (int i : integers) {
                if (i % 2 == 0) {
                    sum += i;

                }
            }
        System.out.println(sum);

            String[] wordsList = {"apple", "banana", "pear", "watermelon", "grape",
                    "lemon", "lime", "guava", "papaya", "blueberry",
                    "quince", "peach", "apricot", "plum"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of letters to search for: ");
        int numChars = input.nextInt();
            for (String fruit : wordsList){
                if (fruit.length() == numChars) {
                    System.out.println(fruit);
                }
            }
        }
        }


