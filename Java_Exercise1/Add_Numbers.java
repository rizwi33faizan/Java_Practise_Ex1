/*A java program which adds integers as user input
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Add_Numbers{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int sum=0;
        boolean flag=false;
        String str=in.nextLine();
        StringTokenizer str1=new StringTokenizer(str," ");
        while (str1.hasMoreElements()){
            int x=Integer.valueOf(str1.nextToken());
            if(x!=Math.ceil(x)){
                flag=true;
                break;
            }
            sum+=x;

        }
        if (flag){
            System.out.println("Error: Given input is not an integer");
        }else {
            System.out.println(sum);
        }
    }
}