//Exchange dollar to baht program, Show on DOS
import java.io.*;
public class currencyDos {
	public static void main(String[] args) throws IOException //Operation for receive package
	{
		String inputDollar = "";
		double baht;
		double dollar;
		
		// receive dollar
		// Operation for receive string
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input your dollar: ");
		inputDollar = stdin.readLine();
		dollar = Double.parseDouble(inputDollar);
		
		baht = dollar * 30.82;
		
		System.out.println("Dollar value: " +dollar);
		System.out.println("Baht value: " + baht + " baht");
	}
}
