
package string_package;


public class StringDemo2 {
    public static void main(String[] args) {
        String firstName = "Md";
        String lastName = " Nadim";
        
        
        //String fullName = firstName + lastName;
        
        
        String fullName = firstName.concat(lastName);
         System.out.println("Full Name = "+fullName + 25); 
         
        String upperName = fullName.toUpperCase();
        System.out.println("UpperName = "+upperName); 
        
        String lowerName = fullName.toLowerCase();
        System.out.println("LowerName = "+lowerName); 
        
        
        boolean b = firstName.startsWith("M");
         System.out.println("b = "+b); 
         
         
        boolean last = lastName.endsWith("im");
         System.out.println("last = "+last); 
         
         
         String[] names = {"anis","sobuj","nadim"};
         for(String x: names){
             System.out.println(x);
         }
    }
}
