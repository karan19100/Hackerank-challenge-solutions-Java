import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		int[] array = {1,2,3,4,5};
		    int sum =6;
		    int low=0;
		    int high = array.length-1;
		    findpairs(array,low,high,sum);
		}
	
	public static void findpairs(int array[],int low,int high,int sum)
	{
	    while(low<high)
	    {
	        if(array[low]+array[high]<sum){
	            low++;
	        }
	       else if(array[low]+array[high]>sum){
	            high--;
	        }
	        else if(array[low]+array[high]==sum){
	            System.out.println("paired found("+array[low]+","+array[high]+")");
	            low++;
	            high--;
	            
	        }
	    }
	}
}
