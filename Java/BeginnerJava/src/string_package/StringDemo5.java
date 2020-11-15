
package string_package;


public class StringDemo5 {
    public static void main(String[] args) {
        
        String s1 = "MD";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);
        
        sb.append(" Nadim ");
        sb.append(25);
        System.out.println(sb);
        
        
        //sb.reverse();
        //System.out.println(sb);
        
        //sb.delete(0, 5);
        //System.out.println(sb);
        
        
        sb.setLength(5);
        System.out.println(sb);
        
    }
}
