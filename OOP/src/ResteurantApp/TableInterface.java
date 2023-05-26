package ResteurantApp;

public interface TableInterface {
	public default void chooseTable() {
		/**
		 * @interface EditDialogField
		 * 	Chooses a table from the GUI implemented interface and if the choosen table is full 
		 * there will be 2 options update or new Order
		 *  This method must be called to get order
		 */
	}
	public default void openTable() {
		/**
		 * Initializes a table 
		 * **/
	}
	public default void updateTable() {
		/**updates table info such as correction of wrong orders.**/
	}
	public default void newOrder() {
	
		/**
		 * @interface EditDialogField
		 * 	This method records the orders to the table and users
		 *  This method must be called to get order
		 */
	}
	public default void payForTheTable() {
		/**
		 * @interface EditDialogField
		 * 	This method must be called when all table members are done and ready to pay
		 *  After this method the table status must be upgareded
		 * @function priceCalculator must be called in this function to calculate
		 */
	}
		
	public default void payForSinglePerson() {
		
		/**
		 * @interface EditDialogField
		 * 	This method must be called when a single member is done and ready to pay
		 *  This method must update table after payment.
		 * @function priceCalculator must be called in this function to calculate
		 **/
	}
	public default int priceCalculator(int tableID,boolean payForTheTable,int UserID) {
	/**
	 * @interface EditDialogField
	 * 	Calculates the price of a order by given values.
	 * @member {boolean} payForTheTable is False Then calculates for UserID on The table
	 * else calculates the table's total price.
	 * This function should be called in pay functions in a loop.
	 * 
	 */
		return 0;
	}
}
