import java.util.Scanner;
//Comparing Sum of natural numbers with the formula n*(n+1)/2
public class SumofNaturalNumbersFormula
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int sum_formula=0;
		int sum_loop=0;
		if(number>0)
		{
			sum_formula=number*(number+1)/2;
			int i=1;
			while(i<=number)
			{
				sum_loop+=i;
				i++;
			}
			if(sum_loop==sum_formula)
			{
				System.out.println("Both are Correct");
			}
			else
			{
				System.out.println("Both are incorrect");
			}
		}
		else
		{
			System.out.println("The number "+number+" is not a natural number");
		}
		//Closing Scanner class
		sc.close();
	}
}