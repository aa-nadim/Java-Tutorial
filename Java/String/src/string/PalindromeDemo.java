
package string;

public class PalindromeDemo {
    public static void main(String[] args) {
        String s1 = "madam";
        
        StringBuffer sb = new StringBuffer(s1);
        
        String s2 = sb.reverse().toString();
        
        if(s1.equals(s2)){
            System.out.println("Palindorme");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
    }
}
