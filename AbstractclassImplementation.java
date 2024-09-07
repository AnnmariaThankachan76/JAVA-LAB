abstract class Shape{
	abstract void numberOfSides();
}
class Rectangle extends Shape{
	int sides;
	public Rectangle(int sides) {
		this.sides=sides;
	}
	void numberOfSides() {
		System.out.println("The Number of sides of Rectangle is "+sides);
	}
}
class Triangle extends Shape{
	int sides;
	public Triangle(int sides) {
		this.sides=sides;
		}
	@Override
	void numberOfSides() {
	System.out.println("The Number of sides of Triangle  is "+sides);
	}
}
class Hexagon extends Shape{
	int sides;
	public Hexagon(int sides) {
		this.sides=sides;
	}
	@Override
	void numberOfSides() {
		System.out.println("The Number of sides of Hexagon is "+sides);
		}
}
public class AbstractclassImplementation {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(4);
		Triangle triangle=new Triangle(3);
		Hexagon  hexagon=new Hexagon(6);
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
		}
}
