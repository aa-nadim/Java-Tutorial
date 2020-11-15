
package array_demo;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.println("size = "+number.size());
        
        //add elements
         number.add(10);
         number.add(20);
         number.add(30);
         number.add(3,40);
         
         System.out.println("ArrayList contains : "+number);
         
         /*for(int x:number){
             System.out.print(" "+x);
         }*/
         
         /*Iterator itr = number.iterator();
         while(itr.hasNext()){
             System.out.print(" "+itr.next()); 
         }*/
         
         System.out.println();
         System.out.println("size = "+number.size());
         
         
         //removing elements
         number.remove(2);
         System.out.println("after removing ArrayList contains : "+number);
         
         number.removeAll(number);
         System.out.println("After Removing all : "+number);
         
    }
}
