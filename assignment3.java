interface Shape {
//	Create a Shape Interface with the methods "calculateArea" and "display". 
//	Create a Rectangle, Circle, and Triangle class to implement that interface.
	public void calculateArea();
	public void display();
}

class Rectangle implements Shape {
	public void calculateArea() {
		System.out.println("Rectangle area");
	}
	
	public void display() {
		System.out.println("display reactangle");
	}

	
}

class Circle implements Shape {
	public void calculateArea() {
		System.out.println("Circle area");
	}
	
	public void display() {
		System.out.println("display circle");
	}
}

class Triangle implements Shape {
	public void calculateArea() {
		System.out.println("Triangle area");
	}
	
	public void display() {
		System.out.println("Display triangle");
	}
}

class Main {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.calculateArea();
		rec.display();
		
		Circle cir = new Circle();
		cir.calculateArea();
		cir.display();
		
		Triangle tri = new Triangle();
		tri.calculateArea();
		tri.display();
		
	}
}

