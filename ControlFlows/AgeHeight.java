import java.util.Scanner;
//Check among three persons who is the tallest and who is the youngest
public class AgeHeight
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int ageAmar=sc.nextInt();
		int ageAkbar=sc.nextInt();
		int ageAnthony=sc.nextInt();
		double heightAmar=sc.nextDouble();
		double heightAkbar=sc.nextDouble();
		double heightAnthony=sc.nextDouble();
		if(ageAmar<ageAkbar)
		{
			if(ageAmar<ageAnthony)
			{
				System.out.println("Amar is the youngest of them all");
			}
			else
			{
				System.out.println("Anthony is the youngest of them all");
			}
		}
		else if(ageAkbar<ageAnthony)
		{
			System.out.println("Akbar is the youngest of them all");
		}
		else
		{
			System.out.println("Anthony is the youngest of them all");
		}
		//Checking who is the oldest among them
		if(heightAmar>heightAkbar)
		{
			if(heightAmar>heightAnthony)
			{
				System.out.println("Amar is the tallest of them all");
			}
			else
			{
				System.out.println("Anthony is the tallest of them all");
			}
		}
		else if(heightAkbar>heightAnthony)
		{
			System.out.println("Akbar is the tallest of them all");
		}
		else
		{
			System.out.println("Anthony is the tallest of them all");
		}
		sc.close();
	}
}