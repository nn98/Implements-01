import java.util.Arrays;

public class Exam07 {

	static String[] convertArray(String path) { 
		// ������ �κ� 
		String[] array=path.split("/");
		return array;
	} 
	public static void main(String[] args) { 
		String[] a = { "c:/data/student/lecture.docx", 
				"c:/www/mainpage.html", 
				"c:/program files/java/javac.exe" 
		}; 
		for (String s : a) { 
			String[] temp = convertArray(s); 
			System.out.println(Arrays.toString(temp)); 
		} 
	}
}
