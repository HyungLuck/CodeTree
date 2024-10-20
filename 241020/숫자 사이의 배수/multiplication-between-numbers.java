import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sumVal1=0;
    int sumVal2=0;
    double avr=0;

    for(int i = a; i<=b; i++){
        if(i%5==0 || i%7==0){
        sumVal1 +=i;
        sumVal2 ++;
        avr = (double)sumVal1 / sumVal2;}

    }
    
    System.out.printf("%d" +" "+"%.1f", sumVal1, avr);
    }
}