package arrayPratice;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=0;i<n-2;i++)
        {
            int sum = 0;
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
}
