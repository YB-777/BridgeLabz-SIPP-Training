import java.util.*;
public class MultiplicationTable
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
	    int[] multiplicationResult=new int[10];
	    if(number>=6 && number<=9){
	        int index=0;
	        for(int i=1; i<=10;i++){
	            multiplicationResult[index++]=number*i;
	            //index+=1;
	        }
	        index=0;
	    
	        for(int i=1; i<=10; i++){
                System.out.println( number+ " * "+i+ " ="+multiplicationResult[index++]);
                //index+=1;
	        }
	    }
	    else{
	        System.out.println("Invalid input");
	        return;
	    }
	}
}		
	    