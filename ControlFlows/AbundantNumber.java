import java.util.Scanner;
//Check whether a number is abundant number or not
//Abundant Number: An integer in which the sum of all the divisors of the number is greater than the number itself
public class AbundantNumber
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		for(int loop=1;loop<=number/2+1;loop++)
		{
			if(number%loop==0)
				sum+=loop;
		}
		if(sum>number)
		{
			System.out.println("It is an Abundant Number");
		}
		else
		{
			System.out.println("It is not an Abundant Number");
		}
		sc.close();
	}
}