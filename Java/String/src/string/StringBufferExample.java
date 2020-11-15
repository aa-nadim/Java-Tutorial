
package string;


public class StringBufferExample {
    public static void main(String args[]){
        
	StringBuffer sb=new StringBuffer("Hello ");  
        
	sb.append("Java");//now original string is changed  
        
        //sb.append(25);
	System.out.println(sb);//prints Hello Java  
        
        sb.reverse();
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);
        
        sb.replace(1,3,"Java");  
	System.out.println(sb);//prints aJavaJ  

	}  

}
