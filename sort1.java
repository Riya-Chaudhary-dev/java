import java.util.*;

class sort1{
	 void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
     int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] <= pivot) 
            { 
                i++;
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  		return i+1; 
    } 
  
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,j,ch;
		System.out.println("Choose:\n 1. Bubble sort 2. Quick sort");
		ch=in.nextInt();
		switch(ch){
			case 1:{
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
	}break;
	case 2:
	{
		System.out.println("Enter number of elements: ");
		int n= in.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter elements: ");
		for(i=0;i<n;i++)
			arr[i]=in.nextInt(); 
  
        sort1 ob = new sort1(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        for (i=0; i<n; ++i) 
            System.out.print(arr[i]+" ");  
	}
	break;
}
}
}
