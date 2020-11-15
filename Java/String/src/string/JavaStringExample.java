
package string;

public class JavaStringExample {
   
    public static void main(String[] args) {
        //1st
        String s1="java";//creating string by java string literal  
	//2nd
        char ch[]={'s','t','r','i','n','g','s'};  
	String s2=new String(ch);//converting char array to string  
	//3rd
        String s3=new String("example");//creating java string by new keyword  
	
        System.out.println(s1+" "+s2+" "+s3);  	
    }
}
