import java.util.Scanner;
public class BonusOfEmployees
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int salary=sc.nextInt();
		int yearofservice=sc.nextInt();
		double bonus=0;
		if(yearofservice>5)
		{
			//compute bonus
			bonus=0.05*salary;
		}
		System.out.println("Bonus of the employee : "+bonus);
		sc.close();
	}
}