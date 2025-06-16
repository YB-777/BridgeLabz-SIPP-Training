import java.util.Scanner;
//Print countdown to the number from 1
public class CountdownForRocketLaunchUsingWhile
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int countdown=sc.nextInt();
		int i=1;
		while(i<=countdown)
		{
			System.out.println(i);
			i++;
		}
		sc.close();
	}
}