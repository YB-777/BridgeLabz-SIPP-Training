import java.util.*;
public class PositiveNegative
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("the entered number is "+positiveNegative(number));
	}
	public static int positiveNegative(int number)
	{   
        if(number==0) return 0;
        else if(number>0) return 1;
        return -1;
    }
}