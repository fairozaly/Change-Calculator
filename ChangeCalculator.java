import java.util.Scanner;

public class ChangeCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declare variables for coin counts
        float quarters, dimes, nickels, pennies;

        // Prompt the user for input
        System.out.println("How many quarters do you have? ");
        quarters = input.nextFloat();
        
        System.out.println("How many dimes do you have? ");
        dimes = input.nextFloat();
        
        System.out.println("How many nickels do you have? ");
        nickels = input.nextFloat();
        
        System.out.println("How many pennies do you have? ");
        pennies = input.nextFloat();
        input.close();

        // Validate inputs to ensure that there are no negative values
        if(quarters < 0 || dimes < 0 || nickels < 0 || pennies < 0){
            System.out.println("Invalid input. Please enter positive values.");
            return;
        }

        // Calculate the total
        float totalDollars = (quarters * 0.25f) + (dimes * 0.10f) + (nickels * 0.05f) + (pennies * 0.01f);
        
        // Dipsplay the results
        System.out.printf("You have $%.2f dollars.%n", totalDollars); // Format to 2 decimal places
    }
}