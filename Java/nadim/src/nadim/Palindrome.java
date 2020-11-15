package nadim;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      String str, rev = "";
      System.out.println("Enter a string:");
      str = input.nextLine();
 
      int L = str.length();
 
      for ( int i = L - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}
