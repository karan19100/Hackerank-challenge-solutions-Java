package arrayPratice;
import java.util.Scanner;

public class Multiplication1x20 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        multiplication();
    }
    public static void multiplication(){
        for(int i=0;i<=10;i++) {
            for(int j=2;j<=20;j++)
            {
                System.out.print(j*i+" ");
            }
            System.out.println();
        }
    }
}
