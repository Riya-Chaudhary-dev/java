import java.util.*;

class neidiff{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int i,j;
		System.out.println("Enter number of elements: ");
		int n= in.nextInt();
		int a[]= new int[n];
		System.out.println("Enter elements: ");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		int m=a[0]-a[1];

		int r,k=0;
		if(m<0)
			m=m*(-1);
		for(i=1;i<n-1;i++)
		{
			r=a[i]-a[i+1];
			if(r<0)
				r=r*(-1);
			if(m>r)
				{
					m=r;
					k=i;
			    }
				
		}
		System.out.println("The index is " + k);
		System.out.println("Least difference is "+m);
	}
}