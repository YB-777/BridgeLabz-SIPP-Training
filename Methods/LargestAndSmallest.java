import java.util.*;
public class LargestAndSmallest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] result=largestAndSmallest(a, b, c);
		System.out.println("Largest number is "+result[0]+" and Smallest number is "+result[1]);
	}
	public static int[] largestAndSmallest(int a, int b, int c)
	{   
	    int largest, smallest;
	    if(a>b&&a>c){
	        largest=a;
	        if(b<c)
	            smallest = b;
	        else
	            smallest = c;
	    }
	    else if(b>a&&b>c){
	        largest=b;
	        if(a<c)
	            smallest = a;
	        else
	            smallest = c;
	    }
	    else{
	        largest = c;
	        if(a<b)
	            smallest = a;
	        else
	            smallest = b;
        }
        int[] result = {largest, smallest};
        return result;
    }
}