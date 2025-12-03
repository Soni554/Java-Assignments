import java.util.Scanner;
import btech.Student;
class Main {
     public void main(String[] args)
 { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Roll No: "); 
        int rollNo = sc.nextInt(); 
        sc.nextLine();  
        System.out.print("Enter Name: "); 
        String name = sc.nextLine(); 
   int[] marks = new int[3]; 
        System.out.print("Enter marks of 3 subjects (separated by space): "); 
        for (int i = 0; i < 3; i++) { 
            marks[i] = sc.nextInt(); 
        } 
        Student student = new Student(rollNo, name, marks); 
        student.display(); 
        sc.close(); 
}
}