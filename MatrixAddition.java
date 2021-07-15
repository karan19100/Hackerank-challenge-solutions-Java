package arrayPratice;
import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the dimensions");
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] c = new int[rows][cols];
        Add(a,b,c,rows,cols);
    }

    public static void Add(int[][] a, int[][] b, int[][] c, int rows, int cols) {

        System.out.println("enter the first matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Scanner scan = new Scanner(System.in);
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("enter the second matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Scanner scan = new Scanner(System.in);
                b[i][j] = scan.nextInt();
            }
        }

        System.out.println("result is:- ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
