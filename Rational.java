import java.io.*;
import java.util.*;

class Rational
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
RNumber n1=new RNumber();
RNumber n2=new RNumber();
try
{
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	
	c=Integer.parseInt(args[2]);
	d=Integer.parseInt(args[3]);
	n1=new RNumber(a,b);
	n2=new RNumber(c,d);
}
catch(NumberFormatException e)
{
	a=b=c=d=1;
	n1=new RNumber(a,b);
	n2=new RNumber(c,d);
}
catch(ArrayIndexOutOfBoundsException e)
{
	a=b=c=d=1;
	n1=new RNumber(a,b);
	 n2=new RNumber(c,d);
}

RNumber n3=new RNumber();

int ch;

do
{
System.out.println("Enter your choice:\n");
System.out.println("1.ADD");
System.out.println("2.SUB");
System.out.println("3.MUL");
System.out.println("4.DIV");
System.out.println("5.Comapre");
int choice=sc.nextInt();
switch(choice)
{
case 1:n3.add(n1,n2);
	n3.display();
	break;
case 2:n3.sub(n1,n2);
	n3.display();
	break;
case 3:n3.mul(n1,n2);
	n3.display();
	break;
case 4:n3.div(n1,n2);
	n3.display();
	break;
case 5: n3.comp(n1,n2);
	n3.display();
	break;
default:System.out.println("Wrong Choice!!");
}
System.out.println("Do you want to continue  (0/1): \n");
ch=sc.nextInt();
}while(ch==1);
}
} 

class RNumber
{
int n,d,k;

RNumber()
{
	n=1;d=1;
}
RNumber(int x,int y)
{
	n=x;
	d=y;
	try 
	{  
		if(d==0)
		{
			throw new ArithmeticException();
		}

	}
	    catch(ArithmeticException e)
		{
			System.out.println("Enter a non zero value, for denominator:|n");
			Scanner sc=new Scanner(System.in);
			d=sc.nextInt();			
		}
}
void add(RNumber r1,RNumber r2)
{
	this.n=(r1.n*r2.d)+(r2.n*r1.d);
	this.d=r1.d*r2.d;
	int g=this.gcd(this.n,this.d);
	this.n=this.n/g;
	this.d=this.d/g;
}
void sub(RNumber r1,RNumber r2)
{
	this.n=(r1.n*r2.d)-(r2.n*r1.d);
	this.d=r1.d*r2.d;
	int g=this.gcd(this.n,this.d);
	this.n=this.n/g;
	this.d=this.d/g;
}
void mul(RNumber r1,RNumber r2)
{
	this.n=r1.n*r2.n;
	this.d=r1.d*r2.d;
	int g=this.gcd(this.n,this.d);
	this.n=this.n/g;
	this.d=this.d/g;
}
void div(RNumber r1,RNumber r2)
{
	this.n=r1.n*r2.d;
	this.d=r1.d*r2.n;
	int g=this.gcd(this.n,this.d);
	this.n=this.n/g;
	this.d=this.d/g;
}
void comp(RNumber r1,RNumber r2)
{
	float a,b;
	a=r1.n/r1.d;
	b=r2.n/r2.d;
	if(a>b)
	{
		this.n=r1.n;
		this.d=r1.d;
	}
	else
	{
		this.n=r2.n;
		this.d=r2.d;
	}
}
int gcd(int a,int b)
{
	int i=1,d=1;
	while(i<a && i<b)
	{
	if(a%i==0 && b%i==0)
	{
		d=i;
	}
		i++;
	}
	return d;
}
void display()
{
System.out.println(this.n+" /"+this.d);
}
}
