/*A Java program that reverse a given string

 */
import java.util.Scanner;


public class reverse_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        for(int i=len-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }

}
