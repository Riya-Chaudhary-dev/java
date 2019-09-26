import java.util.*;

public class rat{
	public static void main(String args[])
	 {
	 	Scanner in = new Scanner(System.in);
			int ch; int rh;
			int a,b,x,y,i,j;
			Rational r1 = new Rational();
	        Rational r2 = new Rational();
		try{
			
			a=Integer.parseInt(args[0]);
	        b=Integer.parseInt(args[1]);
	        x=Integer.parseInt(args[2]);
	        y=Integer.parseInt(args[3]);
	         r1 = new Rational(a,b);
	        r2 = new Rational(x,y);

	    }
	        catch(NumberFormatException e)
	        {
	        	System.out.println("Wrong");
	        	a=b=x=y=1;
	         r1 = new Rational(a,b);
	        	r2 = new Rational(x,y);
	        }
			/*System.out.println("Enter numerator 1: ");
			a=in.nextInt();
			System.out.println("Enter denominator 1: ");
			b=in.nextInt();*/
			
		
			/*System.out.println("Enter numerator 2: ");
			x=in.nextInt();
			System.out.println("Enter denominator 2: ");
			y=in.nextInt();*/
			
			Rational r3=new Rational();
			do{
			System.out.println("Choose: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
			ch=in.nextInt();
			switch(ch)
			{case 1:
			r3=r3.add(r1,r2);
			r3.printRat(r3);
			break;
			case 2:
			r3=r3.sub(r1,r2);
			r3.printRat(r3);
			
			break;
			case 3:
	
			
			r3=r3.mul(r1,r2);
			r3.printRat(r3);
			break;
			case 4:
			
			
			r3=r3.div(r1,r2);
			r3.printRat(r3);
			break;
			default:System.out.println("Wrong Choice!!");
		}System.out.println("Do you want to continue  (0/1): \n");
		 rh=in.nextInt();
		}while(rh==1);
		
	}
}
class Rational{
	int num,den;
	Rational()
	{
		this(-1,-1);
	}
	Rational(int a,int b)
	{
		this.num=a;
		this.den=b;
	}
	Rational add(Rational r1, Rational r2)
	{
		int n,d;
		n=r1.num*r2.den+r1.den*r2.num;
		d=r1.den*r2.den;
		
		return(new Rational(n,d));
	}
	Rational sub(Rational r1, Rational r2)
	{
		int n,d;
		n=r1.num*r2.den-r1.den*r2.num;
		d=r1.den*r2.den;
		return(new Rational(n,d));
	}
	Rational mul(Rational r1, Rational r2)
	{
		int n,d;
		n=r1.num*r2.num;
		d=r1.den*r2.den;
		return(new Rational(n,d));
	}
	Rational div(Rational r1, Rational r2)
	{
		int n,d;
		n=r1.num*r2.den;
		d=r1.den*r2.num;
		return(new Rational(n,d));
	}
	
	
	public void printRat(Rational r)
	{
		int i=1,d=1;
        while(i<r.num && i<r.den)
		{
		if(r.num%i==0 && r.den%i==0)
		{
		d=i;
		}
		i++;
		}
		num=r.num/d;
		den=r.den/d;
		System.out.println(r.num + "/"+ r.den);
	}
	
} 