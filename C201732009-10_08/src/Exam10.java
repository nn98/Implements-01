
public class Exam10 {
	static String removeSubstring(String s, int fromIndex, int toIndex) { 
		// 구현할 부분
		String[] array;
		array=s.split("");
		String re="";
		for(int i=fromIndex;i<toIndex;i++) {
			array[i]="";
		}
		for(int i=0;i<array.length;i++) {
			re+=array[i];
		}
		return re;
	} 
	public static void main(String[] args) { 
		String[] a = { "hello", "world", "hello hello" }; 
		System.out.println(removeSubstring(a[0], 1, 4)); 
		System.out.println(removeSubstring(a[1], 2, 4)); 
		System.out.println(removeSubstring(a[2], 2, 5)); 
	} 
}
