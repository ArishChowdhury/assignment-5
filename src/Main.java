import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Temperature Converter Menu:");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Convert Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (5.0 / 9) * (fahrenheit - 32);
                System.out.printf("Temperature in Celsius: %.2f\n", celsius);
                break;

            case 2:
                // Convert Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit = 1.8 * celsius + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
                break;

            default:
                // Invalid choice
                System.out.println("Invalid choice! Please select option 1 or 2.");
        }

        scanner.close();
    }
}