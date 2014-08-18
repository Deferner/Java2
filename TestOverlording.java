
public class TestOverlording {
	public static void main(String [] args){
		TestNumber findSum = new TestNumber();
		System.out.println("Sum between 2500 and 210 is : " + findSum.sum(2500,210));
		System.out.println("Sum % between 3.125 adn 4.560 is : " + findSum.sum(3.125,4.560));
	}
}
class TestNumber{
	public int sum(int num1,int num2){
		return num1 + num2;
	}
	public double sum(double num1, double num2){
		return num1 + num2;
	}
}
