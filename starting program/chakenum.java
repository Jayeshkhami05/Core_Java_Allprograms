////WAQTD divisal by 3 and 5 shoe result 

import java.util.Scanner;
class chakenum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter A Number");
		int num=sc.nextInt();

		if (num%3==0&&num%5==0)
		{
			System.out.println("Number Is A Divisal By 3 And 5");
			return;
		}

		else
		{
			System.out.println("Please Enter A Another Number");
		}

	}

}
