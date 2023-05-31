package ResteurantApp;

import java.io.*;
import java.util.*;


public class test {
	
	public static void main(String[] args) throws IOException {
	int amountOfTable=15;//This value can be arrenged by resteurant
	Table[] tables=new Table[amountOfTable];//initiallize tables
	LinkedList<Customer> customers = new LinkedList<Customer>();//linkedList for customers
	
	LinkedList<Employee> employees = new LinkedList<Employee>();//linkedList for employees
	LinkedList<Product> menu = new LinkedList<Product>();//linkedList for menu

	for(int i = 0; i < tables.length; i++) {//a for loop to detemine tables
		tables[i] = new Table(new LinkedList<Order>(), i+1, true, new LinkedList<Customer>());
	}
	setCustomers(customers, "customers.txt");//fileReaders
	setEmployees(employees, "employees.txt");
	setMenu(menu,"products.csv");
	Swing a = new Swing();
	a.firstMenu(tables, customers);//initiallize GUI
	writeCustomers(customers,"customers.txt");
	writeEmployees(employees,"employees.txt");
	
	}
	protected static void setCustomers(LinkedList<Customer> list, String file) {//a function to read file
	//when the program is started program reads files and implements users.
	//
		Scanner sc = null;
		try {
			sc = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("There is no file");
			System.exit(0);
			e.printStackTrace();
		}
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			list.add(new Customer(sc.next(), sc.next(), Integer.valueOf(sc.next()), sc.next(), sc.next(), Integer.valueOf(sc.next()), Integer.valueOf(sc.next())));
		}
		sc.close();
		
	}
	
	protected static void setEmployees(LinkedList<Employee> list, String file) {//a function to read file
		//when the program is started program reads files and implements users.
		//
			Scanner sc = null;
			try {
				sc = new Scanner(new File(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.print("There is no file");
				System.exit(0);
				e.printStackTrace();
			}
			sc.useDelimiter(",");
			while(sc.hasNext()) {
				list.add(new Employee(sc.next(), sc.next(), Integer.valueOf(sc.next()), sc.next(), sc.next(), Integer.valueOf(sc.next()), sc.next(), Integer.valueOf(sc.next()), sc.next()));
			}
			sc.close();
			
	}
	
	protected static void setAdmins(LinkedList<Admin> list, String file) {//a function to read file
		//when the program is started program reads files and implements users.
		//
			Scanner sc = null;
			try {
				sc = new Scanner(new File(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.print("There is no file");
				System.exit(0);
				e.printStackTrace();
			}
			sc.useDelimiter(",");
			while(sc.hasNext()) {
				list.add(new Admin(sc.next(), sc.next(), Integer.valueOf(sc.next()), sc.next(), sc.next(), Integer.valueOf(sc.next()),sc.next()));
			}
			sc.close();
			
	}
	
	protected static void setMenu(LinkedList<Product> list, String file) {//a function to read file
		//when the program is started program reads files and implements users.
		//
			Scanner sc = null;
			try {
				sc = new Scanner(new File(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.print("There is no file");
				System.exit(0);
				e.printStackTrace();
			}
			sc.useDelimiter(",");
			while(sc.hasNext()) {
				String category = sc.next();
				String food = sc.next();
				int specialID = Integer.valueOf(sc.next());
				int price = Integer.valueOf(sc.next());
				int stock = Integer.valueOf(sc.next());
				boolean isAvailable = true;
				if(sc.next().equals("false"))
					isAvailable = false;
				
				list.add(new Product(category, food, specialID, price, stock, isAvailable));
			}
			sc.close();
			
	}
	
	protected static void writeCustomers(LinkedList<Customer> list, String file) {//a function to write file
	//in the exit, program overwrites the new data to the file.
		try {
		      FileWriter fwrite = new FileWriter(file);
		      for(int i = 0; i < list.size();i ++) {
			      fwrite.write(list.get(i).getName() + "," + list.get(i).getSurname() + "," + list.get(i).getPhoneNumber() + ","
			    		  + list.get(i).getEmail() + "," + list.get(i).getType() + "," + list.get(i).getDiscountCoupons() + "," + list.get(i).getUserID()+",");
		      }
		      fwrite.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	protected static void writeEmployees(LinkedList<Employee> list, String file) {//a function to write file
		//in the exit, program overwrites the new data to the file.
			try {
			      FileWriter fwrite = new FileWriter(file);
			      for(int i = 0; i < list.size();i ++) {
				      fwrite.write(list.get(i).getName() + "," + list.get(i).getSurname() + "," + list.get(i).getPhoneNumber() + ","
				    		  + list.get(i).getEmail() + "," + list.get(i).getType() + "," + list.get(i).getEmployeePrice()
				    		  + "," + list.get(i).getEmployeePosition() + "," + list.get(i).getEmployeeID() + "," + list.get(i).getPassword()+",");
			      }
			      fwrite.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}
	
	protected void writeAdmins(LinkedList<Admin> list, String file) {//a function to write file
		//in the exit, program overwrites the new data to the file.
			try {
			      FileWriter fwrite = new FileWriter(file);
			      for(int i = 0; i < list.size();i ++) {
				      fwrite.write(list.get(i).getName() + "," + list.get(i).getSurname() + "," + list.get(i).getPhoneNumber() + ","
				    		  + list.get(i).getEmail() + "," + list.get(i).getType() + "," + list.get(i).getAdminID() + "," + list.get(i).getPassword() + "\n");
			      }
			      fwrite.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}
	
	public int IDCalculator(int listLength, String type) {
		/**
		 * 
		 * Creates Unique ID's by users type.
		 * An ID can not given to another User
		 * 
		 */
		String id = "";
		int zeroes = 4 - String.valueOf(listLength).length();
		for(int i = 0; i < zeroes; i++) {
			id += "0";
		}
		if(type.equals("customer")) 
			id = "5" + id + String.valueOf(listLength);
		if(type.equals("employee"))
			id = "2" + id + String.valueOf(listLength);
		
		return Integer.valueOf(id);
		
	}
	
	public void deleteCustomer(LinkedList<Customer> customers, int userID) {
		/**
		 * This function deletes the given User. Whether it is employee or user.
		 * determines its type by ID and operates the given operataion in related part.
		 * Attention to delete a User there must be employee authorization, to delete
		 * a employee there must be a admin authorization
		 */
		for(int i = 0; i < customers.size(); i++) {
			if(customers.get(i).getUserID() == userID)
				customers.remove(i);
		}
		
	}
	
	public void deleteEmployee(LinkedList<Employee> employees, int userID) {
		/**
		 * This function deletes the given User. Whether it is employee or user.
		 * determines its type by ID and operates the given operataion in related part.
		 * Attention to delete a User there must be employee authorization, to delete
		 * a employee there must be a admin authorization
		 */
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeID() == userID)
				employees.remove(i);
		}
		
	}
	
	public void deleteAdmin(LinkedList<Admin> admins, int userID) {
		/**
		 * This function deletes the given User. Whether it is employee or user.
		 * determines its type by ID and operates the given operataion in related part.
		 * Attention to delete a User there must be employee authorization, to delete
		 * a employee there must be a admin authorization
		 */
		for(int i = 0; i < admins.size(); i++) {
			if(admins.get(i).getAdminID() == userID)
				admins.remove(i);
		}
		
	}
	
	public void updateProduct(LinkedList<Product> products , Product newProduct, Product oldProduct) {
		/**
		 * this updates a products information as requested.
         * searches for the product and replaces it with newProduct
		**/
		int i = products.indexOf(oldProduct);
		products.set(i, newProduct);
	}
	
	public boolean validateEmployee(LinkedList<Employee> employees, int id, String password) {//validates the password
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeID() == id) {
				if(employees.get(i).getPassword().equals(password));
					return true;
			}
		}
		return false;
	}
	public  Product searchProduct(String productName, LinkedList<Product> menu) {
        for(int i = 0; i < menu.size(); i++) {
            if(menu.get(i).getFood().equals(productName))
                return menu.get(i);
        }

        return null;
    }
	
	
}