package ResteurantApp;

public interface TableInterface {
	public default void chooseTable() {
		//Chooses a table from the GUI implemented interface and if the choosen table is full there will be 2 options update or new Order
		//if the choosen table is a off table initiallizes the table with necessary variables.
	}
	public default void openTable() {
		//initiallizes a table.
		//
	}
	public default void updateTable() {
		//updates table info such as correction of wrong orders.
	}
	public default void newOrder() {
	//This method records the orders to the table and users
	//This method must be called to get order
	}
	public default void payForTheTable() {
		//This method must be called when all table members are done and ready to pay
		//After this method the table status must be upgareded
	}
	public default void payForSinglePerson() {
		//This method must be called when a single member is done and ready to pay
		//This method must update table after payment.
	}
}
