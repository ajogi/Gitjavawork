package CodeCamp2;
import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
    	String reverse = "";
        int len;
        System.out.print("Enter string  : ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
           len = st.length();
          for(int i = st.length() - 1; i >= 0; i--){
            reverse = reverse + st.charAt(i);
          }
        System.out.print("Reversed of String:");
        System.out.println(reverse);
        System.out.print("Length of String  : " + len);
    }
}