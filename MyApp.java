public class MyApp {
    public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120);
    	System.out.println("Product value is " + product.countValue());
    	product.printProduct();
		
		System.out.println("\nCalling method changeAmount(245)");
		product.changeAmount(245);
		product.printProduct();
		
		System.out.println("\nCalling method changePrice(4.1)");
		product.changePrice(4.1);
		product.printProduct();
    	System.out.println("Product value is " + product.countValue());
     }
}

 class Product {
	private String name;
	private double price;
	private int amount; //Amount in storage
	public Product(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public double countValue() {
		return(amount * price);
	}
 
	public void printProduct() {
		System.out.printf("Product %s, price %4.1f and balance %d pcs \n", name,price,amount);
	}
	
	public void changeAmount(int newvalue) {
		this.amount = newvalue;
	}
	
	public void changePrice(double newPrice) {
		this.price = newPrice;
	}
}
