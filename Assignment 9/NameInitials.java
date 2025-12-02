import java.util.Scanner;

public class NameInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String name = sc.nextLine();

        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0)
                initials.append(Character.toUpperCase(word.charAt(0)));
        }

        System.out.println("Initials: " + initials);
    }
}
