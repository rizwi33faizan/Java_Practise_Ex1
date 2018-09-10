/*A java program which prints a specifed pattern according to input integer
*/

import java.util.*;
public class Nth_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int  input=sc.nextInt();
        for(int i=1;i<=input;i++){
            for(int j=1;j<=i;j++) System.out.print(i+" ");
        }
    }
}
