//waqd last digit even no print "hye"  digit odd number is even print will be "by"


import java.util.Scanner;
class evenodd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number ");
		int a=sc.nextInt();
		System.out.println(a%2==0?"hello":"by");
	}
}
