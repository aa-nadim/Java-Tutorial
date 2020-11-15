
package array_demo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.println("size = "+number.size());
        
        //add elements
         number.add(10);
         number.add(20);
         number.add(30);
         number.add(3,40);
         
         System.out.println("ArrayList contains : "+number);
         System.out.println();
         System.out.println("size = "+number.size());
         
        //number.clear();
        //System.out.println("After clear ArrayList contains : "+number); 
        
        boolean check = number.isEmpty();
        System.out.println("ArrayList empty : "+check);
        
        boolean contain = number.contains(30);
        System.out.println("30 is in the list : "+contain);
        
        
        int pos = number.indexOf(40);
        System.out.println("The index of 40 is : "+pos);
        
        
        number.set(3,15);  //replace
        System.out.println("after setting : "+number);
        
        int x = number.get(0);
        System.out.println("index 0 = "+x);
        
        
    }
}
