import java.util.Scanner;
public class Java_Stdin_and_Stdout_I{
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c= read.nextInt();
        read.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
