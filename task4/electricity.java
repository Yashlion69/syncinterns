//Task-4 Elctricity Billing System
import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = calculateBillAmount(unitsConsumed);

        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: $" + billAmount);
    }

    private static double calculateBillAmount(int unitsConsumed) {
        double billAmount = 0;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 0.75;
        } else if (unitsConsumed > 100 && unitsConsumed <= 200) {
            billAmount = 100 * 0.75 + (unitsConsumed - 100) * 1.25;
        } else if (unitsConsumed > 200 && unitsConsumed <= 300) {
            billAmount = 100 * 0.75 + 100 * 1.25 + (unitsConsumed - 200) * 1.5;
        } else {
            billAmount = 100 * 0.75 + 100 * 1.25 + 100 * 1.5 + (unitsConsumed - 300) * 1.75;
        }

        return billAmount;
    }
}