import java.io.*;

public class test2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, sum; //declares three integers
		double dollars; //declares a number that can have decimals
		
		System.out.print("How many candy do you want : ");
		System.out.flush();
		
		//read a line, and then converts it to an integer
		num1 = Integer.parseInt(stdin.readLine());
		
		System.out.print("How many suckers you do want : ");
		System.out.flush();
		num2 = Integer.parseInt(stdin.readLine());
		
		sum = num1 + num2; //adds the two numbers
		dollars = (double) sum * .75;
		System.out.println("You owe : $" + dollars);
	}
}
