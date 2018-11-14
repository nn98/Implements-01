import java.util.Arrays;


public class Exam11 { 
	public static void main(String[] args) { 
		Product[] a = new Product[] { 
				new Product(1, "钙林", 3000), 
				new Product(2, "钙林", 2000),
				new Product(3, "钙林", 3000),
				new Product(4, "阜吧府", 1000), 
				new Product(5, "家林", 2000) 
		}; 
		Arrays.sort(a, new ProductComparator() {
			@Override
			public int compare (Product p1, Product p2) {
				if (p1.price<p2.price) {
					return -1;
				}
				else if (p1.id<p2.id) {
					return 1;
				}else if ((p2.name.compareTo(p1.name)!=0)) {
					return 1;
				}
				return 0;
			}
		}); 
		for (Product p : a) 
			System.out.println(p); 
	} 
}