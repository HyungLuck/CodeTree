import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();

        if(cost >= 3000)
            System.out.print("book");
        else if(cost >= 1000)
            System.out.print("mask");
        else if(cost >= 500)
            System.out.print("pen");
        else
            System.out.print("no");
    }
}