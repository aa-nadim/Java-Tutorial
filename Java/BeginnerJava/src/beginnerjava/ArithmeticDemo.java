
package beginnerjava;

import java.util.Scanner;


public class ArithmeticDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
        
        System.out.println("Enter First number : ");
            num1 = input.nextInt();
        System.out.println("Enter second number : ");
            num2 = input.nextInt(); 
            
        result=num1+num2;
        System.out.println("Sum = "+result);
        
    }
    
}
