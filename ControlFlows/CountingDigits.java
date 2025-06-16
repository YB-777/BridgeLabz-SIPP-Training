import java.util.Scanner;
//Count the number of digits in a given number
public class CountingDigits
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		while(number>0)
		{
			count++;
			number=number/10;
		}
		//Printing the result
		System.out.println("Number of digits in the number is "+count);
	}
} 