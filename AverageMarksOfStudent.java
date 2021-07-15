package arrayPratice;
import java.util.Scanner;

public class AverageMarksOfStudent {
        public static void main(String[] args){

                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int[] Marks = new int[n];
                int result=0;
                int Avg = 0;
                avg(n,Marks,result,Avg);
        }
        public static void avg(int n, int[] Marks,int result,int Avg){
                for(int i=0;i<n;i++)
                {
                        Scanner scan = new Scanner(System.in);
                        Marks[i] = scan.nextInt();
                        Avg +=Marks[i];
                }
                Avg /= n;
                System.out.println(Avg);
        }

}
