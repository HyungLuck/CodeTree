import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();

    if(m == 12 ||m == 1 ||m == 2)
        System.out.print("Winter");
        
    else if(m == 3||m == 4 ||m == 5)
        System.out.print("Sprint");

    else if(m == 6||m == 7 ||m == 8)
        System.out.print("Summer");

    else
        System.out.print("Fall");



    }
}