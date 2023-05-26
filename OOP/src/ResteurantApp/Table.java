package ResteurantApp;


public class Table implements TableInterface{
	 private Order[] Orders; 
	 private int TableNumber;
	 private boolean isTableAvaliable;
	 private Customer[] customers;//keeps the customers in the table
	 public Order[] getOrders() {
		return Orders;
	}
	public void setOrders(Order[] orders) {
		Orders = orders;
	}
	public int getTableNumber() {
		return TableNumber;
	}
	public void setTableNumber(int tableNumber) {
		TableNumber = tableNumber;
	}
	public boolean isTableAvaliable() {
		return isTableAvaliable;
	}
	public void setTableAvaliable(boolean isTableAvaliable) {
		this.isTableAvaliable = isTableAvaliable;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	
	
}
