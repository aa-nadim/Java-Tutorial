
package programmingwithjava;

import java.util.Scanner;

public class Q2_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i,j,temp,l=input.nextInt();
        int arr[]=new int[l];       
        
        for(i=0;i<l;i++){
            arr[i]=input.nextInt();
        }
        
        for(i=0;i<l-1;i++){
            for(j=0;j<l-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        for(i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
