//โปรแกรมเปรียบเทียบข้อความโดยใช้ Method equals()
public class equalString {
	public static void main(String[] args){
		String word1 = "Deferner";
		String word2 = "Deferber";
		
		System.out.println("word1 เปรียบเทียบกับ word2 = " +word1.equals(word2));
		System.out.println("word1 เปรียบเทียบกับคำว่า Deferner = " +word1.equals("Deferner"));
	}
}
