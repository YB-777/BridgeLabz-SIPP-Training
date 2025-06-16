import java.util.Scanner;
//Check whether a number is Armstrong number or not
//Armstrong number: a number whose Sum of cubes of each digit results in the original number 
public class ArmstrongNumber
{
	public static void main(String[] argss)
	{
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0; 
		int loop=number;
		while(loop>0)
		{
			int digit=loop%10;
			sum+=Math.pow(digit, 3);
			loop=loop/10;
		}
		if(number==sum)
		{
			System.out.println("The number is an Armstrong Number");
		}
		else
		{
			System.out.println("The number is not an Armstrong Number");
		}
		sc.close();
	}
}
			