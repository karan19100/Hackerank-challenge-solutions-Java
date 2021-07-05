
import java.util.*;

public class Main{
    
    public static void printAllSubarrays(int[] A) {
        Boolean found = false;
        int sum=0;
      Set <Integer> set = new HashSet<>();
      for(int element:A){
          set.add(sum);
          sum=sum+element;
          if(set.contains(sum))
          {
              found=true;
              break;
          }
      }
      if(found==true){
          System.out.println(true);
      }
      else{
          System.out.println(false);
      }
    }
    
    public static void main(String[] args){
        int[] A = {2,1,3,-4,-2};
        printAllSubarrays(A);
    }
}