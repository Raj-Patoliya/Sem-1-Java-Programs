import java.util.*;
import java.io.*;
abstract class Shape
{
	abstract float area();
}
class Cricle extends Shape
{
	private float r;
	private final float pi = 3.14f;
	Cricle(float r)
	{	
		this.r = r;
	}	
	float area()
	{
		return (pi*r*r);
	}                                                                  
}
class Rectangle extends Shape
{
	private float l,w;
	Rectangle(float i,float j)
	{	
		this.l = i;
		this.w = j;
	}	
	float area()
	{
		return (l*w);
	} 
}
class Triangle extends Shape
{
	private float h,b;
	Triangle(float i,float j)
	{	
		this.h = i;
		this.b = j;
	}	
	float area()
	{
		return ((h*b)*0.5f);
	} 
}
public class Q10
{
	public static void main( String args[])
	{
		Cricle c = new Cricle((float)10.0);	
		System.out.print("Area of Cricle is "+c.area());

		Rectangle r = new Rectangle((float)10,(float)20);	
		System.out.print("\n\tArea of Rectangle is "+r.area());

		Triangle t = new Triangle((float)10,(float)20);	
		System.out.print("\n\tArea of Triangle is "+t.area());
	}
}
