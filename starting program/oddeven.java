//waqt to read int type data chake num is odd /even ... 

import java.util.Scanner;
class oddeven 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int num=sc.nextInt();

		if (num%2==0)
		{
			System.out.println("Even Number");
			System.exit(0);
		}
			System.out.println("Odd Number");

	}
}
