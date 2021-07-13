package arrayPratice;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean IsPrime = true;
        int n = scan.nextInt();
        PrimeNo(n,IsPrime);
    }
    public static void PrimeNo(int n,Boolean IsPrime){
        // if the number does not have factor between 1 and root of n then the no will be prime
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                IsPrime = false;
                break;
            }
            else IsPrime = true;

        }
        if(n<2)  IsPrime= false;

        System.out.println("the number is prime "+IsPrime);
    }
}
