/*A java program that sorts a given integer

 */
import java.util.Scanner;

public class sorted_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=sc.nextInt();
        int [] arr=new int[]{0,0,0,0,0,0,0,0,0,0};
        while(input!=0){
            int temp=input%10;
            arr[temp]=arr[temp]+1;
            input=input/10;
        }

        int sum=0;
        System.out.println("Sorted number in non-increasing order : ");
        for(int i=9;i>=0;i--){
            for(int j=arr[i];j>=1;j--){
                System.out.print(i);

            }
            if(i%2==0)sum=sum+(i*arr[i]);
        }
        System.out.println("\nsum of even numbers is: "+sum);
        if(sum>15)System.out.println("True");
        else System.out.println("False");
    }
}
