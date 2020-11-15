
package nadim;

import java.util.Scanner;


public class FibonacciREcursion {
    public static int fibo(int x){
        if(x<=1)
            return x;
        else
            return fibo(x-1)+fibo(x-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a limit");
        int num,i;
        num=input.nextInt();
        for(i=0;i<num;i++){
            System.out.print(fibo(i)+" ");
        }
        System.out.println();
    }
}
