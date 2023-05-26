package ResteurantApp;



public interface OrderInterface {

	
	public default void setAmount(Order order, Product product,int newAmount) {
		/**upgrades the new amount of product.**/
	}
	
	
	public default void userConnector(int UserID,Order order) {
		/**
		 * @interface EditDialogField
		 * DEVELOPER: this method is associated with connection of userID and if UserID connection is denied pls ignore this function
		 * This method connects order to an user
		 * if user doesn't have a account or doesn't want to create one temporary guest account is associated with this tables related order
		**/
	}
	public default void payForTheOrder(Order order,int UserID) {
		/**
		*@interface EditDialogField 
		* This method pays for the order
		* this method must be called when a payment is done in the table.
		* This method searches for the user and makes payment.**/
		
	}
	
}
