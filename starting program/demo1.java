import java.util.Scanner;
class demo1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A 1st Number ");
		int num1=sc.nextInt();

		System.out.println("Enter A 2nd  Number ");
		int num2=sc.nextInt();

		System.out.println("1 for Additions");
		System.out.println("2 for Subtractions");
		System.out.println("3 for multiplcation");
		System.out.println("4 for Division");

		int inpt=sc.nextInt();
		int a,b;

		switch (inpt)
		{
		case 1 :
			System.out.println("addtions of a+b="+(a+b));
			break;

		case 2:
			System.out.println("subtractions of a-b="+(a-b));
			break;

		case 3:
			System.out.println("Multiplications of a*b="+(a*b));
			break;

		case 4:
			System.out.println("Division of a%b="+(a%b));
			break;
		
		}
	}
}
