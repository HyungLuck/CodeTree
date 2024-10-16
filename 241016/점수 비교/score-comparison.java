import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amath, bmath, aEng, bEng;

        amath = sc.nextInt();
        bmath = sc.nextInt();

        aEng = sc.nextInt();
        bEng = sc.nextInt();

        if(amath > bmath && aEng > bEng )
            System.out.println(1);
        else
            System.out.println(0);
    }
}