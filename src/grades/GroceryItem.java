package grades;

import java.util.Scanner;

public class GroceryItem {
    private String name;
    private int quantity;
    private String category;

//    Constructor
    public  GroceryItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name the item: ");
        this.name = input.nextLine();
        System.out.println("How many would you like to buy: ");
        this.quantity = Integer.parseInt(input.nextLine());


        System.out.println("What category will your item be in?\n1: Dairy\n2: Produce\n3: Bread\n4: Meat\n5: Frozen Food\n6: Nonfood");
        int categorySelection = GroceryList.getInt(1, 6);

         if(categorySelection == 1){
            this.category = "Dairy";
        }else if(categorySelection == 2){
             this.category = "Produce";
        } else if(categorySelection == 3){
             this.category = "Bread";
        } else if(categorySelection == 4){
             this.category = "Meat";
        } else if(categorySelection == 5){
             this.category = "Frozen Food";
        } else if(categorySelection == 6){
             this.category = "Nonfood";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;

    }


}



