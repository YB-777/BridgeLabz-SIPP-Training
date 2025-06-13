import java.util.*;
public class PeriRectangle
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    double len=sc.nextDouble();
	    double wid=sc.nextDouble();
            double Peri=2*(len+wid);
	    System.out.println("Perimeter of a rectangle "+Peri);
	}
}
