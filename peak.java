import java.util.*;

class peak{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n= in.nextInt();
		int a[]= new int[n];
		int i,j;
		System.out.println("Enter elements: ");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		int max=a[0];
		for(i=1;i<n-1;i++)
		{
			if((a[i-1]<a[i])&&(a[i]>a[i+1]))
				max=a[i];
		}
		System.out.println("The peak is " + max);
	}
}
