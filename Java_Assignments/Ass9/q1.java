import java.util.Scanner; class ReverseString {
public static void main(String args[]) { Scanner sc = new Scanner(System.in); System.out.print("Enter the string: "); String str = sc.nextLine();
StringBuilder rev = new StringBuilder(str).reverse(); System.out.println("The reversed string is: "+rev);
if(str.contentEquals(rev)) {
System.out.println(str+" is a palindrome");
 
}
else {
}
}
}
