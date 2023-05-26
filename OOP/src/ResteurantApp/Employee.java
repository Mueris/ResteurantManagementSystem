package ResteurantApp;

public class Employee extends User {
	private String EmployeePrice;
	private String EmployeePosition; 
	private int EmployeeID;
	public String getEmployeePrice() {
		return EmployeePrice;
	}
	public void setEmployeePrice(String employeePrice) {
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
