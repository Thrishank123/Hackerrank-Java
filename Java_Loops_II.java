import java.util.*;
import java.io.*;
import java.lang.*;
public class Java_Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                 int x=j+1;
                int y= (int) (Math.pow(2,x)-1);
                System.out.print(a+(b*y)+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
