import java.util.Scanner;
//Check whether a person is eligible to vote or not
public class EligibilityToVote
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("The person can vote");
		}
		else
		{
			System.out.println("The person cannot vote");
		}
		sc.close();
	}
}