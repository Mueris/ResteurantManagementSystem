package ResteurantApp;

public interface TableInterface {
	
	public default void addOrder(Order order) {
		/**adds new products to the chosen order.*/
		
	}
	
	public default void deleteOrder(Order order) {
		/**adds new products to the chosen order.*/
		
	}
	
	public default Order selectOrder(int orderID) {
		/**adds new products to the chosen order.*/
		return null;
	}
	
	public default void addCustomer(Customer customer) {
		
	}
	
	public default void deletecustomer(Customer customer) {
		/**adds new products to the chosen order.*/
		
	}
	
	public default Customer selectCustomer(int customerID) {
		/**adds new products to the chosen order.*/
		return null;
	}
	
	public default void payForTheTable() {
		/**
		 * @interface EditDialogField
		 * 	This method must be called when all table members are done and ready to pay
		 *  After this method the table status must be upgareded
		 * @function priceCalculator must be called in this function to calculate
		 */
	}
		
	public default int payForSinglePerson() {
		
		/**
		 * @interface EditDialogField
		 * 	This method must be called when a single member is done and ready to pay
		 *  This method must update table after payment.
		 * @function priceCalculator must be called in this function to calculate
		 **/
		return 0;
	}


}
