import java.util.*;
public class Height
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    float heightCM = sc.nextFloat();
	    float heightInch = (float)(heightCM/2.54);
            float heightFeet = heightInch/12;
	    System.out.println("Your Height in cm is "+heightCM+" while in feet is "+heightFeet+" and inches is "+heightInch);
	}
}
