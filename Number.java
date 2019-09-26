import java.util.*;

class Number{
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);			
			int i,count=0;			
			System.out.println("Enter a number: ");
			int d = in.nextInt();
			for(i=2;i<d;i++)
			{
				if(d%i==0)
					count++;
			}
			if(count!=0)
				System.out.println("Not a prime");
			else
				System.out.println("prime");

		}
	
	}
