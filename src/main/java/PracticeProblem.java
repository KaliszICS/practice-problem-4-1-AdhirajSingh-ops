public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here

	}

	public static void q3() {
		//Write question 3 code here
    }
	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}

    class Rectangle {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() { return length; }
	public double getWidth()  { return width; }

	public double area()      { return length * width; }
	public double perimeter() {
		if (width == 0 || length == 0) return 0;
		return 2 * (length + width);
	}
}

class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() { return radius; }

	public double area()          { return 3.14 * radius * radius; }
	public double circumference() { return 2 * 3.14 * radius; }
}

class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	private String eyeColour;
	private String hairColour;

	public Person(String name, int age, int height, int weight, String eyeColour, String hairColour) {
		this.name       = name;
		this.age        = age;
		this.height     = height;
		this.weight     = weight;
		this.eyeColour  = eyeColour;
		this.hairColour = hairColour;
	}

	public String getName()       { return name; }
	public int    getAge()        { return age; }
	public int    getHeight()     { return height; }
	public int    getWeight()     { return weight; }
	public String getEyeColour()  { return eyeColour; }
	public String getHairColour() { return hairColour; }
}
