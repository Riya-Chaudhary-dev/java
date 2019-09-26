import java.util.*;

class Array{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, sum=0;
		System.out.println("Enter number of elements.");
		int n= in.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter elements");
		for(i=0;i<n;i++){
			arr[i] = in.nextInt();
			sum= sum+arr[i];
		}
		int avg = sum/n;
		System.out.println("Average is " +avg);
	}
}