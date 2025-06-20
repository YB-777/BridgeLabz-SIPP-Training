import java.util.*;
public class RemainderAndQuotient
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
        int divisor = sc.nextInt();
	int[] result = findRemainderAndQuotient(number, divisor); 
	System.out.println("The quotient and remainder is "+result[0]+" and "+result[1]+" respectively"); 
    }
    public static int[] findRemainderAndQuotient(int number, int divisor)
    {
	int quotient = number / divisor;
	int remainder = number % divisor;
	int[] result = {quotient, remainder};
	return result;
    }
}