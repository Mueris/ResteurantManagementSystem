package ResteurantApp;

public class Admin extends User{

	 String password;
	    int adminID;

	    public Admin(String name, String surname, int phoneNumber, String email, String type, int adminID, String password) {
	        super(name, surname, phoneNumber, email, type);
	        this.adminID = adminID;
	        this.password = password;
	    }

	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public int getAdminID() {
	        return adminID;
	    }
	    public void setAdminID(int adminID) {
	        this.adminID = adminID;
	    }
	
    //addition will be done to  this section
    //expected additions: financal features.

}