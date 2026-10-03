import java.util.Scanner;

public class TotalWaste {

    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double point1Waste, point2Waste, totalWaste;

        System.out.print("Enter waste collected at point 1 (kg): ");
        point1Waste = sc.nextDouble();

        System.out.print("Enter waste collected at point 2 (kg): ");
        point2Waste = sc.nextDouble();

        totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total Waste Collected: " + totalWaste + " kg");

        sc.close();
    }
}
