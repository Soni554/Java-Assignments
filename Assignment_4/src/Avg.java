
import java.util.Scanner;

class Average {
    void calcAverage(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average = " + avg);
    }
}
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Average obj = new Average();
        obj.calcAverage(a, b, c);
    }
}