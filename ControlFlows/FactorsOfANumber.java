import java.util.Scanner;
//Listing all the Factors of a number
public class FactorsOfANumber
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int counter=number-1;
		while(counter>1)
		{
			if(number%counter==0)
			{
				System.out.println(counter);
			}
			counter--;
		}
		sc.close();
	}
}