
package exception;


public class JavaExceptionExample {
    public static void main(String[] args) {
        try{
             //code that may raise exception 
              int data=100/0; 
              //String s=null;  
                //System.out.println(s.length());//NullPointerException 
        }
        
        catch(ArithmeticException e){
            System.out.println(e);
        } 
         //rest code of the program 
         System.out.println("rest of the code..."); 
        
    }
}
