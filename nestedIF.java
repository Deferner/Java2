//This program calculated to find grade
import java.io.*;
public class nestedIF {
	public static void main(String[] args) throws IOException {
		int score;
		String grade = "";
		String inputScore = "";
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please input score");
		inputScore = stdin.readLine();
		score = Integer.parseInt(inputScore);
		
		if ((score <= 100) && (score >= 80)){
			grade = "A";
			System.out.println("your grade is : " +grade);
			} else if ((score <= 79) && (score >= 70)){
				grade = "B";
				System.out.println("your grade is : " +grade);
			} else if ((score <= 69) && (score >= 60)){
				grade = "C";
				System.out.println("your grade is : " +grade);
			} else if ((score <= 59) && (score >= 50)){
				grade = "D";
				System.out.println("your grade is : " +grade);
			} else if ((score <= 49) && (score >= 0)){
				grade = "F";
				System.out.println("your grade is : " +grade);
			}
			else {
				System.out.println("Score are between 0 - 100");
			}
	}
}
