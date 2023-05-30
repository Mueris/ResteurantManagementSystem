package ResteurantApp;
import java.awt.Color;
import java.awt.Menu;
import java.awt.Point;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
public class Swing {
	private boolean customerLogin;
	private boolean employeeLogin;
	private boolean adminLogin;
	private final boolean UserLogin=customerLogin || employeeLogin || adminLogin;//if user try to ent
	public boolean isCustomerLogin() {
		return customerLogin;
	}
	public void setCustomerLogin(boolean customerLogin) {
		this.customerLogin = customerLogin;
	}
	public boolean isEmployeeLogin() {
		return employeeLogin;
	}
	public void setEmployeeLogin(boolean employeeLogin) {
		this.employeeLogin = employeeLogin;
	}
	public boolean isAdminLogin() {
		return adminLogin;
	}
	public void setAdminLogin(boolean adminLogin) {
		this.adminLogin = adminLogin;
	}
	public boolean isUserLogin() {
		return UserLogin;
	}
	//this class will be used to implement GUI to the project. menu parts will be done in this section
	public void allTables(Table[]tables,LinkedList<Customer> customers) {
		
		JFrame tableFrame=new JFrame();
		JLabel title = new JLabel("");
		
		
		JButton table;
		
		title.setBounds(300, 50, 150, 50);
		for (int i = 0; i < tables.length; i++) {
			table=new JButton("Table: "+(i+1));
			int a =i+1;
			if(i<=4)
				table.setBounds(100+(110*i), 150, 200, 150);
			else if(i<=9)
				table.setBounds(100+(110*(i-5)), 300, 200, 80);
			else
				table.setBounds(100+(110*(i-10)), 450, 200, 80);
			table.setSize(100,80);
			table.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					tableScreen tb = new tableScreen();
					
					try {
						
						tb.tableScreenView(tables, customers,a);
						tableFrame.dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			
			tableFrame.add(table);
			tableFrame.add(title);
			
			
		
		}
		tableFrame.setSize(800,800);
		tableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tableFrame.setVisible(true);
		tableFrame.getContentPane().setLayout(null);
	}
	public void firstMenu(Table[] tables,LinkedList<Customer>customers) {
		JFrame frame = new JFrame();	
		JButton signButton = new JButton("Sign-in");
		JButton LoginButton = new JButton("Log-in");
		JButton exitButton= new JButton("Exit");//A POP UP CAN BE SHOWN "ARE YOU SURE?"
		JLabel label1=new JLabel();
		
		signButton.addActionListener(new ActionListener() {//sign up button listener
		        public void actionPerformed(ActionEvent e) {
		        	frame.dispose();
					frame.setVisible(false);
		        	SignIn(tables,customers); 
		        	test t= new test();

		        }
		    });
		LoginButton.addActionListener(new ActionListener() {//Login Button Listener
	        public void actionPerformed(ActionEvent e) {
	        	frame.dispose();
				frame.setVisible(false);
				Login log = new Login();
	        	log.login(tables,customers);    

	        }
	    });
		exitButton.addActionListener(new ActionListener() {//FILEWRITER FUNCTION WILL BE CALLED IN THIS SECTION
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.setVisible(false);
				System.exit(0);
			}
		});
		
		
		label1.setText("WELCOME TO RESTEURANT MANAGEMENT SYSTEM");
		
		
		
		label1.setBounds(200,150,400,100);//Label location arrengements
		signButton.setBounds(250, 250, 200, 100);
		LoginButton.setBounds(250, 350, 200, 100);
		exitButton.setBounds(250, 450, 200, 100);
		
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		
		frame.add(signButton);
		frame.add(LoginButton);
		frame.add(exitButton);
		frame.add(label1);
		
		
		
		
		
		
		
	}


