import java.util.Scanner;
class Time_format
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + " Hour : " + minutes + " Minute : " + seconds + " Seconds");
        sc.close();
    }
}

