import java.util.*;
public class ArrayIndexError
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String[] names=new String[5];
	    for(int i=0; i<5; i++){
            names[i] = sc.nextLine();	        
	    }
	    // Wrap errorGenerate in try-catch so the program doesn’t crash
        System.out.println("Running errorGenerate():");
        try {
            errorGenerate(names);
        } catch (Exception e) {
            System.out.println("Error occurred in errorGenerate(): " + e);
        }

        // This will run safely
        System.out.println("\nRunning errorHandler():");
        errorHandler(names);
	   // errorGenerate(names);
	   // errorHandler(names);
	}
	public static void errorGenerate(String names[]){
	    for(int i=0; i<=5; i++){
	        System.out.println(names[i]);
	    }
	}
	public static void errorHandler(String names[]){
	    try{
	        for(int i=0; i<=5; i++){
	             System.out.println(names[i]);
	        }
	    } catch(Exception e){
	        System.out.println("Something went wrong");
	    }
	}
}