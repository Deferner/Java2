
public class TestCircle {
	public static void main(String [] args){
		//Create object, radius is 5.0
		Circle MyCircle = new Circle(5.0);
		System.out.println("Cirlce area Radius " + MyCircle.radius + " is " + MyCircle.findArea());
		//Create object, didn't have radius
		Circle YourCircle = new Circle();
		System.out.println("Circle area Radius " + YourCircle.radius + " is " + YourCircle.findArea());
	}
}
class Circle{
	double radius;
	Circle(double r)
		{radius = r;}
	Circle()
		{radius = 10.0;}
	double findArea(){
		return radius * radius * 3.14159;
	}
}
