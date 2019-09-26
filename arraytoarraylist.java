import java.util.*;
 class arraytoarraylist{

   public static void main(String[] args){
     int arr[],size;
     System.out.println("ENTER SIZE OF ARRAY");
     Scanner sc=new Scanner(System.in);
     size = sc.nextInt();
     ArrayList<Integer> a=new ArrayList<Integer>();
     arr = new int[size];
     for(int i=0;i<size;i++)
     {
       System.out.println("enter element");
       arr[i]=sc.nextInt();
     }
     for(int i=0;i<size;i++){
       a.add(arr[i]);
     }
     System.out.println(a);
   }


 }