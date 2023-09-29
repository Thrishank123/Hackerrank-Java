import java.util.Scanner;
public class Java_Loops_I {
    public static void main(String[] args) {
        int n;
        Scanner read = new Scanner(System.in);
        n=read.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}