/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.FileInputStream;
/**
 *
 * @author Abdul Awal Nadim
 */
public class FileInputStreamExample2 {
    public static void main(String args[]){     
        try{     
            FileInputStream fin=new FileInputStream("D:\\testout.txt");     
            int i=0;     
            while((i=fin.read())!=-1){     
                System.out.println((char)i);     
            }     
            fin.close();     
        }catch(Exception e){
            System.out.println(e);
        }     
    } 
}
