import java.util.Scanner;
//Computing the sum until the user enters zero
public class SumOfNumbers
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		double sum=0.0;
		while(true)
		{
			System.out.println("Enter a number : ");
			double number=sc.nextDouble();
			if(number==0.0)
			{
				break;
			}
			else
			{
				sum+=number;
			}
		}
		System.out.println("Sum of the numbers input by the user is "+sum);
		sc.close();
	}
}