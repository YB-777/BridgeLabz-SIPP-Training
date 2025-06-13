import java.util.*;
public class VolCylinder
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    double rad=sc.nextDouble();
	    double height=sc.nextDouble();
	    double volume=Math.PI *rad * rad * height;
	    System.out.println("Volume of Cylinder "+volume);
	}
}
