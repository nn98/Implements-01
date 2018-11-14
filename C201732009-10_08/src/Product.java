
public class Product { 
	int id; 
	String name; 
	int price; 
	public Product(int id, String name, int price) { 
		this.id = id; 
		this.name = name;
		this.price = price; 
		}
	@Override 
	public String toString() { 
		// 구현할 부분 
		String r="{";
		r+=Integer.toString(this.id)+", ";
		r+=this.name+", ";
		r+=Integer.toString(this.price)+"}";
		return r;
	}
}