package ResteurantApp;

import java.io.*;
import java.util.*;


public class test {
	public static void main(String[] args) throws IOException {
	int amountOfTable=15;//This value can be arrenged by resteurant
	Table[] tables=new Table[amountOfTable];
	LinkedList<Customer> customers = new LinkedList<Customer>();//DEVELOPER: Another Data Type can be used for the users array bcuz the number is unexpected such as arraylist, linkedlist.
	//CircularQueue  orders = new CircularQueue();//DEVELOPER: is a priority queue better, bcuz all foods doesnt have the same preperation time?
	
	//Ä°nitializing databese ???
	for(int i = 0; i < tables.length; i++) {
		tables[i] = new Table(new LinkedList<Order>(), i+1, true, new LinkedList<Customer>());
	}
	//setCustomers(customers, "customers.txt");
	for(int i = 0; i < customers.size(); i++) {
		System.out.println(customers.get(i).getUserID());
	}
	test t = new test();
	
	
	Swing a = new Swing();
	//a.firstMenu(tables, customers);
	tableScreen tb = new tableScreen();
	tb.tableScreenView(tables, customers, 3);
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
	
	protected void writeCustomers(LinkedList<Customer> list, String file) {//a function to write file
	//in the exit, program overwrites the new data to the file.
		try {
		      FileWriter fwrite = new FileWriter(file);
		      for(int i = 0; i < list.size();i ++) {
			      fwrite.write(list.get(i).getName() + "," + list.get(i).getSurname() + "," + list.get(i).getPhoneNumber() + ","
			    		  + list.get(i).getEmail() + "," + list.get(i).getType() + "," + list.get(i).getDiscountCoupons() + "," + list.get(i).getUserID() + "\n");
		      }
		      fwrite.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	protected void writeEmployees(LinkedList<Employee> list, String file) {//a function to write file
		//in the exit, program overwrites the new data to the file.
			try {
			      FileWriter fwrite = new FileWriter(file);
			      for(int i = 0; i < list.size();i ++) {
				      fwrite.write(list.get(i).getName() + "," + list.get(i).getSurname() + "," + list.get(i).getPhoneNumber() + ","
				    		  + list.get(i).getEmail() + "," + list.get(i).getType() + "," + list.get(i).getEmployeePosition()
				    		  + "," + list.get(i).getEmployeePosition() + "," + list.get(i).getEmployeeID() + "," + list.get(i).getPassword() + "\n");
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
		/**@interface EditDialogField
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
	
	public void deleteEmployee(LinkedList<Employee> customers, int userID) {
		/**@interface EditDialogField
		 * This function deletes the given User. Whether it is employee or user.
		 * determines its type by ID and operates the given operataion in related part.
		 * Attention to delete a User there must be employee authorization, to delete
		 * a employee there must be a admin authorization
		 */
		for(int i = 0; i < customers.size(); i++) {
			if(customers.get(i).getEmployeeID() == userID)
				customers.remove(i);
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
	
	public boolean validateEmployee(LinkedList<Employee> employees, int id, String password) {
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeID() == id) {
				if(employees.get(i).getPassword().equals(password));
					return true;
			}
		}
		return false;
	}
	
	/*public boolean validateAdmin(LinkedList<Admin> admin, int id, String password) {
		for(int i = 0; i < admin.size(); i++) {
			if(admin.get(i) == id) {
				if(admin.get(i).getPassword().equals(password));
					return true;
			}
		}
		return false;
	}*/
	
}