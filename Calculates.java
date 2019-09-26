import java.util.*;
import java.lang.Math;
//import java.String.*;
import java.io.*;
class Calculates
{
public static void main(String args[])
{
	Scanner in = new Scanner(System.in);
	
	calc cal = new calc();
	int c;
	System.out.println("Enter first number");
	int a = in.nextInt();
	System.out.println("Enter second number");
	int b = in.nextInt();
	System.out.println("*****************");
	while(true)
	{
	
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Square Root");
	System.out.println("6.Power");
	System.out.println("7.Mean");
	System.out.println("8.GCD");
	System.out.println("Enter your choice");
	int ch=in.nextInt();
	switch(ch)
	{
		case 1:
		
		c=cal.sum(a,b);	
		System.out.println("After adding=" +c);
		System.out.println("");
		break;
		
		case 2:
		
		c=cal.diff(a,b);	
		System.out.println("After subtracting=" +c);
		System.out.println("");
		break;
		
		case 3:
		
		c=cal.prod(a,b);	
		System.out.println("After multiplying=" +c);
		System.out.println("");
		break;
		
		case 4:
		
		cal.div(a,b);	
		break;
		
		case 5:
		
		cal.sqroot(a);	
		break;
		
		case 6:
		
		cal.pwr(a,b);	
		break;
		
		case 7:
		cal.mean(a,b);	
		break;
		case 8:
		cal.gcd(a,b);
		break;
}

}
}
}
class calc
{
 static int sum(int a, int b)
{
	return a+b;
}
 static int diff(int a, int b)
{
	return a-b;		
}
static int prod(int a, int b)
{
	return a*b;		
}
 static void div(int a, int b)
{
	float q,r;
	q=a/b;
	System.out.println("Quotient=" +q);
	System.out.println("");
}
 static void sqroot(int a)
	{
	System.out.println("Sqaure Root:");
	System.out.println(Math.sqrt(a));
	System.out.println("");
	
	}
	
 static void pwr(double a,double b)
	{
	System.out.println("First number raised to second number:");
	System.out.println(Math.pow(a,b));
	System.out.println("");
	
	}
	
 static void mean(int a,int b)
	{
	float m;
	float c=0;
	int ct=0;
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value");
	s=sc.nextLine();
	boolean r=s.equals("end");
	while(r!=true)
	{
		int foo=Integer.parseInt(s);
		c=c+foo;
		ct++;
		System.out.println("enter value");
		s=sc.nextLine();
		r=s.equals("end");
	}
	m=c/ct;
	//m=(int)s.charAt();
	System.out.println("Mean:" +m);
	System.out.println("");
	}
static void gcd(int a,int b)
	{	int min;
		if(a<b)
		min=a;
		else
		min=b;
		for(int i=min;i>0;i--)
		{
			if((a%i==0) && (b%i==0)){
			System.out.println(i);
			break;}
		}
	}	
	

}



