import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int aage = sc.nextInt();
    String asex = sc.next();

    int bage = sc.nextInt();
    String bsex = sc.next();

    if((bsex.equals("M") && bage >= 19) || (asex.equals("M") && aage >=19))
        System.out.print("1");

    else
        System.out.print("0");
    }
}