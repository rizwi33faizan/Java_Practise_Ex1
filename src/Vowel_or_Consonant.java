/*A java program which checks character in a word is vowel or consonant
 */
import java.util.*;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String input=sc.nextLine();  //user input
        int i=0;
        int flag=0;
        int temp=input.length();
        while(i<temp){
            if((input.charAt(i)>='a' && input.charAt(i)<='z')  || (input.charAt(i)>='A' && input.charAt(i)<='Z')){
                if(input.charAt(i)=='a'||input.charAt(i)=='A'||input.charAt(i)=='e'||input.charAt(i)=='E'||input.charAt(i)=='i'
                        ||input.charAt(i)=='I' ||input.charAt(i)=='o' ||input.charAt(i)=='O' ||input.charAt(i)=='u' ||input.charAt(i)=='U')
                    System.out.print("Vowel ");
                else
                    System.out.print("Consonant ");
            }
            else{
                System.out.print("Input Error ");
                flag=1;
            }
            if(flag==1) {
                break;
            }
            i=i+1;
        }
    }


}
