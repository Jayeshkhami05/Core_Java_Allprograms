//waqt read 2 int type data compair data and show laege int type data 


import java.util.Scanner;
class largenum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter A 1 Number ");
		int num1=sc.nextInt();

		System.out.println("Enter A 2nd  Number ");
		int num2=sc.nextInt();
			
			if (num1>num2)
			{
				System.out.println(num1);
				return;
			}
			System.out.println(num2);
	}

}
