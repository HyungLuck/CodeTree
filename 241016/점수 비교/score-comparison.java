import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       int a2 = sc.nextInt();

       int b = sc.nextInt();
       int b2 = sc.nextInt();


       System.out.print( a>b && a2>b2 ? "1" : "0" );
    }
}