package ResteurantApp;


public class Order {
	private Product product;
	private int orderID;
	private int CustomerID;
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

	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	
}
