public class Exercise {
	public static void main(String[] args){
		int x = 2, y = 15, result1 = 0;
		double z = 2.5, result2 = 0.0;
		System.out.println("x/y = " + (x/y));
		System.out.println("y/z = " + (y/z));
		y = x++;
		z = (y++)+2;
		result1 = y % x;
		System.out.println("result1 = " +result1);
		result1 += 2;
		System.out.println("result1 = " +(result1/z));
		result2 = x % z;
		result1 = x % y;
		result2 = result1 * x / y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("result1 = " +result1);
		System.out.println("result2 = " +result2);
	}
}
