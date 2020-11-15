
package string_package;


public class StringDemo {
    public static void main(String[] args) {
        
        String s1 = "Md Nadim";
        String s2 = new String("Md Nadim");
        
        //char[] s3 = {'n','a','d','i','m'};
        //System.out.println(s3);
        
        
        System.out.println("s1 = "+s1);  
        System.out.println("s2 = "+s2);  
        
        int len = s1.length();
        System.out.println("Length of s1 = "+len);
        
        boolean con = s1.contains("Nad");
        System.out.println(con);
        
        boolean b = s1.isEmpty();
         System.out.println("b = "+b);
       
    }
}
