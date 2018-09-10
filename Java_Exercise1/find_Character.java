/*Program to find what type of charcter is being entered by user

 */
import java.util.Scanner;

public class find_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character");
        char c=sc.next().charAt(0);
        int asc=(int)c;

        if(asc>=65 && asc<=90){
           System.out.print("Capital Letter");
        }
        else if(asc>=97 && asc<=122){
            System.out.print("Small Letter");
        }
        else if(asc>=48 && asc<=57){
            System.out.print("Digit");
        }
        else{
            System.out.print("Special Symbol");
        }

    }
}
