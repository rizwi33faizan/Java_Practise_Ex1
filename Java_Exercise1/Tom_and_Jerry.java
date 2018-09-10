/*A java program which prints Tom for an even input and Jerry for an odd input
with a constraint that input should be between 20 and 30
 */
import java.util.*;
public class Tom_and_Jerry {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        int input=sc.nextInt();  //user input
        if(input%2==0){
            if(input>=20 && input<=30) System.out.println("Tom");
            else System.out.println("Case is not defined"); // Not specified case
        }
        else{

                if(input>=20 && input<=30) System.out.println("Jerry");
                else System.out.println("Case is not defined"); // Not specified case
        }
    }
}
