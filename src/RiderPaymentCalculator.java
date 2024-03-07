import java.util.Scanner;

public class RiderPaymentCalculator  {
    public static double calculatePayment(int successfulDeliveries) {
        double baseWage = 10.0;
        double wagePerDelivery = 2.0;

        double totalWage;

        if (successfulDeliveries >= 0 && successfulDeliveries <= 5) {
            totalWage = baseWage;
        } else if (successfulDeliveries > 5 && successfulDeliveries <= 10) {
            totalWage = baseWage + (wagePerDelivery * (successfulDeliveries - 5));
        } else {
            totalWage = baseWage + (wagePerDelivery * 5) + (wagePerDelivery * 1.5 * (successfulDeliveries - 10));
        }

        return totalWage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of successful deliveries: ");
        int successfulDeliveries = scanner.nextInt();

        double riderPayment = calculatePayment(successfulDeliveries);

        System.out.println("Your  payment for the day is: $" + riderPayment);

        scanner.close();
    }
}