
package string_package;

public class PalindromeDemo {
    public static void main(String[] args) {
        
        String s1 = "madam";
        
        StringBuilder sb = new StringBuilder(s1);
        
        String s2 = sb.reverse().toString();
        
        if(s1.equals(s2)){
             System.out.println("Palinduome");
        }
        else{
             System.out.println("Not a Palinduome");
        }
    }
}
