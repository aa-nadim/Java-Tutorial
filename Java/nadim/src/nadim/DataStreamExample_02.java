
package nadim;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class DataStreamExample_02 {
     public static void main(String[] args){   
         Scanner input = new Scanner(System.in);
         System.out.println("Input any String");
         try{ 
             FileOutputStream fout=new FileOutputStream("D:\\nadim.txt");
             String str=input.nextLine();
             byte b[]=str.getBytes();//converting string into byte array     
             fout.write(b);     
             fout.close();
             
             FileInputStream fin=new FileInputStream("D:\\nadim.txt");     
             int i=0;     
             while((i=fin.read())!=-1){     
                 System.out.print((char)i);     
             }     
             fin.close(); 
             
         }catch(Exception e){
             System.out.println(e);
         }
         System.out.println();
     } 
}
