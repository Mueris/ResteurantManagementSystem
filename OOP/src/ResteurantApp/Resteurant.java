package ResteurantApp;

public class Resteurant {
	private String RestaurantName; 
	private int RestaurantID ;
	private String RestaurantPassword; 
	private Employee[] Employees ;
	private int TotalSells ;
	private Product[] Menu ;
	private User[] users ;
	private Table[] tables;
	public String getRestaurantName() {
		return RestaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		RestaurantName = restaurantName;
	}
	public int getRestaurantID() {
		return RestaurantID;
	}
	public void setRestaurantID(int restaurantID) {
		RestaurantID = restaurantID;
	}
	public String getRestaurantPassword() {
		return RestaurantPassword;
	}
	public void setRestaurantPassword(String restaurantPassword) {
		RestaurantPassword = restaurantPassword;
	}
	public Employee[] getEmployees() {
		return Employees;
	}
	public void setEmployees(Employee[] employees) {
		Employees = employees;
	}
	public int getTotalSells() {
		return TotalSells;
	}
	public void setTotalSells(int totalSells) {
		TotalSells = totalSells;
	}
	public Product[] getMenu() {
		return Menu;
	}
	public void setMenu(Product[] menu) {
		Menu = menu;
	}
	public User[] getUsers() {
		return users;
	}
	public void setUsers(User[] users) {
		this.users = users;
	}
	public Table[] getTables() {
		return tables;
	}
	public void setTables(Table[] tables) {
		this.tables = tables;
	}
	
	
	
}
