
package classarpora;

import java.util.Scanner;

public class Fibonacci {
    
    public static int fibo(int x){
        if(x<=1)
            return x;
        else
            return fibo(x-2)+fibo(x-1);
    }
     
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n,i;
        System.out.println("Please enter a limit");
        n = input.nextInt();
        
        for(i=0;i<n;i++)
            System.out.print(fibo(i)+" ");
        
    }
}
