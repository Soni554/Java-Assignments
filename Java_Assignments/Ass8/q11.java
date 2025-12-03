import java.util.Scanner;
class MinimumElement extends Thread {
    private static int min = Integer.MAX_VALUE;
    private int[] array;
    private int start, end;

    public MinimumElement(int[] array, int start, int end) throws IllegalArgumentException {
        if (start < 0 || start > array.length || end < 0 || end > array.length) {
            throw new IllegalArgumentException("Invalid index of start or end. start: " + start + " and end: " + end);
        }
        this.array = array;
        this.start = start;
        this.end = end;
    }

    private static synchronized void setMin(int value) {
        if (value < min) {
            min = value;
        }
    }

    public static int getMin() {
        return min;
    }

    public void run() {
        int localMin = min;

        for (int i = start; i < end; i++) {
            if (array[i] < localMin) {
                localMin = array[i];
            }
        }
        setMin(localMin);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the array elements: ");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number of threads: ");
        int m = sc.nextInt();
        int blockSize = size / m;
        Thread[] threads = new Thread[m];

        for (int i = 0; i < m; i++) {
            threads[i] = new MinimumElement(array, i * blockSize, i == m - 1 ? size : (i + 1) + blockSize);
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
        System.out.println("The minimum element in the array is: " + MinimumElement.getMin());
    }
}
