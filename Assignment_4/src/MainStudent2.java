import java.util.Scanner;

class Student2 {
    int regNo;
    String stdName, branch;
    double cgpa;

    void input() {
        Scanner sc = new Scanner(System.in);
        regNo = sc.nextInt();
        sc.nextLine();
        stdName = sc.nextLine();
        branch = sc.nextLine();
        cgpa = sc.nextDouble();
    }

    void display() {
        System.out.println(regNo + " " + stdName + " " + branch + " " + cgpa);
    }
}
public class MainStudent2 {
    public static void main(String[] args) {
        Student2[] s = new Student2[50];

        double max = -1;
        int idx = -1;

        for (int i = 0; i < 50; i++) {
            s[i] = new Student2();
            s[i].input();

            if (s[i].cgpa > max) {
                max = s[i].cgpa;
                idx = i;
            }
        }

        s[idx].display();
    }
}

