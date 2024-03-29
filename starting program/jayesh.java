//WAQTD 


import java.util.Scanner;
class jayesh 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Charcter");
		char ch= sc.next().charAt(0);

		if (ch>='a' & ch<='z')
		{ 
			System.out.println("Lower case Alphabets");
		}


			else if (ch>='A' & ch<='z')
			{ 
				System.out.println("Upper  case Alphabets");
			}
		

			else if (ch>='0' & ch<='9')
			{ 
				System.out.println("Number");
			}


			else 
				{ 
					System.out.println("Symbol");
				}
	}
}
