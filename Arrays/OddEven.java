import java.util.*;
public class OddEven
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
	    if(number<1){ 
	    System.out.println("Error not a natural number");
	    return;
	    }
	    int[] odd=new int[number/2 + 1];
	    int[] even=new int[number/2 + 1];
	    int evenIndex=0,oddIndex=0;
	    for(int i=1; i<=number; i++){
	        if(i%2==0){
	            even[evenIndex]=i;
	            evenIndex++;
	        }
	        else{
	            odd[oddIndex]=i;
	            oddIndex++;
	        }
	        
	    }
	    System.out.println("Even array: ");
		for(int i=0; i<evenIndex; i++){
		    System.out.print(even[i]+" ");
		}
		System.out.println("\nOdd array: ");
		for(int i=0; i<oddIndex; i++){
		    System.out.print(odd[i]+" ");
		}
		    
	}
}