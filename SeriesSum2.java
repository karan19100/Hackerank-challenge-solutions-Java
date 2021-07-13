package arrayPratice;
import java.util.Scanner;

/**
 Question :-
 1- 1/2 + 1/3 - 1/4 + 1/5- 1/6........ 1/n
 */

public class SeriesSum2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float result = 0;
        SumSeries(n,result);
    }
    public static void SumSeries(int n,float result){

        for(float i=1;i<=n;i++)
        {
            if(i%2==0){
                result-= 1/i;
            }
            else{
                result+=1/i;
            }
        }
        System.out.println(result);
    }
}
