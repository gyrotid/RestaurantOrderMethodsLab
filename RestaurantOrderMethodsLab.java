import java.util.Scanner;
 
public class RestaurantOrder {
 
    // Method to display the menu
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Burger - $5.99");
        System.out.println("2. Pizza - $8.99");
        System.out.println("3. Salad - $4.99");
        System.out.println("4. Soda - $1.99");
    }
 
    // Method to get the price of an item based on selection
    public static double getItemPrice(int itemNumber) {
        // TODO: Implement logic to return the price based on itemNumber
        double itemPrice;

        if (itemNumber == 1)
        {
            itemPrice = 5.99;
        }
        else if (itemNumber == 2)
        {
            itemPrice = 8.99;
        }
        else if (itemNumber == 3)
        {
            itemPrice = 4.99;
        }
        else if (itemNumber == 4)
        {
            itemPrice = 1.99;
        }
        else itemPrice = 0.0;
        
        return itemPrice;
    }
 
    // Method to take an order from the user
    public static void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        
        System.out.println("Enter the item number to order (0 to finish): ");
        
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) break;
            else if (choice >= 1 && choice <= 4)
                totalCost = totalCost + getItemPrice(choice);
            // TODO: Call getItemPrice() and update totalCost
        }
 
        // TODO: Display total cost
       System.out.println("Calculating total now...");
       totalCost = calculateTotal(totalCost);
       System.out.println("Your total is: " + totalCost + ".");
    }
 
    // Overloaded method to apply a discount
    public static double calculateTotal(double totalCost) {
        // TODO: Implement method to return total cost
       Scanner scanner = new Scanner(System.in);
         System.out.println("Do you plan to use a discount? (True for yes, False for no): ");
        boolean isDiscount = scanner.nextBoolean();
        if (isDiscount == true)
        {
            totalCost = calculateTotal(totalCost, 0.15);
        }
        else if (isDiscount == false)
        {
            totalCost = calculateTotal(totalCost, 0.0);
        }
       return totalCost;
    }
 
    public static double calculateTotal(double totalCost, double discount) {
        // TODO: Implement method to return total cost after discount
        double discountCost = (totalCost * discount);
            totalCost = totalCost - discountCost;
        return totalCost;
    }
 
    // Main method to run the program
    public static void main(String[] args) {
        displayMenu();
        takeOrder();
    }
}
