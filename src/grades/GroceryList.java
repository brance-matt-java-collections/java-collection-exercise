package grades;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to create a grocery list?");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") ){



        }else {
            System.out.println("No problem, have great day!");
        }
    }



}

