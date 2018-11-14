

public class Exam06 {

	static String getExtension(String path) { 
		// 구현할 부분 }
		String[] array=path.split("\\.");
		return "."+array[array.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]a = {"c:/data/student/lecture.docx", 
				"c:/www/mainpage.html", 
				"c:/program files/java/javac.exe" 
				}; 
		for (String s : a) { 
			String ext = getExtension(s); 
		System.out.println(ext);
		}
	}

}
