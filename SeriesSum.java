package arrayPratice;
import java.util.Scanner;

public class SeriesSum {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float result = 0;
        SeriesSumOfANumber(n,result);
    }

    public static void SeriesSumOfANumber(int n,float result){
        for(float i=1;i<=n;i++) {
            result = result+1/i;
        }
        System.out.println(result);
    }
}
