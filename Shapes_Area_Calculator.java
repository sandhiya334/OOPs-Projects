package Class_Objects;
import java.util.*;
//polymorphism

abstract class Shapes {
    abstract double Area_of_shape();
    abstract void shape_info();
}

class Circles extends Shapes {
	double radius;
	
	public Circles (double radius) {
		this.radius = radius;
	}
	
	double Area_of_shape() {
		return Math.PI * radius * radius;
	}
	
	void shape_info() {
		System.out.println("\n\tRadius of circle : "
				+radius+"\n\tArea of Circle : "
				+Area_of_shape());
	}
}

class Squares extends Shapes{
	double side;
	
	public Squares(double side) {
		this.side = side;
	}
	
	double Area_of_shape() {
		return  side * side;
	}
	
	void shape_info() {
		System.out.println("\n\tSide of Square : "
				+side+"\n\tArea of Square : "
				+Area_of_shape());
	}
}

class Rectangles extends Shapes{
	double length;
	double breath;
	
	public Rectangles(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}
	
	double Area_of_shape() {
		return length * breath;
	}
	
	void shape_info() {
		System.out.println("\n\tLength of Rectangle : "
				+length+"\n\tBreath of Rectangle : "+breath+
				"\n\tArea of Rectangle : "
				+Area_of_shape());
	}
}

class Triangles extends Shapes{
	double base;
	double height;
	
	public Triangles (double base, double height) {
		 this.base = base;
		 this.height = height;
	}
	
	double Area_of_shape() {
		return (1/2)* base * height;
	}
	
	void shape_info() {
		System.out.println("\n\theight of Triangle : "
				+height+"\n\tBase of Triangle : "+base+
				"\n\tArea of Triangle : "
				+Area_of_shape());
	}
}

public class Shapes_Area_Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Shapes shape = null;
		
		while(true) {
			System.out.println("\n\n\n---Shape Area Calculator---");
			System.out.println("\n\t1) Circle");
			System.out.println("\n\t2) Square");
			System.out.println("\n\t3) Rectangle");
			System.out.println("\n\t4) Triangle");
			System.out.println("\n\t5) Exit");
			
			System.out.print("\nChoose Shape : ");
			int ch = sc.nextInt();
			
			if(ch == 5) {
				System.out.println("Calculator Exit...");
			}
			
			switch(ch) {
			case 1:
				System.out.println("\nCircle Area Calculation:");
				System.out.print("\n\tEnter Radius : ");
				double r = sc.nextDouble();
				shape = new Circles(r);
				break;
				
			case 2:
				System.out.println("\nSquare Area Calculation:");
				System.out.print("\n\tEnter Side : ");
				double s = sc.nextDouble();
				shape = new Squares(s);
				break;
			
			case 3:
				System.out.println("\nRectangle Area Calculation:");
				System.out.print("\n\tEnter Length : ");
				double l = sc.nextDouble();
				System.out.print("\tEnter Breath : ");
				double b = sc.nextDouble();
				shape = new Rectangles(l,b);
				break;
				
			case 4:
				System.out.println("\nTriangle Area Calculation:");
				System.out.print("\n\tEnter base : ");
				double ba = sc.nextDouble();
				System.out.print("\tEnter height : ");
				double h = sc.nextDouble();
				shape = new Triangles(ba,h);
				break;
				
			default:
                System.out.println("Invalid choice.");
                continue;
			}
			shape.shape_info();
		}
	}
}

