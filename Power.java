package arrayPratice;
import java.util.Scanner;

public class Power {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = 1;
        PowerOfNumbers(a,b,result);

    }
    public static void PowerOfNumbers(int a,int b,int result){
        for(int i=0;i<b;i++){
            result = result * a;
        }
        System.out.print(result);
    }
}
