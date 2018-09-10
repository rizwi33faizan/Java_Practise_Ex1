/* A java program to   print a string along with a substring of itself

 */

import java.util.Scanner;

public class String_and_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        System.out.println("Enter a number");
        int len=s.length();
        int input=sc.nextInt();
        String sub=new String(s.substring(len-input));
        System.out.print(s);
        for(int i=1;i<=input;i++) System.out.print(sub);
    }
}
