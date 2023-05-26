package ResteurantApp;


public interface UserTemp {
	public static void SignUp( String accountType, Customer newCustomer) {
		//with this method a user type can sign up to the program by their Role
		
	}
	public default int IDCalculator(String info) {
		//Creates uniqe ID's for user.
		//Creates the ID's according to user type and order of register.
		
		return 0;
		
	}
	public default int DiscountCalculator(int UserID) {
		//Calculates the Discount amount by the determined rules to the customer.
		//Searches for the given UserID and if User exist determines the discount amount
		return UserID;
		
	}
	public static void Login(int UserID, String password) {
		//this method should be called when a user want to login
	}
	public default void updateInfo(User user, String userType, User newUser) {
		//this method updates info of a user
		//To Update the user info first searches for the user then replace it with new one
	}
	public default void setType(int UserID) {
		//this method sets the type of a user such as customer, employee etc.
		//To setType of a user info first searches for the user then replace it with new one
	}
	public default void logOut(int UserID) {
		//this method logs out from the current account
	}
	public default void search(int UserID) {
		//Searches for the userID and returns the user
		//DEVELOPER: maybe hashtable can be implemented ?
	}
	
}
