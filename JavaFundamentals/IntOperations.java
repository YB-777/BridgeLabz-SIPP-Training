import java.util.*;
public class IntOperations
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	int result1=a+b*c;
	int result2=a*b+c;
	int result3=c+a/b;
	int result4=a%b+c;
	System.out.println("The result of int operations are "+result1+", "+result2+", "+result3+" and "+result4);
	}
}