package ResteurantApp;


public class Order {
	private Product product;
	private int UserID;//DEVELOPER: all orders can be associated with a uniqe userID by that users can pay for their own orders and payment would be easier. Should it be associated??
	
	private int ProductQuantity; 
	private int TableNumber;
	private boolean isDelivered;//determines whether the order is delivered or not by this employees can see what to prepare
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	public int getTableNumber() {
		return TableNumber;
	}
	public void setTableNumber(int tableNumber) {
		TableNumber = tableNumber;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
}
