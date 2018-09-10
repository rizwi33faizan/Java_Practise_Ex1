/*A java program to guess a number coorrectly

 */
import java.util.Scanner;

public class guess_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Original Value");
        int base=sc.nextInt();
        boolean flag=true;
        while(flag){
            System.out.println("Guess the number");
            int gVal=sc.nextInt();
            if(gVal==base){
                System.out.println("Number guessed matches the original number");
                flag=false;
            }
            else if(gVal>base){
                System.out.println("Number guessed is more than original number");

            }
            else{
                System.out.println("Number guessed is less than original number ");

            }
        }
    }
}
