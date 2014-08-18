//โปรแกรมหาผมรวมของตัวเลข 2 จำนวน
import java.io.*;
public class ExTryCatch {
	public static void main(String[] args) throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader (System.in));
		int num1, num2;
		String inputNum = "";
		try{
			System.out.print("ป้อนตัวเลขที่ 1 : ");
			inputNum = stdin.readLine();
			num1 = Integer.parseInt(inputNum);
			System.out.print("ป้อนตัวเลขที่2 : ");
			inputNum = stdin.readLine();
			num2 = Integer.parseInt(inputNum);
			System.out.println("ผลรวม num1 และ num2 คือ : " +(num1+num2));
			
		}
		catch (NumberFormatException e)
		{
			System.out.println("ท่านป้อนข้อมูลที่ไม่ใช่ตัวเลข");
		}
	}//Method "main()"
}
