
package classarpora;


public class BubbleSort {
     public static void main(String[] args) {
        int i, j, k, temp, z, n=9;
    int a[]={9,8,7,6,5,4,3,2,1};
    for(k=0;k<n;k++)
    {
        for(i=0,j=i+1;i<n-1;i++,j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
}
