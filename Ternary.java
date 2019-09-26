import java.util.*;
class Ternary
{
	public static void main(String[] args) {
		int a,b;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=in.nextInt();
		b=in.nextInt();
		int n;
		n= (a>b)?(a%b):(b%a);
		
			System.out.println("Remainder is " + n);
	}
}