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
        for(GroceryItem item : bigList){
            if(item.getCategory().equalsIgnoreCase("Dairy")){
                System.out.println(item.getName() + "| Number to Buy: " + item.getQuantity() + "| Category: " + item.getCategory());
            }
        }
    }

    public static void printProduce(){
        for(GroceryItem item : bigList){
            if(item.getCategory().equalsIgnoreCase("Produce")){
                System.out.println(item.getName() + "| Number to Buy: " + item.getQuantity() + "| Category: " + item.getCategory());
            }
        }
    }

    public static void printBread(){
        for(GroceryItem item : bigList){
            if(item.getCategory().equalsIgnoreCase("Bread")){
                System.out.println(item.getName() + "| Number to Buy: " + item.getQuantity() + "| Category: " + item.getCategory());
            }
        }
    }

    public static void printMeat(){
        for(GroceryItem item : bigList){
            if(item.getCategory().equalsIgnoreCase("Meat")){
                System.out.println(item.getName() + "| Number to Buy: " + item.getQuantity() + "| Category: " + item.getCategory());
            }
        }
    }

    public static void printFrozenFood(){
        for(GroceryItem item : bigList){
            if(item.getCategory().equalsIgnoreCase("Frozen Food")){
                System.out.println(item.getName() + "| Number to Buy: " + item.getQuantity() + "| Category: " + item.getCategory());
            }
        }
    }

    public static void printNonfood(){
        for(GroceryItem item : bigList){
            if(item.getCategory().equalsIgnoreCase("Bread")){
                System.out.println(item.getName() + "| Number to Buy: " + item.getQuantity() + "| Category: " + item.getCategory());
            }
        }
    }

    public static void sortAlpha(){
        int length = bigList.size();
        String[] tempArray = new String[length];
        for (int i = 0; i < length; i++){
            tempArray[i] = bigList.get(i).getName();
        }

        Arrays.sort(tempArray);

        for()

    }

}
