package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to create a grocery list?");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") ){
            createList();
        }else {
            System.out.println("No problem, have great day!");
        }
    }

    private static HashMap<String, String> groceryList = new HashMap<>();

    private static void createList(){
        Scanner input = new Scanner(System.in);
        System.out.println("What category will your item be in?\n1: Dairy\n2: Produce\n3: Bread\n4: Meat\n5: Frozen Food\n6: Nonfood");
        int categorySelection = getInt(1, 6);
        String categoryString = "";
        if(categorySelection == 1){
            categoryString = "Dairy";
        }else if(categorySelection == 2){
            categoryString = "Produce";
        } else if(categorySelection == 3){
            categoryString = "Bread";
        } else if(categorySelection == 4){
            categoryString = "Meat";
        } else if(categorySelection == 5){
            categoryString = "Frozen Food";
        } else if(categorySelection == 6){
            categoryString = "Nonfood";
        }
        System.out.println("What is the item's name?");
        String itemName = input.nextLine();
        System.out.println("How many would you like to buy?");
        int numberToBuy = getInt();
        groceryList.put(itemName,itemName + ": " + categoryString + "| Number to buy: " + numberToBuy);

        System.out.println("Add another item or finalize list?\n1: Add another item\n2: Finalize list\n\n\n");
        int addAnotherItem = getInt(1, 2);
        if(addAnotherItem == 1){
            createList();
        }else if(addAnotherItem == 2) {
            finalizeFunction();
        }
    }

    public static int getInt(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        String userInput = input.nextLine();
        int userInt;
        if(userInput.matches(".*\\d.*")){
            userInt = Integer.parseInt(userInput);
        } else {
            System.out.println("That's an invalid input. Try again.");
            return getInt(min, max);
        }
        if (userInt < min || userInt > max){
            System.out.println("That's an invalid range. Try again.");
            return getInt(min, max);
        }else {
            return userInt;
        }

    }

    public static int getInt() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if(userInput.matches(".*\\d.*")){
            return Integer.parseInt(userInput);
        } else {
            System.out.println("That isn't an integer. Try again.");
            return getInt();
        }

    }

    public static void finalizeFunction(){
        String dairyItems = "";
        String produceItems = "";
        String breadItems = "";
        String meatItems = "";
        String frozenItems = "";
        String nonfoodItems = "";

        for (String item : groceryList.values()){
            for(String itemKey : groceryList.keySet()){
                if(groceryList.get(itemKey).equalsIgnoreCase(item)){
                }
            }
            if(item.contains("Dairy")){
                for(String itemKey : groceryList.keySet()){
                    if(groceryList.get(itemKey).equalsIgnoreCase(item)){
                        dairyItems += groceryList.get(item) + "\n";
                    }
                }
            }else if(item.contains("Produce")){
                for(String itemKey : groceryList.keySet()){
                    if(groceryList.get(itemKey).equalsIgnoreCase(item)){
                        produceItems += groceryList.get(item) + "\n";
                    }
                }
            }else if(item.contains("Bread")){
                for(String itemKey : groceryList.keySet()){
                    if(groceryList.get(itemKey).equalsIgnoreCase(item)){
                        breadItems += groceryList.get(item) + "\n";
                    }
                }
            }else if(item.contains("Meat")){
                for(String itemKey : groceryList.keySet()){
                    if(groceryList.get(itemKey).equalsIgnoreCase(item)){
                        meatItems += groceryList.get(item) + "\n";
                    }
                }
            }else if(item.contains("Frozen Food")){
                for(String itemKey : groceryList.keySet()){
                    if(groceryList.get(itemKey).equalsIgnoreCase(item)){
                        frozenItems += groceryList.get(item) + "\n";
                    }
                }
            }else if(item.contains("Nonfood")){
                for(String itemKey : groceryList.keySet()){
                    if(groceryList.get(itemKey).equalsIgnoreCase(item)){
                        nonfoodItems += groceryList.get(item) + "\n";
                    }
                }
            }
        }

        String finalList = dairyItems + produceItems + breadItems + meatItems + frozenItems + nonfoodItems;

        System.out.println(finalList);
    }

}
