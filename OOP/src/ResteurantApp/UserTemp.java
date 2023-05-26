package ResteurantApp;


public interface UserTemp<T> {
	public static void SignUp(User[] users,Employee[] employees, String accountType, Customer newCustomer) {
		/**@interface EditDialogField
		 * This method registers the users to the system.
		 * new User can be a customer or employee
		 * The process must be done by its ID number
		 */
		
		
	}
	public default int IDCalculator(String info) {
		/**
		 * @interface EditDialogField
		 * Creates Unique ID's by users type.
		 * An ID can not given to another User
		 * 
		 */
		
		return 0;
		
	}
	public default int DiscountCalculator(int UserID) {
		
		/**
		 * @interface EditDialogField
		 * Calculates the Discount amount by the determined rules to the customer.
		 * Searches for the given UserID and if User exist determines the discount amount
		 * 
		 */
		return UserID;
		
	}
	public static void Login(int UserID, String password) {
		/**this method should be called when a user want to login**/
	}
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
	public default void deleteUser(User[] users,Employee[] employees, int UserID) {
		/**@interface EditDialogField
		 * This function deletes the given User. Whether it is employee or user.
		 * determines its type by ID and operates the given operataion in related part.
		 * Attention to delete a User there must be employee authorization, to delete
		 * a employee there must be a admin authorization
		 */
	}
	
}
