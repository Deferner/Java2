import javax.swing.JOptionPane;
import java.io.*;

public class Exercise2 {
	public static void main(String[] args) throws IOException {
		int num1, num2, num3;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter third integer"));
		JOptionPane.showMessageDialog(null, "Average = " +(num1 + num2 + num3)/3, null, JOptionPane.INFORMATION_MESSAGE);
	}
}
