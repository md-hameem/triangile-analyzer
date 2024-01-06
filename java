import java.util.Scanner;

public class TriangleAnalyzer {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first angle of the triangle: ");
        double angleA = inputScanner.nextDouble();

        System.out.print("Enter the second angle of the triangle: ");
        double angleB = inputScanner.nextDouble();

        System.out.print("Enter the third angle of the triangle: ");
        double angleC = inputScanner.nextDouble();

        if (isValidTriangle(angleA, angleB, angleC)) {
            if (isRightAngleTriangle(angleA, angleB, angleC)) {
                System.out.println("The triangle is a right-angle triangle.");
            } else if (isObtuseTriangle(angleA, angleB, angleC)) {
                System.out.println("The triangle is an obtuse triangle.");
            } else {
                System.out.println("The triangle is an acute triangle.");
            }
        } else {
            System.out.println("Invalid input. The angles do not form a valid triangle.");
        }

        inputScanner.close();
    }

    private static boolean isValidTriangle(double angleA, double angleB, double angleC) {
        return angleA + angleB + angleC == 180;
    }

    private static boolean isRightAngleTriangle(double angleA, double angleB, double angleC) {
        return angleA == 90 || angleB == 90 || angleC == 90;
    }

    private static boolean isObtuseTriangle(double angleA, double angleB, double angleC) {
        return angleA > 90 || angleB > 90 || angleC > 90;
    }
}
