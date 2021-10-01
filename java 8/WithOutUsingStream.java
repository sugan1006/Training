Without using Stream

	import java.util.ArrayList;
	import java.util.List;

	class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
	this.id = id;
	this.name = name;
	this.price = price;
	}
	}
	public class javaNormalExample {
	public static void main(String[] args) {
	List<Product> productsList = new ArrayList<Product>();

	productsList.add(new Product(1,"Nokia",25000f));
	productsList.add(new Product(2,"Redmi",30000f));
	productsList.add(new Product(3,"Samsung",68000f));
	productsList.add(new Product(4,"Sony",50000f));
	productsList.add(new Product(5,"Apple",90000f));

	List<Float> productPriceList = new ArrayList<Float>();
	for(Product product: productsList){
	if(product.price>30000){
	productPriceList.add(product.price); 	}
	}
	System.out.println( productPriceList ); 
	}
	}
	
	output:
	[68000.0, 50000.0, 90000.0]