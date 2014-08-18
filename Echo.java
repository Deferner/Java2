import java.io.*;

public class Echo {
	public static void main(String[] args) throws IOException {
		
		//Defines the standard input stream
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String message; //Create a varible called message for input
		
		System.out.print("Enter the message : ");
		System.out.flush(); //empties buffer, before you input text
		message = stdin.readLine();
		
		System.out.print("You ");
		System.out.println("entered : " + message);
		
	}//method main
}//end of class Echo
