
import java.util.Scanner;

class u {
    public static void main(String[] args) {

        // What do I need?
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0.0;

        // Get number of items to scan
        System.out.println("Enter the number of items you would you like to scan:");

        // Create loop to iterate through all of the items and accumulate the costs
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }

        // Print total
        System.out.println("Your total is $" + total);

        scanner.close();
    }
}
