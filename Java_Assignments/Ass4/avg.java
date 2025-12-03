import java.util.Scanner;
class Average
{
	void average(int a, int b, int c)
	{
		int avg=(a+b+c)/3;
		System.out.println("average is:"+avg);
	}
}
	
class Driver{
	public static void main( String []s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 numbers\n");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		Average obj = new Average();
		obj.average(a,b,c);
	}
}