	public void SignIn(Table[] tables,LinkedList<Customer> customers) {//Sign operation
		JFrame signFrame=new JFrame();
		//Initialize Labels
		JLabel nameLabel= new JLabel("Please Enter Your First Name");
		JLabel lastNameLabel= new JLabel("Please Enter Your Last Name");
		JLabel phoneNumberLabel= new JLabel("Please Enter Your phone Number");
		JLabel mailLabel= new JLabel("Please Enter Your email address");
		JLabel typeLabel= new JLabel("Please The account Type as: Employee | Customer ");
		//Initialize Buttons
		JButton okayButton= new JButton();
		JButton exitButton=new JButton();
		
		okayButton.setText("Sign");
		exitButton.setText("menu");
		
		
		JTextField nameField= new JTextField();
		JTextField lastNameField= new JTextField();
		JTextField phoneNumberField= new JTextField();
		JTextField mailField= new JTextField();
		JTextField typeField= new JTextField();
		//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, the bounds
		nameLabel.setBounds(100, 70, 250, 30);
		nameField.setBounds(100, 100, 250, 40);
		
		lastNameLabel.setBounds(100, 150, 250, 30);
		lastNameField.setBounds(100, 180, 250, 40);
		
		phoneNumberLabel.setBounds(100, 230, 250, 30);
		phoneNumberField.setBounds(100, 260, 250, 40);
		
		mailLabel.setBounds(100, 310, 250, 30);
		mailField.setBounds(100, 340, 250, 40);
		
		typeLabel.setBounds(100, 390, 400, 30);
		typeField.setBounds(100, 420, 250, 40);
		
		okayButton.setBounds(50, 500, 150, 75);
		exitButton.setBounds(250, 500, 150, 75);
		
		
		//action lister for buttons
		okayButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	if(typeField.getText().equalsIgnoreCase("customer")) {
	        		test t = new test();
	        		Customer cus = new Customer(nameField.getText(),lastNameField.getText(),Integer.valueOf(phoneNumberField.getText()),
	        				mailField.getText(),typeField.getText(),0,t.IDCalculator(customers.size(), "customer"));
	        		customers.add(cus);
	        		JLabel end = new JLabel("Succesfully Signed In you can go back to menu!");
	        		end.setBounds(600,600,250,40);
	        		signFrame.add(end);
	        		signFrame.dispose();
	        		signFrame.setVisible(false);
	        	}
	        	else if(typeField.getText().equalsIgnoreCase("employee")) {
	        		//call addUser for Employee
	        		JLabel end = new JLabel("Succesfully Signed In you can go back to menu!");
	        		end.setBounds(600,600,250,40);
	        		signFrame.add(end);
	        	}
	        	else {
	        		//type false
	        		JLabel end = new JLabel("Unsuccesfull! Try Again!");
	        		end.setBounds(600,600,250,40);
	        		signFrame.add(end);
	        	}
	        	SignIn(tables,customers);

	        }
	    });
		
		
		
		exitButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	signFrame.dispose();
	        	signFrame.setVisible(false);
	        	firstMenu(tables,customers);    

	        }
	    });
		
		signFrame.setSize(800,800);
		signFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signFrame.setVisible(true);
		signFrame.getContentPane().setLayout(null);
		
		signFrame.add(nameField);
		signFrame.add(lastNameField);
		signFrame.add(phoneNumberField);
		signFrame.add(mailField);
		signFrame.add(typeField);
		signFrame.add(nameLabel);
		signFrame.add(lastNameLabel);
		signFrame.add(phoneNumberLabel);
		signFrame.add(mailLabel);
		signFrame.add(typeLabel);
		signFrame.add(okayButton);
		signFrame.add(exitButton);	
	}
	
	public void employeeScreen(Table[] tablex,LinkedList<Customer>customers) {//provides a special view for employee
		if(isEmployeeLogin()) {
			
			JFrame employeeScreenFrame = new JFrame();
			//necessary button initialization
			JButton tables = new JButton("Tables");
			JButton logOut = new JButton("Log Out");
			JButton exit = new JButton("exit");
			
			JLabel wellcomeText = new JLabel("Welcome Employee! Please choose your operation");
			
			tables.setBackground(Color.GREEN);
			//arranging the bounds
			tables.setBounds(250,250,200,100);
			logOut.setBounds(250,350,200,100);
			exit.setBounds(250,450,200,100);
			
			wellcomeText.setBounds(230,105,450,100);
			//button operations
			
			tables.addActionListener(new ActionListener() {//tables screen listener
				
				@Override
				public void actionPerformed(ActionEvent e) {
					tableScreen tb= new tableScreen();
					Swing a = new Swing();
					a.allTables(tablex, customers);
					employeeScreenFrame.dispose();
					
				}
			});
			logOut.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					setEmployeeLogin(false);
					employeeScreenFrame.dispose();
					firstMenu(tablex,customers);//return first menu, log out
					
				}
			});
			exit.addActionListener(new ActionListener() {//exit button listener
				
				@Override
				public void actionPerformed(ActionEvent e) {
					employeeScreenFrame.dispose();
					System.exit(0);//exit program
					
				}
			});
			
			
			employeeScreenFrame.setSize(800,800);
			employeeScreenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			employeeScreenFrame.setVisible(true);
			employeeScreenFrame.getContentPane().setLayout(null);
			
			employeeScreenFrame.add(exit);
			employeeScreenFrame.add(tables);
			employeeScreenFrame.add(logOut);
			employeeScreenFrame.add(wellcomeText);
			
		}
			
	}
	public void adminScreen(Table[] tables,LinkedList<Customer> customers) {//provides a special view for admin
		
			JFrame adminScreenFrame = new JFrame();
			JLabel welcomeLbl = new JLabel("Welcome admin Please Choose your Operation");
			//Button initialization
			
			JButton employeesBtn = new JButton("Employees");
			JButton logOutBtn = new JButton("LogOut");
			JButton exitBtn = new JButton("Exit");
			
			welcomeLbl.setBounds(230,105,450,100);
			//Bound operations
		
			employeesBtn.setBounds(250,300,200,100);
			logOutBtn.setBounds(250,400,200,100);
			exitBtn.setBounds(250,500,200,100);
			//Button setters
			
			
			employeesBtn.addActionListener(new ActionListener() {//Shows employees when selected
				
				@Override
				public void actionPerformed(ActionEvent e) {
					adminEmployeeScreen(tables, customers);
					adminScreenFrame.dispose();
					
				}
			});
			logOutBtn.addActionListener(new ActionListener() {//Log out listener
				
				@Override
				public void actionPerformed(ActionEvent e) {
					setAdminLogin(false);
					adminScreenFrame.dispose();
					firstMenu(tables,customers);//return first menu, log out
					
				}
			});
			exitBtn.addActionListener(new ActionListener() {//Exit Button Listener
				
				@Override
				public void actionPerformed(ActionEvent e) {
					adminScreenFrame.dispose();
					System.exit(0);//exit program
					
				}
			});
			
			
			adminScreenFrame.setSize(800,800);
			adminScreenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			adminScreenFrame.setVisible(true);
			adminScreenFrame.getContentPane().setLayout(null);
			
	
			adminScreenFrame.add(employeesBtn);
			adminScreenFrame.add(logOutBtn);
			adminScreenFrame.add(exitBtn);
			adminScreenFrame.add(welcomeLbl);
			
			
		
		
	}
	public void adminEmployeeScreen(Table[] tables,LinkedList<Customer>customers) {
		
		JFrame jf = new JFrame();
		JLabel lb = new JLabel("Employees");
		lb.setBounds(300,20,250,100);
		lb.setSize(100,100);
		JButton menu =new JButton("Menu");
		JButton back=new JButton("back");
		menu.setBounds(375,625,75,40);
		back.setBounds(500,625,75,40);
		menu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				firstMenu(tables, customers);
				jf.dispose();
				
			}
		});
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				adminScreen(tables, customers);
				jf.dispose();
				
			}
		});
		LinkedList<Employee> employees=new LinkedList<Employee>();
		test t= new test();
		t.setEmployees(employees, "employees.txt");
		String[] name = new String[employees.size()];
		String[] lastName = new String[employees.size()];
		int[] phone = new int[employees.size()];
		int[] price = new int[employees.size()];
		Object[][] temp = new Object[employees.size()][4];
		for (int i = 0; i < employees.size(); i++) {
			price[i]= employees.get(i).getEmployeePrice();
			lastName[i]=employees.get(i).getSurname();
			name[i]=employees.get(i).getName();
			phone[i]=employees.get(i).getPhoneNumber();
			
		}
		String[] cat= {"Name","LastName","Phone","Salary"};
		for (int i = 0; i < employees.size(); i++) {
			temp[i][0]=name[i];
			temp[i][1]=lastName[i];
			temp[i][2]=phone[i];
			temp[i][3]=price[i];

		}
		
		DefaultTableModel tableModel = new DefaultTableModel(temp,cat);
		JTable list = new JTable(tableModel);
		list.setVisible(true);
		list.setSize(500,500);
		list.setBounds(100, 100,500, 500);
		list.setBackground(null);
		list.setRowSelectionAllowed(true);
		JScrollPane sp = new JScrollPane(list);
		list.setBorder(BorderFactory.createMatteBorder(01, 01, 01, 01,Color.BLUE));
		
		jf.setSize(800,800);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.getContentPane().setLayout(null);
		
		jf.add(sp);
		jf.add(list);
		jf.add(lb);
		jf.add(back);
		jf.add(menu);
		
		
	}
	
	
	
	
}
