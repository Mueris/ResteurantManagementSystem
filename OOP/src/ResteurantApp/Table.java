package ResteurantApp;


public class Table implements TableInterface{
	 private Order[] Orders; 
	 private int TableNumber;
	 private boolean isTableAvaliable;
	 private boolean tableUser;//shows the amount of user using the table currently, DEVELOPER: maybe thisvalue can be a standart values by that more then this amount is not accepted.
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
	public boolean isTableUser() {
		return tableUser;
	}
	public void setTableUser(boolean tableUser) {
		this.tableUser = tableUser;
	}
	
	
}
