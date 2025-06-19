import java.util.Scanner;

public class CompareSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        if (start < 0 || end > input.length() || start >= end) {
            System.out.println("Invalid start or end indices.");
            return;
        }
        String substr1 = input.substring(start, end);
        String substr2 = subString(input, start, end);
        System.out.println("The two substrings are same-->"+compare(substr1,substr2));
    }
    public static String subString(String input, int start, int end){
        StringBuilder substr2 = new StringBuilder();
        for(int i = start; i < end; i++){
            substr2.append(input.charAt(i));
        }
        return substr2.toString();
        // String substr2="";
        // for(int i=start; i<end; i++){
        //     char ch = input.charAt(i);
        //     substr2+=ch;
        // }
        //return substr2;
    }
    public static boolean compare(String substr1, String substr2){
        if (substr1.length() != substr2.length()) return false;
        for(int i=0; i<substr1.length(); i++){
            char ch1=substr1.charAt(i);
            char ch2=substr2.charAt(i);
            if(ch1==ch2) continue;
            else return false;
        }
        return true;
    }
    
}
