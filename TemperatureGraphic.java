//โปรแกรมแปลงองศาฟาเรนไฮท์ไปเป็นองศาเซลเซียส
import javax.swing.JOptionPane; //เรียกใช้ Class"JOptionPane"เพื่อแสดง Dialog Box
public class TemperatureGraphic {
	public static void main(String[] args){
		String inputFar = "";
		double celsius;
		double farenheit;
		
		//แสดง Dialog Box เพื่อรับค่าองศาฟาเรนไฮท์
		inputFar = JOptionPane.showInputDialog("กรุณาป้อนองศาฟาเรนไฮท์");
		farenheit = Double.parseDouble(inputFar); //แปลงค่าฟาเรนไฮท์ในตัวแปร String ไปไว้ในตัวแปร Double
		celsius = (farenheit - 32.0) * (5.0/9.0);
		
		//แสดงผลลัทธ์ในโหมดกราฟฟิก 
		JOptionPane.showMessageDialog(null,"แปลงเป็นองศาเซลเซียส = " +celsius);
		System.exit(0); //ออกจากโปรแกรม
	}

}
