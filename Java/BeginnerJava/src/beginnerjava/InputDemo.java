
package beginnerjava;

import java.util.Scanner;

public class InputDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*int number;
        System.out.print("Enter any Number : "); 
        number = input.nextInt();
        System.out.println("Number = "+number);*/
        
        String name;
        System.out.print("Enter any name : "); 
        name = input.nextLine();
        System.out.println("Welcome : "+name);
    }
}
