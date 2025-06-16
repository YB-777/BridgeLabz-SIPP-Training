import java.util.*;
public class DoubleOperations
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a,b,c;
	a=sc.nextDouble();
	b=sc.nextDouble();
	c=sc.nextDouble();
	double result1=a+b*c;
	double result2=a*b+c;
	double result3=c+a/b;
	double result4=a%b+c;
	System.out.println("The result of Double operations are "+result1+", "+result2+", "+result3+" and "+result4);
	}
}