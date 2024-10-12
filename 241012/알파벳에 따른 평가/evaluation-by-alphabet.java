import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char E = sc.next().charAt(0);
        
        if(E == 'S')
            System.out.print("Superior");
        else if(E == 'A')
            System.out.print("Excellent");
        else if(E == 'B')
            System.out.print("Good");
        else if(E == 'C')
            System.out.print("Usually");
        else if(E == 'D')
            System.out.print("Effort");
        else
            System.out.print("Failure");

    }
}