import java.util.Scanner;
//Create a Calculator for basic Mathematical Operations
public class Calculator
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		double number1=sc.nextDouble();
		double number2=sc.nextDouble();
		sc.nextLine();
     		String operator=sc.nextLine();
		//double number1=sc.nextDouble();
		//String operator=sc.next();
		//double number2=sc.nextDouble();
		
		switch(operator)
		{
			case "+":
				System.out.println("Result is "+(number1+number2));
				break;
			case "-":
				System.out.println("Result is "+(number1-number2));
				break;
			case "*":
				System.out.println("Result is "+(number1*number2));
				break;
			case "/":
				System.out.println("Result is "+(number1/number2));
				break;
			default:
				System.out.println("Invalid Operator");
				break;
		}
		sc.close();
	}
}