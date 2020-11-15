
package nadim;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter an array size:");
        int size=input.nextInt();
        int i,j,temp,arr[]=new int[size];
        System.out.println("input the array elements");
        for(i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        for(i=0;i<size-1;i++){
            for(j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
