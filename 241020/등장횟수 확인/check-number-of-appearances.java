import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int cnt = 0;

    for(int i = 1; i<=5; i++){
        int m = sc.nextInt();
        if(m%2==0)
        cnt++;
    }
    System.out.print(cnt);
    }}