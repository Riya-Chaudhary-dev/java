import java.lang.*;
import java.util.*;

class Driver2{
	public static void main(String[] args) {
	  ArrayList<Integer> arr = new ArrayList<Integer>() 
    { 
            { 
                add(2); 
                add(3); 
                add(4); 
            } 
        }; 

       int r=binaryN(arr,4);
       System.out.println(r);}
    public static int binaryN(List<Integer> input, int number) 
{
        int first = 0;
        int last = input.size() - 1;
        

            while(last>=first)
            {
                int middle = (first + last) / 2;
                
                if (input.get(middle) < number) 
            {
                first = middle + 1;
            } 
            else if (input.get(middle) == number) 
            {
                return middle;
            } 
            else if(input.get(middle) > number)
            {
                last = middle - 1;
            }
           
           }     return -1;
        
        
}
  }
	
