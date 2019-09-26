import java.util.*;

class Even{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i,j=0,k=0, len=0,len1=0;
		System.out.println("Enter number of elements in the array: ");
		int n = in.nextInt();
		int a[]= new int[n];
		int even[]= new int[n];
		int odd[]= new int[n];
		System.out.println("Enter a number: ");
		for(i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		for(i=0;i<n;i++){
			if(a[i]%2==0){
				even[j]=a[i];
				j++;
				len++;
			}
			else{
				odd[k]=a[i];
				k++;
				len1++;
			}
		}System.out.println("Even numbers are:");
		for(i=0;i<len;i++)
		System.out.println(even[i]);
	System.out.println("Odd numbers are: ");
		for(i=0;i<len1;i++)
		System.out.println(odd[i]);

	}
}