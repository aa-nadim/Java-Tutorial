
package programmingwithjava;

import java.util.Scanner;


public class Q1_frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch[]={'n','s','t','u','9','a','b','e','a'};
        //int l=input.nextInt();
        //char[] ch=new char[l];
        int a,e,i,o,u,SpCh,j;
        //for(j=0;j<l;j++){
          //  ch[j]=(char) input.nextChar();
        //}
        a=e=i=o=u=SpCh=0;
        for(j=0;j<9;j++){
            if(ch[j]=='a')
                a++;
            else if(ch[j]=='e')
                e++;
            else if(ch[j]=='i')
                i++;
            else if(ch[j]=='o')
                o++;
            else if(ch[j]=='u')
                u++;
            else
                SpCh++;
        }
        System.out.println("a="+a+" e="+e+" i="+i+" o="+o+" u="+u+" SpecialCharacter="+SpCh);
        
    }
}
