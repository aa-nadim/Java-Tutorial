/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Abdul Awal Nadim
 */
public class StringBufferExample3 {
    public static void main(String args[]){  
        
        
	StringBuffer sb=new StringBuffer("Hello");
        
	sb.replace(1,3,"Java");  
        
	System.out.println(sb);//prints HJavalo  
	}  

}
