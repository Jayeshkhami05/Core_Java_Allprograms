//WAQD to compair 2 int type data chake equal or not .....


import java.util.Scanner;
class equalnot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a 1st Number");
		int a=sc.nextInt();

		System.out.println("Enter a 2nd Number");
		int b=sc.nextInt();
		

		if (a==b)
		{
			System.out.println("Equal");
			return;
		}
		System.out.println("Not Equal");
	}
}
