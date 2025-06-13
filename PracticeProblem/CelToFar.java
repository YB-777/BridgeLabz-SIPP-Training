import java.util.*;
public class CelToFar
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    Float cel=sc.nextFloat();
	    Float far=(cel * 9/5) + 32;
	    System.out.println("Temperature in Farhenheit "+far);
	}
}
