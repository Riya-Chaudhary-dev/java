import java.io.*;  //Note: this code was modified to get the desired results for the conditions given
import java.util.*;
import java.util.Random;
import java.time.*;
import java.util.concurrent.*; 
import java.util.Date;

public class Test {

    public static void main(String[] args) throws  IOException{

        Scanner commandReader = new Scanner(System.in);
         Random rand = new Random(); 
  
       // System.out.println("Enter total number of elements : ");
        int length=1;
do{
        int[] input = new int[length];

       // System.out.printf("Enter "+length+" integers %n");
        for (int i = 0 ; i < length; i++) 
        {
            input[i] = rand.nextInt(10000000);// commandReader.nextInt();
        }
        Arrays.sort(input); 
        // System.out.println("Please enter number to be searched in array ");
          int key = input[length-1];
          length++;
            //rand.nextInt(100); //commandReader.nextInt();
        //System.out.println("please select 1)Recursive or 2) Non-Recursive");
        int choice= 2;//commandReader.nextInt();
switch(choice)
{
    case 1:
 long startTime = System.nanoTime();
        int index = performBinarySearch(input, key);
  long endTime = System.nanoTime();
 
    long durationInNano = (endTime - startTime);  
     
    long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);  
      // System.out.println("Time in nanoseconds is "+durationInNano);

 //   BufferedWriter out = new BufferedWriter(new FileWriter("Recursive out.txt",true));
   //     out.write(durationInNano + "\n");
   // out.close();

        if (index == -1) {
           // System.out.printf("Sorry, %d is not found in array %n", key);
                } 
        else {
           // System.out.printf("%d is found in array at index %d %n", key,index);
        }
        break;
   case 2:
    int start = 0;
     int end = input.length-1;
        long startTime1 = System.nanoTime();
        int index1 =  binarySearchRecursive(key,input,start,end);
     long endTime1 = System.nanoTime();
 
        long durationInNano1 = (endTime1 - startTime1);  
        long durationInMillis1 = TimeUnit.NANOSECONDS.toMillis(durationInNano1);  
        // System.out.println("Time in nanoseconds is "+durationInNano1);
        
        if (index1== -1) {
           // System.out.printf("Sorry, %d is not found in array %n", key);
        } else {
           // System.out.printf("%d is found in array at index %d %n", key,index1);
     BufferedWriter out = new BufferedWriter(new FileWriter("Recursive Found like actually.txt",true));
        out.write(durationInNano1 + "\n");
    out.close();
        }
        break;
    }
}while(length!=100000);
}
    public static int performBinarySearch(int[] input, int number) 
    {
        int low = 0;
        int high = input.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (input[middle] == number) {
                return middle;
            } else if (input[middle] < number) {
                low = middle + 1;
            } else if (input[middle] > number) {
                high = middle - 1;
            }
        }
        return -1;
    }
    public static int binarySearchRecursive(int key , int[] array, int start, int end)
    {
        int middle = (start + end)/2;
        if(end < start){
             return -1;
        } 
        if (key < array[middle]){
            return binarySearchRecursive(key, array, start, middle - 1);
        }
        if (key > array[middle]){
            return binarySearchRecursive(key, array, middle + 1, end);
        }
        if (key == array[middle]){
            return middle;
        }
        return -1;
}

}