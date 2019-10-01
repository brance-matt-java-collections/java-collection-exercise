package grades;

import java.util.*;

public class GroceryList {
    private  static ArrayList<GroceryItem> bigList = new ArrayList<>();

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
    private static ArrayList<String> category = new ArrayList<>();

    private static void createList(){
        Scanner input = new Scanner(System.in);

        GroceryItem gitem = new GroceryItem();
        bigList.add(gitem);

        System.out.println("Add another item or finalize list?\n1: Add another item\n2: Finalize list\n\n\n");
        int addAnotherItem = getInt(1, 2);
        if(addAnotherItem == 1){
            createList();
        }else if(addAnotherItem == 2) {
            printDairy();
            printProduce();
            printBread();
            printMeat();
            printFrozenFood();
            printNonfood();

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

    public static void printDairy(){
        String[] sortedArray = sortAlpha();
        for(String item : sortedArray){
            if(item.contains("Dairy")){
                System.out.println(item);
            }
        }
    }

    public static void printProduce(){
        String[] sortedArray = sortAlpha();
        for(String item : sortedArray){
            if(item.contains("Produce")){
                System.out.println(item);
            }
        }
    }

    public static void printBread(){
        String[] sortedArray = sortAlpha();
        for(String item : sortedArray){
            if(item.contains("Bread")){
                System.out.println(item);
            }
        }
    }

    public static void printMeat(){
        String[] sortedArray = sortAlpha();
        for(String item : sortedArray){
            if(item.contains("Meat")){
                System.out.println(item);
            }
        }
    }

    public static void printFrozenFood(){
        String[] sortedArray = sortAlpha();
        for(String item : sortedArray){
            if(item.contains("Frozen Food")){
                System.out.println(item);
            }
        }
    }

    public static void printNonfood(){
        String[] sortedArray = sortAlpha();
        for(String item : sortedArray){
            if(item.contains("Nonfood")){
                System.out.println(item);
            }
        }
    }

    public static String[] sortAlpha(){
        int length = bigList.size();
        String[] tempArray = new String[length];
        for (int i = 0; i < length; i++){
            tempArray[i] = bigList.get(i).getName() + "| Number to Buy: " + bigList.get(i).getQuantity() + "| Category: " + bigList.get(i).getCategory() + "\n";
        }

        Arrays.sort(tempArray);
        return tempArray;

    }

}
