
public class Exam09 {
	static String reverse(String path) { // 구현할 부분
		String[] array;
		array=path.split("");
		String re="";
		for(int i=array.length-1;i>=0;i--) {
			re+=array[i];
		}
		return re;
	} 
	public static void main(String[] args) { 
		String[] a = { "hello", "world", "hello world" }; 
		for (String s : a) 
			System.out.println(reverse(s)); 
	} 
}
