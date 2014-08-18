
public class FormatNumber1 {
	public static void main(String[] args){
		double taxRate = 0.07, price = 205.5, tax = 0.0, total = 0.0;
		int unit = 5;
		tax = (unit * price) * taxRate;
		total = (unit * price) + tax;
		System.out.println("Total :$" +total);
		System.out.println("Tax :$" +tax);
	}
}
