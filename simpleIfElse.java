import java.io.*;
public class simpleIfElse {
	public static void main(String[] args) throws IOException {
		double price, discount;
		double priceBeforeTax, netPrice;
		int qty;
		double vat = 0.07;
		String custMem = "";
		String inputPrice = "", inputQty = "";
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please input price");
		inputPrice = stdin.readLine();
		price = Double.parseDouble(inputPrice);
		System.out.print("Please input selling product");
		inputQty = stdin.readLine();
		qty = Integer.parseInt(inputQty);
		System.out.print("Are you a customer? [Y/N]");
		custMem = stdin.readLine();
		
		if (custMem.equals("Y"))
		{
			discount = 0.10;
			priceBeforeTax = (price * qty) - ((price * qty) * discount);
			netPrice = priceBeforeTax + (priceBeforeTax * vat);
		}
		else
		{
			netPrice = ((price * qty) * vat) + (price * qty);
		}
		System.out.println("Sale" + netPrice);
	}
}
