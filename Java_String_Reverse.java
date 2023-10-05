import java.io.*;
import java.util.*;
public class Java_String_Reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char ch;
        String Nstr="";
        for(int i=0;i<A.length();i++){
            ch=A.charAt(i);
            Nstr=ch+Nstr;
        }
        if(Nstr.equals(A)){
            System.out.println("Yes");
        }
        else
        System.out.println("No");
        
    }
}
