import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the units consumed: ");
        int unitsConsumed = scanner.nextInt();
        scanner.close();

        double totalAmount = calculateBill(unitsConsumed);
        System.out.println("Total amount to be paid: Rs. " + totalAmount);
    }

    public static double calculateBill(int unitsConsumed) {
        double unitCharge;

        if (unitsConsumed <= 199) {
            unitCharge = 1.20;
        } else if (unitsConsumed >= 200 && unitsConsumed < 400) {
            unitCharge = 1.50;
        } else if (unitsConsumed >= 400 && unitsConsumed < 600) {
            unitCharge = 1.80;
        } else {
            unitCharge = 2.00;
        }

        double totalBill = unitsConsumed * unitCharge;

        if (totalBill > 400) {
            totalBill += totalBill * 0.15; // 15% surcharge
        } else if (totalBill < 400) {
            totalBill = Math.max(totalBill, 100); // Minimum surcharge of Rs. 100
        }

        return totalBill;
    }
}
