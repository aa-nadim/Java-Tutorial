
package classarpora;


public class ArmstrngNumber {
    public static void main(String[] args) {
        int n=371,r,m=10,sum=0;
        int temp=n;
        while(temp!=0){
            int p=temp%m;
            sum=sum+(p*p*p);
            temp=temp/m;
        }
        if(sum==n)System.out.println("Yes");
        else System.out.println("No");
    }
}
