import java.util.*;
public class HandShakes
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
	 int numberOfStudents = sc.nextInt();
	 System.out.println("The number of possible handshakes --> "+countHandShakes(numberOfStudents));
    }
    public static int countHandShakes(int numberOfStudents)
    {
	 int MaxHandShakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
         return MaxHandShakes; 
    }
}