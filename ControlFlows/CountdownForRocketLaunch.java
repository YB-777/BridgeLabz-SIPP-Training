import java.util.Scanner;
//Print countdown to the number from 1
public class CountdownForRocketLaunch
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int countdown=sc.nextInt();
		for(int i=1;i<=countdown;i++)
		{
			System.out.println(i);
		}
		sc.close();
	}
}