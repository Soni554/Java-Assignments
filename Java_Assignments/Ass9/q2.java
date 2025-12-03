import java.util.Scanner; class StrUpperCase {
public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.print("Enter a sentence: "); String string = sc.nextLine();
StringBuilder stringBuilder = new StringBuilder(); for (String word : string.split(" ")) {
if (!word.isEmpty()) { stringBuilder.append(Character.toUpperCase(word.charAt(0)))
.append(word.substring(1)).append(' ');
}
}
System.out.println("Transformed String is: " + stringBuilder.toString().trim());
}
}
