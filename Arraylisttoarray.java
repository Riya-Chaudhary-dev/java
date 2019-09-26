import java.util.*;

class arraylisttoarray{
	public static void main(String[] args) {
		ArrayList<Integer> yellow =new ArrayList<>();
		Scanner in= new Scanner(System.in);
		System.out.println("Enter size of arraylist: ");
		int n= in.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
			{int o=in.nextInt();
			yellow.add(o);}

		for(i=0;i<n;i++)
			a[i]=yellow.get(i);
		for(i=0;i<n;i++)
			System.out.println(arr[i]);

	}
}