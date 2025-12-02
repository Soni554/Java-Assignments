import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    String branch;

    void input() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        roll_no = sc.nextInt();
        sc.nextLine();
        branch = sc.nextLine();
    }

    void display() {
        System.out.println(name + " " + roll_no + " " + branch);
    }
}

public class MainStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}

