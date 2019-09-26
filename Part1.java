import java.util.*;
import java.io.*;

class Part1{

	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		Part1 obj = new Part1();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER");
		System.out.println("1.COMMAND LINE ARGS\n2.SCANNER\n3.BUFFERED READER\n4.CONSOLE\n");
		int choice = sc.nextInt();
		
		switch(choice){
				case 1:
				System.out.println(obj.factorial(5));
				break;
			case 2:
				System.out.println("Enter an Integer");
				int number = sc.nextInt();
				System.out.println(obj.factorial(number));
				break;
			case 3:
				System.out.println("Enter an Integer");
				int number1 = Integer.parseInt(br.readLine());
				System.out.println(obj.factorial(number1));
				break;
			case 4:
				System.out.println("Enter an Integer");
				int number2 = Integer.parseInt(System.console().readLine());
				System.out.println(obj.factorial(number2));
				break;}
			}
	int factorial(int number){
		if(number==1 ||number==0) return 1;
		return number*factorial(number-1);
	}
}