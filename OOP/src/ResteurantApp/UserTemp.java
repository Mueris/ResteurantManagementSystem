package ResteurantApp;


public interface UserTemp {
	
	
	public default void updateInfo(User[] users,Employee[] employees,  String userType, User newUser) {
		/**
		 *  @interface EditDialogField
		 * this method updates info of a user and employees
		 * The method must act differently according to the usertype
		 * To Update the user info first searches for the user then replace it with new one
		 * Attention to update a User there must be employee authorization, to update
		 * a employee there must be a admin authorization
		**/
	}
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
	public default void search(int UserID) {
		/**Searches for the userID and returns the user
		DEVELOPER: maybe hashtable can be implemented ?**/
	}
	
	
}
