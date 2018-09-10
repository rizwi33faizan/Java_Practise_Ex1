/*A java program which checks whether an integer is palindrome or not */

import java.util.*;

public class palindrome_Checker {

    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner input=new Scanner(System.in);
        long test=input.nextLong(); //takes user input
        is_Palindrome(test);
    }


    /*Method that checks whether provided integer as argument is palindrome or not */
    public static void is_Palindrome(long test) {

        long rev_Test=0,even_Sum=0,test_Copy=test;
        while(test != 0){
            long temp=test%10;
            test=test/10;
            rev_Test=rev_Test*10+temp;
            if(temp%2==0){
                even_Sum=even_Sum+temp;
            }
        }
        if(test_Copy==rev_Test){
            String s="";
            if(even_Sum<=25) s=s+"less";
            else s=s+"greater";
            System.out.print(test_Copy+" is palindrome and some of even numbers is "+s+" than 25");
        }
        else{
            System.out.print(test_Copy+" is not palindrome");
        }

    }
}
