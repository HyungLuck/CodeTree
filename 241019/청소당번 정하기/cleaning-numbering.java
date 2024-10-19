import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int cntClass = 0;
    int cntBok = 0;
    int cntToilet = 0;

    for(int i = 3; i<=n; i++){
    
    if(i%2==0)
            cntClass++;
    if(i%3==0)
            cntBok++;
    if(i%12==0)
            cntToilet++;

            
    }
    System.out.print(cntClass +" "+ cntBok+" " + cntToilet);
    }
}