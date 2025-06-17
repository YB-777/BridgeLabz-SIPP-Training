import java.util.*;
public class MultiplicationTableAll
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
	    int[] multiplicationResult=new int[10];
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
}