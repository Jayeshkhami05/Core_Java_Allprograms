////WAQTD age is 21 he can vote or not desing program......

import java.util.Scanner;
class agelimit 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your Age Please");
		int age=sc.nextInt();
			
			if (age>18)
			{
				System.out.println("YOU ARE VOTE HERE ");
				return;
				    
			}

			System.out.println("YOU ARE NOT ADULT ");
	}
}
