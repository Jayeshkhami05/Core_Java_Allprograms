import java.util.Scanner;
class pattern1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();
		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
//output=* * * * *
//       * * * * *
//       * * * * *
//       * * * * *
//       * * * * *



class pattern2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=i;j++ )
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
//output=*
//       * *
//       * * *
//       * * * *
//       * * * * *



class pattern3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			colm--;
		}
	}
}
//output=* * * * *
//       * * * *
//       * * *
//       * *
//       *



class pattern4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				if (j>=i)
					{
					System.out.print("*");
					}
				else
					{
					System.out.print(" ");
					}
				}
				System.out.println(" ");
				System.out.println();
		}
	}
}
//output=* * * * *
//         * * * *
//           * * *
//             * *
//               *


class pattern5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();
		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}
//output 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3 3
//       4 4 4 4 4
//       5 5 5 5 5




class pattern6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();
		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
//output=1 2 3 4 5
//       1 2 3 4 5
//       1 2 3 4 5
//       1 2 3 4 5
//       1 2 3 4 5



class pattern7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				if (i%2==0)
				{
					System.out.print("b");
				}
				else
					{
						System.out.print("a");
					}
				
			}
			System.out.println();
		}
	}
}
//output a a a a a 
//       b b b b b 
//       a a a a a 
//       b b b b b
//       a a a a a



class pattern8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				if (j%2==0)
				{
					System.out.print("b");
				}
				else
					{
						System.out.print("a");
					}
				
			}
			System.out.println();
		}
	}
}
//output =a b a b a
//        a b a b a
//        a b a b a
//        a b a b a
//        a b a b a


class pattern9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();
		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				if (i%2==0 && j%2==0 || j%2!=0 && i%2!=0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println(" ");				
	}
	}
}
//output 1 0 1 0 1
//       0 1 0 1 0
//       1 0 1 0 1
//       0 1 0 1 0
///      1 0 1 0 1




class pattern10
{
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<=row;i++ )
		{
			for (int j=0;j<=colm;j++)
			{
				if (j%2==0)
				{
					System.out.print("+");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
}
	}
}
//output= + * + * +
//        + * + * +
//        + * + * +
//        + * + * +
//        + * + * +




class pattern11
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();
			
		for (int i=1;i<=row;i++)
		{
			for (int j=1;j<=colm;j++ )
			{
				System.out.print(j*5+" ");
			}
			System.out.println();
		}
	}

}
//output = 5 10 15 20 25
///        5 10 15 20 25
///        5 10 15 20 25
///        5 10 15 20 25
///        5 10 15 20 25






class pattern12
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<=row;i++)
		{
			for (int j=1;j<=colm;j++)
			{
				if (i%2!=0)
				{
					System.out.print(j*5+" ");
				}
				else
					{
					System.out.print(j*2+" ");
					
					}
			}
			System.out.println();
		}
	}
}
//output = 5 10 15 20 25 
//         2  4  6  8  10
///        5 10 15 20 25 
//         2  4  6  8  10
///        5 10 15 20 25 




class pattern13
{
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();
		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=i;j++ )
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
//output = 1
//         1 2
//         1 2 3
//         1 2 3 4
//         1 2 3 4 5


class pattern14
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();
		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=i;j++ )
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
//output=  1 
//         2 2
//         3 3 3
///        4 4 4 4
//         5 5 5 5 5




class pattern15
{
	public static void main(String[] args) 
	{
		char a='a';
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++ )
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
}
}
//output= a
//        b c
//        d e f
///       g h i j
///       k l m n o


class pattern16
{
	public static void main(String[] args) 
	{ int a=1;

		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++ )
			{
				System.out.print(a*10+" ");
				a++;
				if (a==10)
				{
					a=1;
				}
			}
			System.out.println();
		}
	}
}
//output = 10
//         20 30
//         40 50 60
//         70 80 90 10
///        20 30 40 50 60



class pattern17
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();
		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				if (i+j<=6)
				{
					System.out.print(j+" ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
//output= 1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1



class pattern18
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();
		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				if (i+j<=6)
				{
					System.out.print(i+" ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
//output = 1 1 1 1 1
///        2 2 2 2
///        3 3 3
//         4 4
//         5



class pattern19
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();
		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		char a='a';
		for (int i=row;i>=1;i--)
		{
			for (int j=1;j<=1;j++ )
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println(" ");
		}
	}
}





class pattern20
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=row;i>=1;i-- )
		{
			int a=1;

			for (int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a+2;
			}
			System.out.println(" ");
		}
	}
}
//output= 1 3 5 7 9
//        1 3 5 7
//        1 3 5
//        1 3
///       1




class pattern21
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<=row;i++ )
		{
			for (int j=1;j<=colm;j++ )
			{
				if (j<=5)
				{
					System.out.print(i+j-1);
				}
				else{
					System.out.print(i+j-6);
				}
				
			}
			System.out.println(" ");
		}
	}
}
//output= 1 2 3 4 5
//        2 3 4 5 6
//        3 4 5 6 7
//        4 5 6 7 8
//        5 6 7 8 9



class pattern22
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<=row;i++)
		{
			for (int j=1;j<=colm;j++)
			{
				if (i==6||i==1||j==6||j==1)
				{
					System.out.print(" + ");
				}
				else
					{
					System.out.print(j-1);
				}
			}
			System.out.println();
		}
	}
}
//output=* * * * * *
///      * 1 2 3 4 *
//       * 1 2 3 4 *
//       * 1 2 3 4 *
//       * 1 2 3 4 *
//       * * * * * *




class pattern23
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();

		for (int i=1;i<=row;i++)
		{
			for (int j=1;j<=i;j++)
			{
				if (j==1||j==i||i==5)
				{
					System.out.print(" * ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}



class pattern24
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Rows");
		int row=sc.nextInt();

		System.out.println("Enter a colm");
		int colm=sc.nextInt();
		
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j<=5;j++)
			{
				if (i==1||i==5||j==1||j==5)
				{
					System.out.print("*");
				}
				else
					{
					System.out.print(" ");
					}
			}
			System.out.println(" ");
		}
	}
}
