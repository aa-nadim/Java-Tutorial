
package nadim;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, originalNum, remainder, result;
        System.out.println("Enter a Number:");
        num = input.nextInt();
        originalNum = num;
        result=0;
        while(originalNum != 0){
            remainder=originalNum%10;
            result=result+remainder*remainder*remainder;
            originalNum=originalNum/10;
        }
        if(result==num)
            System.out.println(num+" is an Armstrong number.");
        else
            System.out.println(num+" is not an Armstrong number.");
    }
}
