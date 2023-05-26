package ResteurantApp;



public interface OrderInterface {

	public default void addProduct(Order order, Product product, int amount) {
		//adds new product to the choosen order.
		
	}
	public default void setAmount(Order order, Product product,int newAmount) {
		//upgrades the new amount of product.
	}
	public default void deleteProduct(Order order, Product prodcut) {
		//deletes the choosen product if exists in the order. If it is not exist nothing happens.
	}
	public default void closeOrder(Order order) {
		//if the table order is associated is closed or done Order can be closed by this method.
		//this step should be called all the time when a table is done
	}
	public default void userConnector(int UserID,Order order) {
		//DEVELOPER: this method is associated with connection of userID and if UserID connection is denied pls ignore this function
		//This method connects order to an user
		//if user doesnt have a account or doesnt want to create one temporary guest account is associated with this tables related order
		
	}
	public default void payForTheOrder(Order order,int UserID) {
		//This method pays for the order
		//this method must be called when a payment is done in the table.
		//This method searches for the user and makes payment.
		
	}
	
}
