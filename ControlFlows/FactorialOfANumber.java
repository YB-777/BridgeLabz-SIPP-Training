import java.util.Scanner;
//Compute the factorial of an integer type value
public class FactorialOfANumber
{
	public static void main(String... args)
	{
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int fact=1;
		if(number>0)
		{
			for(int i=1;i<=number;i++)
			{
				fact*=i;
			}
			System.out.println("Factorial of the number "+number+" is "+fact);
		}
		else
		{
			System.out.println("The number "+number+" is a negative number");
		}
	
		sc.close();
	}
}