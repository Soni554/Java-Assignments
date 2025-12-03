import java.util.Scanner;
import btech.arithmetic.MyMath;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double lhs = sc.nextDouble();
        double rhs = sc.nextDouble();

        System.out.println("\nAddition: " + MyMath.add(lhs, rhs));
        System.out.println("Subtraction: " + MyMath.sub(lhs, rhs));
        System.out.println("Multiplication: " + MyMath.mul(lhs, rhs));
        System.out.println("Division: " + MyMath.div(lhs, rhs));
        System.out.println("Modulus: " + MyMath.mod(lhs, rhs));
    }
}