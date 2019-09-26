import java.util.*;

class duplicate 
{ 
     public static void main (String[] args) 
	{ 
		Scanner in= new Scanner(System.in);
		System.out.println("Enter size of array");
		 int n= in.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter data");
		for(int k=0;k<n;k++)
			arr[k]=in.nextInt();
		int[] temp = new int[n];
		int i;
		int j = 0; 

		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int t;
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
	
		for (i=0; i<n-1; i++) 
 
			if (arr[i] != arr[i+1]) 
				temp[j++] = arr[i]; 
		        temp[j++] = arr[n-1]; 
	
		for (i=0; i<j; i++) 
		System.out.print(temp[i]+" "); 
	System.out.println(" \n the size of the array is "+ j);
	} 
} 
