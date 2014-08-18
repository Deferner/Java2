//This programs find testing score that receive from keyboard
import java.io.*;
public class simpleIf {
	public static void main(String[] args) throws IOException{
		String inputScore = "";
		String stdName = "";
		String result = "Pass";
		int score;
		
		//Receive testing score and name
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please input student's name");
		stdName = stdin.readLine(); //Receive name
		System.out.println("Please input testing score");
		inputScore = stdin.readLine(); //Receive testing score to string
		score = Integer.parseInt(inputScore); //Changing score from String to integer
		
		//Testing score
		if (score < 60)
		{
			result = "Not pass";
		}
		System.out.println("Name " +stdName);
		System.out.println("Testing score " +score);
		System.out.println("Your Testing " +result);
	}
}
