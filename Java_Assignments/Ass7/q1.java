import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double numerator = sc.nextDouble();

        while (true) {
            try {
                System.out.print("Enter denominator: ");
                double denominator = sc.nextDouble();
                System.out.println("Result of " + numerator + "/" + denominator + " is: " + numerator / denominator);
                return;
            } catch (ArithmeticException e) {
                System.out.println("Denominator cannot be zero, Enter again...");
            }
        }
    }
}
