import java.lang.*;
import java.util.*;


public class Driver
{
	public static void main(String args[]) {
		int i=0;
		for(String k: args){
			try{
				System.out.println("Hello");
				i=Integer.parseInt(k);
				if((i<0 || i>12))
					throw new MyException("Error out of bounds -> Number : "+i+" -> Not in defined Range");
				else{
					System.out.println("Factorial of "+i+" is "+Factorial.getFact(i));
				}
			}
			catch (MyException ex){
				System.out.println("Caught");
				System.out.println(ex);
			}
			catch(NumberFormatException ee){
				System.out.println("Error->Number Format Mismatch");
			}

		}
	}
}
class Factorial{
	int n;
	public Factorial(){
		this.n=0;
	}
	public Factorial(int n){
		this.n=n;
	}
	public static int getFact(int n){
		int fact=1;
		for(int i=2;i<=n;i++){
			fact*=1;
		}
		return fact;
	}
}
class MyException extends Exception{
	public MyException(String description){
		super(description);
	}
	MyException(){
		super("Error has occured");
	}
	@Override
	public String toString(){
		return super.getLocalizedMessage();
	}
}