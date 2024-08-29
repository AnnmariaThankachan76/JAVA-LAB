
import java.util.Scanner;
class Area
{
	void Area(double r)
	{
		System.out.println("The area of circle is  "+(3.14*r*r));
	}
	void Area(int l,int b)
	{
		System.out.println("The area of rectangle is  "+(l*b));
	}
	void Area(double l,double b)
	{
		System.out.println("The area of triangle is  "+((l*b)/2.0));
	}
}

public class Methodoverloading 
{
public static void main(String[] args)
{
	Area ob=new Area();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	double rs=sc.nextDouble();
	System.out.println("Enter the length and breath of rectangle ");
	int e=sc.nextInt();
	int d=sc.nextInt();
	System.out.println("Enter the base and height of triangle ");
	double h=sc.nextDouble();
	double s=sc.nextDouble();
	
	ob.Area(rs);
	ob.Area(e,d);
	ob.Area(h,s);
	}
}
