import java.util.*;

class diff{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,j;
		System.out.println("Enter number of elements: ");
		int n= in.nextInt();
		int a[]= new int[n];
		System.out.println("Enter elements: ");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array is ");
		for(i=0;i<n;i++)
			System.out.printf("%d ", a[i]);
		int d= a[n-1]-a[0];
		System.out.println("Difference between largest and smallest element is " + d);
	}
}