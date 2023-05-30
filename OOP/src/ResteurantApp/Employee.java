package ResteurantApp;


	public class Employee extends User  {
	    private int EmployeePrice;
	    private String EmployeePosition;
	    private int EmployeeID;
	    private String password;

	    public Employee(String name, String surname, int phoneNumber, String email, String type, int price, String position, int ID, String password) {
	        super(name, surname, phoneNumber, email, type);
	        this.EmployeePrice = price;
	        this.EmployeePosition = position;
	        this.EmployeeID = ID;
	        this.password = password;

	    }

	    public void setPassword(String newPassword) {
	        this.password = newPassword;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public int getEmployeePrice() {
	        return EmployeePrice;
	    }
	    public void setEmployeePrice(int employeePrice) {
	        EmployeePrice = employeePrice;
	    }
	    public String getEmployeePosition() {
	        return EmployeePosition;
	    }
	    public void setEmployeePosition(String employeePosition) {
	        EmployeePosition = employeePosition;
	    }
	    public int getEmployeeID() {
	        return EmployeeID;
	    }
	    public void setEmployeeID(int employeeID) {
	        EmployeeID = employeeID;
	    }
}
