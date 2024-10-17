import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c;
    int num = 0;

    char aa = sc.next().charAt(0);
    a = sc.nextInt();
    char bb = sc.next().charAt(0);
    b = sc.nextInt();
    char cc = sc.next().charAt(0);
    c = sc.nextInt();

    if(aa == 'Y') {
        if(a >= 37) {
        num ++;
        }
    }
    if(bb == 'Y') {
        if(b >= 37) {
        num ++;
        }
    }
    if(cc == 'Y') {
        if(c >= 37) {
        num ++;
        }
    }

    if(num >= 2) {
        System.out.print("E");
    }
    else {
        System.out.print("N");
    }






    }
}