package ResteurantApp;

import java.util.*;

public class Table implements TableInterface {
	 private LinkedList<Order> orders; 
	 private int tableNumber;
	 private boolean isTableAvaliable;
	 private LinkedList<Customer> customers;//keeps the customers in the table
	 
	 
	 public Table(LinkedList<Order> orders, int tableNumber, boolean isAvailable, LinkedList<Customer> customers ) {
		 this.orders = orders;
		 this.tableNumber = tableNumber;
		 this.isTableAvaliable = isAvailable;
		 this.customers = customers;
	 }
	 
	 public LinkedList<Order> getOrders() {
		return orders;
	}
	 
	public void setOrders(LinkedList<Order> orders) {
		this.orders = orders;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public boolean isTableAvaliable() {
		return isTableAvaliable;
	}
	public void setTableAvaliable(boolean isTableAvaliable) {
		this.isTableAvaliable = isTableAvaliable;
	}
	public LinkedList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(LinkedList<Customer> customers) {
		this.customers = customers;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	/*public Order selectOrder(int orderID) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderID() == orderID)
				return orders.get(i);
		}
		return null;
	}*/
	
	public void deleteOrder(Order order) {
		orders.remove(order);
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	/*public Customer selectCustomer(int customerID) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderID() == customerID)
				return customers.get(i);
		}
		return null;
	}*/
	
	public void deleteCustomer(Customer customer) {
		customers.remove(customer);
	}
	
	public int goDutch(Customer customer) {
		int sum = 0;
		
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getCustomerID() == customer.getUserID()) {
				sum += (orders.get(i).getProduct().getPrice() * orders.get(i).getProductQuantity());
				customer.setDiscountCoupons(customer.getDiscountCoupons() + 1);
				orders.remove(i);
			}
		}
		return sum;
	}
	
	public int payOrders() {
		int sum = 0;
		for(int i = 0; i < orders.size(); i++) {
			sum += (orders.get(i).getProduct().getPrice() * orders.get(i).getProductQuantity());
			orders.remove(i);
		}
		return sum;
	}
	
	public int useCupon(int price, Customer customer) {
		int discounter = customer.getDiscountCoupons()/4;
		price -= (discounter*10);
		customer.setDiscountCoupons(customer.getDiscountCoupons() - (discounter * 4) );
		return price;
	}
	
	
	
}