
class Demo{
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(23,4);
		RtTriangle t = new RtTriangle(3,4,5);
		Circle c = new Circle(3);
		System.out.println("Area of rectangle is "+ r.getArea() + " perimeter is "+ r.getPerimeter());
		System.out.println("Area of triangle is "+ t.getArea() + " perimeter is "+ t.getPerimeter());
		System.out.println("Area of circle is "+ c.getArea()+ " perimeter is "+ c.getPerimeter());
	}
}
abstract class Shape{
	protected double dim1, dim2, dim3, numSides;
	Shape()
	{
		numSides=dim3=dim2=dim1=0;
	}
	Shape(double dim1, int n)
	{
		this.dim1=dim1;
		numSides=n;
	}
	Shape(double dim1, double dim2, int n)
	{
		this.dim1=dim1;
		this.dim2=dim2;
		numSides=n;
	}
	Shape(double dim1, double dim2, double dim3, int n)
	{
		this.dim1=dim1;
		this.dim2=dim2;
		this.dim3=dim3;
		numSides=n;
	}	
	public double getmethod()
	{
		return numSides;
	}
	abstract double getArea();
	abstract double getPerimeter();
}
class Rectangle extends Shape{
	
	Rectangle()
	{
		super();
	}
	Rectangle(double l, double b)
	{
		super(l,b,4);
	}
	double getArea()
	{
		return dim1*dim2;
	}
	double getPerimeter()
	{
		return (2*dim1 + 2*dim2);
	}
}
class RtTriangle extends Shape{
	RtTriangle()
	{
		super();
	}
	RtTriangle(double h, double b, double side3)
	{
		super(h,b,side3,3);
	}
	double getArea()
	{
		double area;
		area = 0.5*dim1*dim2;
		return area;
	}
	double getPerimeter()
	{
		double perimeter;
		perimeter= dim1+dim2+dim3;
		return perimeter;
	}

}
class Circle extends Shape{
	Circle()
	{
		super();
	}
	Circle(double r)
	{
		super(r,0);
	}
	double getArea()
	{
		double area;
		area=3.14*dim1*dim1;
		return area;
	}
	double getPerimeter()
	{
		double perimeter;
		 perimeter= 6.28*dim1;
		 return perimeter;
	}
}
