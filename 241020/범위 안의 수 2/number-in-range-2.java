import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    int cnt = 0;
    double avg = 0;

    for(int i = 1; i<=10; i++){
        int m = sc.nextInt();
        if(m>=0 && m<=200){
        sum +=m;
        cnt ++;
        }
    }
    if(cnt > 0){
        avg= (double)sum/cnt;
    } else{
        avg = 0;
    }
    System.out.printf("%d %.1f",sum, avg);

    }
}