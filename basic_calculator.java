import java.util.Scanner;

class hello {
    public static void main(String[] args){

         Scanner scan = new Scanner(System.in);
         System.out.println("enter the\n number 1 for addition:\n  number 2 for subraction\n number 3 for multiplication\n number 4 for division");
         int n = scan.nextInt();
         if(n<=4 && n!=0){
         System.out.println("Enter the first no");
         int a = scan.nextInt();
         System.out.println("Enter the second no");
         int b = scan.nextInt();
         if(n==1){
            int sum = a+b;
            System.out.println("the sum of two number is: " + sum);
        }
        else if(n==2) {
           int sub = a-b;
           System.out.println("the subraction of two number is: " + sub);
        }
        else if(n==3) {
           int mul = a*b;
           System.out.println("the multiplication of two number is: " + mul);
        }
        else if(n==4) {
           int div = a/b;
           System.out.println("the divsion of two number is: " + div);
        }
         }
         else if(n==0){
            System.out.println("you have entered wrong input" );
         }
         else{
            System.out.println("you have entered wrong input" );
         }

    }
}

