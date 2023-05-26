package ResteurantApp;

public class test {
	
	public static void main(String[] args) {
	int amountOfTable=15;//This value can be arrenged by resteurant
	Table[] tables=new Table[amountOfTable];
	User[] users=new User[20];//DEVELOPER: Another Data Type can be used for the users array bcuz the number is unexpected such as arraylist, linkedlist.
	//CircularQueue  orders = new CircularQueue();//DEVELOPER: is a priority queue better, bcuz all foods doesnt have the same preperation time?
	Table table = new Table();
	Swing a = new Swing();
	a.menu();
	}
	protected void fileReader(String file) {//a function to read file
	//when the program is started program reads files and implements users.
	//
	}
	protected void fileWriter(String file) {//a function to write file
	//in the exit, program overwrites the new data to the file.
	}
	public static void SignUp(User[] users,Employee[] employees, String accountType, Customer newCustomer) {
		/**@interface EditDialogField
		 * This method registers the users to the system.
		 * new User can be a customer or employee
		 * The process must be done by its ID number
		 */
	}
	public static void Login(int UserID, String password) {
		/**this method should be called when a user want to login**/
	}
	public int IDCalculator(String info) {
		/**
		 * 
		 * Creates Unique ID's by users type.
		 * An ID can not given to another User
		 * 
		 */
		
		return 0;
		
	}
	public int DiscountCalculator(int UserID) {
		
		/**
		 * @interface EditDialogField
		 * Calculates the Discount amount by the determined rules to the customer.
		 * Searches for the given UserID and if User exist determines the discount amount
		 * 
		 */
		return UserID;
		
	}
	public void deleteUser(User[] users,Employee[] employees, int UserID) {
		/**@interface EditDialogField
		 * This function deletes the given User. Whether it is employee or user.
		 * determines its type by ID and operates the given operataion in related part.
		 * Attention to delete a User there must be employee authorization, to delete
		 * a employee there must be a admin authorization
		 */
	}
	
	
}
