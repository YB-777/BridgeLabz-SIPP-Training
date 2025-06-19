import java.util.*;
public class UpperCase
{
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine().toLowerCase();
	    String inputUpper1=input.toUpperCase();
	    int length = input.length();
	    String inputUpper2 = toUpper(input, length);
	    System.out.println("The upper case of the input string is "+ inputUpper2);
	    System.out.println("Are both the strings being compared are same --> "+check(inputUpper1, inputUpper2, length));
    }
	public static String toUpper(String input,int length){
	    String inputUpper2="";
	    for(int i=0; i<length; i++){
	        char ch=input.charAt(i);
	        if(ch!=' ')
	            inputUpper2 += (char)(ch-32);
	        else
	            inputUpper2 += ch;
	    }
	    return inputUpper2;
	}
	public static boolean check(String inputUpper1, String inputUpper2, int length){
	    for(int i=0; i<length;i++){
	        char ch1 = inputUpper1.charAt(i);
	        char ch2 = inputUpper2.charAt(i);
	        if(ch1==ch2) continue;
	        else return false;
	    }
	    return true;
	}
}