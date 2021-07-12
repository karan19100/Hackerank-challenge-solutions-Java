package arrayPratice;
import java.util.Scanner;

public class FindFactorial {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        FactorialOfANumber(n);
    }

    public static void FactorialOfANumber(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("the factorial of a number is "+fact);
    }
}
