import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original string: ");
        String str = sc.nextLine();
        System.out.print("Enter substring to replace: ");
        String oldStr = sc.nextLine();
        System.out.print("Enter new substring: ");
        String newStr = sc.nextLine();

        String replaced = str.replace(oldStr, newStr);
        System.out.println("Result: " + replaced);
    }
}

