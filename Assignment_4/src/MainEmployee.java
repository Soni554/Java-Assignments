import java.util.Scanner;

class Employee {
    int empid;
    String ename, dept;
    double sal;

    void getData() {
        Scanner sc = new Scanner(System.in);
        empid = sc.nextInt();
        sc.nextLine();
        ename = sc.nextLine();
        dept = sc.nextLine();
        sal = sc.nextDouble();
    }

    void putData() {
        System.out.println(empid + " " + ename + " " + dept + " " + sal);
    }
}


public class MainEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            e[i] = new Employee();
            e[i].getData();
        }

        for (int i = 0; i < n; i++) {
            e[i].putData();
        }
    }
}

