import java.util.*;
public class Athlete
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
	 int side1 = sc.nextInt();
	 int side2 = sc.nextInt();
	 int side3 = sc.nextInt();
	 System.out.println("The number of rounds the athlete must run "+ numberOfRounds(side1, side2, side3));
    }
    public static int numberOfRounds(int side1, int side2, int side3)
    {
	 int distance = 5 * 1000;
         int perimeter = side1 + side2 + side3;
	 int rounds = distance/perimeter;  
    	 return rounds;
    } 
}