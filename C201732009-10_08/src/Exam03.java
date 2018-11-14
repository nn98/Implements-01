
public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] a;
		Person[] b;
		
		Person[] p=new Person[2];
		p[0]=new Person("ȫ�浿", "201132050", 2, 4.1);
		p[1]=p[0];
		
		a=p;
		b=p;
		
		System.out.println(a == b); 
		System.out.println(a[0] == b[1]); 
		System.out.println(a[0].equals(b[1]));
	}

}
