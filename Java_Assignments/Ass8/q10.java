import java.util.Scanner;
class SumOfNaturalNumber implements Runnable {
    private int n, i = 1, sum = 0;


    public SumOfNaturalNumber(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("Enter valid Natural Number. n: " + n);
        }
        this.n = n;
    }

    public int getSum() {
        return sum;
    }

    public void run() {
        while (i <= n) {
            synchronized (this) {
                sum += i++;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate the sum: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of threads: ");
        int m = sc.nextInt();
        SumOfNaturalNumber sumOfNaturalNumber = new SumOfNaturalNumber(n);
        Thread[] threads = new Thread[m];

        for (int i = 0; i < m; i++) {
            threads[i] = new Thread(sumOfNaturalNumber);
        }
        for (int i = 0; i < m; i++) {
            threads[i].start();
        }
        for (int i = 0; i < m; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("Sum of the " + n + " Natural Numbers are: " + sumOfNaturalNumber.getSum());
    }
}
