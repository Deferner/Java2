import java.io.*;
public class DifferentClass {
	public static void main(String [] args) throws IOException{
		String inputNum1 = "", inputNum2 = "";
		int num1, num2;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		//Input first digit
		System.out.print("Input first digit : ");
		inputNum1 = stdin.readLine();
		num1 = Integer.parseInt(inputNum1);
		
		//Input second digit
		System.out.print("Input second digit : ");
		inputNum2 = stdin.readLine();
		num2 = Integer.parseInt(inputNum2);
		
		//Calculate maximum viable and send to method's name "max"
		int lager = TestMax.max(num1,num2);
		System.out.println("Maximum between " + num1 + " and " + num2 + " is " + lager);
	}//End method main
}//End Class DifferentClass
class TestMax {
	static int max(int num1, int num2){
		if(num1 > num2)
			return num1;
		else
			return num2;
	}
}
