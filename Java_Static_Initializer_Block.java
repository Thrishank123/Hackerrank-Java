import java.util.Scanner;

public class Java_Static_Initializer_Block{
    public static void main(String[] args) {
          int B,H;
        Scanner read=new Scanner(System.in);
        B=read.nextInt();
        H=read.nextInt();
        if(B>0  && H>0){
            System.out.println(B*H);
        }
        else
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}