import java.util.*;

class common{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int i,j;
		System.out.println("Enter number of elements in array: ");
		int n = in.nextInt();
		int k=0,len=0;
		int f[]= new int[n];
		int l=0,len1=0;
		int a[]= new int[n];
		int b[] = new int[n];
		int c[]= new int[n];
		System.out.println("Enter elements in array 1:");
		for(i=0;i<n;i++)
			a[i] = in.nextInt();
		System.out.println("Enter elements in array 2:");
		for(i=0;i<n;i++)
			b[i] = in.nextInt();
		System.out.println("Enter elements in array 3:");
		for(i=0;i<n;i++)
			c[i] = in.nextInt();
		//sort
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
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++)
			{
				if(b[j]>b[j+1])
				{
					int temp;
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp;
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		int r[]=new int[n];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
			if(a[i]==b[j])
				{r[k]=a[i];
				k++;
				len++;}
			
		}}
		if(len==0)
			System.out.println("No elements match");

		else
		{
		for(i=0;i<n;i++)
		{
			for(j=0;j<len;j++){
				if(c[i]==r[j]){
					f[l]=c[i];
					l++;
					len1++;
				}
				
			}
		}}
		if(len1==0)
			System.out.println("No elements match.");
		else
		{System.out.println("Matches are: ");
		for(i=0;i<len1;i++)
			System.out.println(f[i]);}

	}
}