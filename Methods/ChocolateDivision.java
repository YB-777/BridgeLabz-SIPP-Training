import java.util.*;
public class ChocolateDivision
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
	 int numberOfChocolates = sc.nextInt();
	 int numberOfChildren = sc.nextInt();
	 int[] result = chocolate(numberOfChildren, numberOfChocolates); 
	 System.out.println("The number of chocolates each child will get "+ result[0]+" and remaining chocolates are "+result[1]);
    }
    public static int[] chocolate(int numberOfChildren, int numberOfChocolates)
    {
	 int chocolatesEachChild = numberOfChocolates / numberOfChildren;
         int remainingChocolates = numberOfChocolates - (chocolatesEachChild * numberOfChildren); 
	 int[] result = {chocolatesEachChild, remainingChocolates};
    	 return result;
    } 
}