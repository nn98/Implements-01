import java.util.Comparator;

public class ProductComparator implements Comparator<Product>{

	public enum Compare {BY_NAME_ASC, BY_NAME_DESC, BY_PRICE_ASC, BY_PRICE_DESC, BY_ID_ASC, BY_ID_DESC};
	private Compare compare;
	
	public ProductComparator () {
		this.compare=compare;
	}
	
	@Override
	public int compare(Product p1, Product p2) {
		if (p1 == p2) return 0;
		if (p1 == null)return -1;
		if (p2 == null)return 1;
		
		switch (compare) {
		case BY_NAME_ASC: return p1.name.compareTo(p2.name);
		case BY_NAME_DESC: return p2.name.compareTo(p1.name);
		case BY_PRICE_ASC: return Integer.toString(p1.price).compareTo(Integer.toString(p2.price));
		case BY_PRICE_DESC: return Integer.toString(p2.price).compareTo(Integer.toString(p1.price));
		case BY_ID_ASC: return Integer.toString(p1.id).compareTo(Integer.toString(p2.id));
		case BY_ID_DESC: return Integer.toString(p2.id).compareTo(Integer.toString(p1.id));
		}
		return 0;
	}
}
