
package nadim;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int count ,num=input.nextInt();
        count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
            count++;
            break;
            }
        }
        if(count==0)
            System.out.println(num+" is a prime number");
        else
            System.out.println(num+" is not a prime number");
    }
}
