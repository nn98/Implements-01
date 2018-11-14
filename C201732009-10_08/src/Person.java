import java.util.Objects;

public class Person {
	String name; 
	String no; 
	int year; 
	double grade; 
	public Person(String name, String no,int year, double grade) { 
		this.name = name; 
		this.no = no; 
		this.year = year; 
		this.grade = grade; 
	} 
	// 구현할 부분 }
	@Override
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person p=(Person)o;
			if(this.name==p.name) {
				if(this.no==p.no) {
					if(this.year==p.year) {
						if(this.grade==p.grade) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
}