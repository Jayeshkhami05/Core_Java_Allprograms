/////////////leap year program chake please by input to user 


import java.util.Scanner;
class leapyear 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter A number ");

		int year=sc.nextInt();

		if (year%4==0)
		{
			System.out.println("Leap Year");
			return;
		}
		else
		{
			System.out.println("Not a Leap Year");
		}

	}
}
