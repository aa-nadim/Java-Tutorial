
package nadim;

import java.util.Scanner;


public class FibonacciSeries {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Please enter a limit");
         int first,second,sum,num=input.nextInt();
         first=0;
         second=1;
         if(num==1)
             System.out.println(first);
         else if(num==2)
             System.out.println(first+" "+second);
         else{
             System.out.print(first+" "+second);
             for(int i=3;i<=num;i++){
                 sum=first+second;
                 System.out.print(" "+sum);
                 first=second;
                 second=sum;
             }
         }
         System.out.println();
    }
   
}
