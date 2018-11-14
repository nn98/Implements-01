
public class Exam05 {

	public static void doSomething(int i) {
		String count=String.format("%05d", i);
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 34, 256, 1980 }; 
		for (int i : a) 
			doSomething(i);
	}

}
