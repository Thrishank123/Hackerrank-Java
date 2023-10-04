import java.io.*;
import java.util.*;

public class Java_Strings_Introduction{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0)
            System.out.println("Yes");
        else
        System.out.println("No");
        String rstr= A.replace(A.charAt(0), (char)(A.charAt(0)-32));
        System.out.print(rstr);
        System.out.print(" ");
       String rstr1= B.replace(B.charAt(0),(char)(B.charAt(0)-32));
        System.out.print(rstr1);
    }
}
