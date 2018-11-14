
public class Exam04 {

	public static void doSomething(String s) {
		String[] array;
		array=s.split("");
		for(int i=0;i<array.length;i++)
			System.out.print("("+array[i]+") ");
		System.out.print("\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "hello", "world", "hello world" }; 
		for (String s : a) 
			doSomething(s);
	}

}
