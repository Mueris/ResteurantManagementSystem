package ResteurantApp;


public interface UserTemp {
	
	
	public default void setType(int UserID) {
		/**
		 *  @interface EditDialogField
		 * this method sets the type of a user such as customer, employee etc.
		 * To setType of a user info first searches for the user then replace it with new one
		**/
		
	}
	public default void logOut(int UserID) {
		/**
		 *  @interface EditDialogField
		 * this method logs out from the current account
		**/
	}
	
}
