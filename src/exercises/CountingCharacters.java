package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class CountingCharacters {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter passage to be evaluated: ");
        String inputPassage = input.nextLine();
        System.out.println(inputPassage);
//        String inputPassage = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInPassage = inputPassage.toLowerCase().toCharArray();
//        System.out.println(charactersInPassage[0]);
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : charactersInPassage){
            int count = 0;
            for (int i = 0; i < charactersInPassage.length; i++){
                if (Character.isLetter(c)){
                    if (c == charactersInPassage[i]) {
                        count++;
                        do{
                            charCount.put(c, count);

                        } while  (!charCount.containsKey(c));
                    }
                }

            }
        }
        for (Map.Entry<Character,Integer> item:charCount.entrySet()){
            System.out.println(String.format("%s: %s", item.getKey(), item.getValue()));
        }

    }

}
