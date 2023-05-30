package ResteurantApp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	
	JLabel label=new JLabel("Please Enter Your UserID");
	JLabel label1=new JLabel("Don't have a account ?");
	JLabel label2=new JLabel();
	Swing s = new Swing();
	
	
	public void login(Table[] tables,LinkedList<Customer>customers) {
		/**This function will be assign as the first login page
		 * which will be shown by every user. If the user is a employee or admin
		 * An additional login password screen will be assigned.
		 */
		JFrame loginframe=new JFrame();
		JButton LoginBtn=new JButton("Login");
		JButton SignInBtn=new JButton("SignUp");
		JButton MenuBtn=new JButton("Menu");
		
		JTextField IDField=new JTextField();
		
		LoginBtn.setVisible(false);
		label.setBounds(300, 250, 250, 40);
		label1.setBounds(280, 380, 250, 40);
		label2.setBounds(0, 0, 0, 0);
		
		IDField.setBounds(250, 290, 250, 40);
		
		LoginBtn.setBounds(290, 337, 75, 30);
		SignInBtn.setBounds(415, 385, 75, 30);
		MenuBtn.setBounds(415, 337, 75, 30);
		
		loginframe.setSize(800,800);
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginframe.setVisible(true);
		loginframe.getContentPane().setLayout(null);
		
		IDField.addKeyListener(new KeyAdapter() {//Listens for key interrupts
	        public void keyTyped(KeyEvent  e) {
	        	int x=5;//is the valid length of the ID.
	        	label2.setText("Please Enter only integer values!");
	        	label2.setBounds(280, 300, 75, 30);
        		label2.setSize(300,100);
	        	String id=IDField.getText();  
	        	IDField.setForeground(Color.BLUE);//current color for the text,
	        	int len=id.length();
	        	if(Character.isDigit(e.getKeyChar()))
	        		len=id.length()+1;
	        	//length function reads the current possition but if the digits is integer it doesnt count the new pressed button so manually solved.
	        	if(len==x && !Character.isDigit(e.getKeyChar())) {//if length is full and a string entered
	        		e.consume();//consume needed otherwise even its full, it turns red while String entered
	        		LoginBtn.setVisible(true);
	        		label2.setVisible(false);
	        		MenuBtn.setBounds(415, 337, 75, 30);
	        		IDField.setForeground(Color.GREEN);
	        	}
	        	else if(len>x) {//if more then valid amount entered consumes
	        		e.consume();
	        		LoginBtn.setVisible(true);
	        		label2.setVisible(false);
	        		MenuBtn.setBounds(415, 337, 75, 30);
	        		IDField.setForeground(Color.GREEN);
	        	}
	        	 else if(!Character.isDigit(e.getKeyChar())) {//if String entered consumes
	        		e.consume();
	        		LoginBtn.setVisible(false);
	        		MenuBtn.setBounds(490, 337, 75, 30);
	        		label2.setVisible(true);
	        		IDField.setForeground(Color.RED);
	        	}

	        	else if(len==x) {//if length is valid validates the button
	        		LoginBtn.setVisible(true);
        			IDField.setForeground(Color.GREEN);
        			MenuBtn.setBounds(415, 337, 75, 30);
        			label2.setVisible(false);

	        	}
	        	else {//default
	        		label2.setVisible(false);
	        		LoginBtn.setVisible(false);
	        		MenuBtn.setBounds(415, 337, 75, 30);
	        	}

	        }
	    });
		
		LoginBtn.addActionListener(new ActionListener() {//Listens for Login Button
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String UserID =IDField.getText();//Gets the ID Entered
				String costumerIDField="5";//The prefix value of customer ID's
				String employeeIDField="2";//The prefix value of employee ID's
				String adminIDField="1212";//The prefix value of admin ID's
				if(UserID.substring(0,1).equals(costumerIDField)) {//determines the id is belong to a costumer or not
				
					loginframe.dispose();
					
				}
				else if(UserID.substring(0,1).equals(employeeIDField)) {//determines the id is belong to a employee or not
					loginframe.dispose();
					loginframe.setVisible(false);
					passwordLogin(tables,UserID,customers);//call employee login page
				}
				else if(UserID.substring(0,4).equals(adminIDField)) {//determines the id is belong to a admin or not
					loginframe.dispose();
					loginframe.setVisible(false);
					passwordLogin(tables,UserID,customers);
				}
				else {//ID is not valid TRY again
					IDField.setForeground(Color.RED);
				}
				
				
			}
		});
		MenuBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				s.firstMenu(tables,customers); 
				loginframe.setVisible(false);
				loginframe.dispose();
				
			}
		});
		SignInBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				s.SignIn(tables,customers);
				loginframe.setVisible(false);
				loginframe.dispose();
				
			}
		});
		
		loginframe.add(label);
		loginframe.add(label1);
		loginframe.add(label2);
		loginframe.add(LoginBtn);
		loginframe.add(SignInBtn);
		loginframe.add(MenuBtn);
		loginframe.add(IDField);
		
		
	}
	public void passwordLogin(Table[] tables,String id,LinkedList<Customer>customers) {
		test t = new test();
		LinkedList<Employee>employees=new LinkedList<Employee>();
		t.setEmployees(employees, "employees.txt");
		String employeeID="2";//default employee ID prefix
		String adminID="1212";//default admin ID prefix
		JFrame loginframe=new JFrame();
		
		JLabel password=new JLabel("Please Enter your password");
		
		JTextField IDField=new JTextField();
		JPasswordField pasField= new JPasswordField();
		
		JButton goBackBtn= new JButton("Back");
		JButton LoginBtn=new JButton("Login");
		JButton MenuBtn=new JButton("Menu");
		JButton SignInBtn=new JButton("SignUp");
		
		IDField.setText(id);//IDField comes with default id value IÇI BOS NEDENSE PASSWORD ICIN LENGTH CONTROL LAZIM
		IDField.setForeground(Color.BLACK);
		IDField.setBackground(Color.GREEN);//set color green
		
		label.setBounds(300, 250, 250, 40);//
		label1.setBounds(280, 480, 250, 40);
		password.setBounds(280,330,250,40);
		
		IDField.setBounds(250, 290, 250, 40);
		IDField.setEditable(false);//ID edition is not valid.
		pasField.setBounds(250, 370, 250, 40);
		LoginBtn.setBounds(340, 425, 75, 30);
		SignInBtn.setBounds(415, 485, 75, 30);
		MenuBtn.setBounds(600, 300, 75, 30);
		goBackBtn.setBounds(600, 360, 75, 30);
		
		pasField.addKeyListener(new KeyAdapter() {//Listens for key interrupts
	        public void keyTyped(KeyEvent  e) {
	        	pasField.setBackground(Color.WHITE);
	        	if(pasField.getPassword().length>8) {//password can not be longer then 8 chars.
	        		e.consume();
	        	}
	        	
	        	}
	        });
		
		LoginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String password =String.valueOf(pasField.getPassword());
				String truePassword="admin";//!!!!!!!a password returner func needed.!!!!
				test t = new test();
				if(t.validateEmployee(employees,Integer.valueOf(id), password)) {//GO TO employee screen typeADD
					pasField.setBackground(Color.GREEN);
					if(id.substring(0,1).equals(employeeID)) {//if password is right and id is employeeID
						s.setEmployeeLogin(true);
						s.employeeScreen(tables,customers);
						loginframe.dispose();
					}
					else if(id.substring(0,4).equals(adminID)) {//if password is right and id is adminID
						s.setAdminLogin(true);
						s.adminScreen(tables,customers);
						loginframe.dispose();
					}
					
				}
				else if(id.substring(0,4).equals(adminID) && password.equals(truePassword)) {
					s.setAdminLogin(true);
					s.adminScreen(tables,customers);
					loginframe.dispose();
				}
				else {//if password is not true
					label2.setVisible(true);
					label2.setText("INVALID PASSWORD");
					label2.setForeground(Color.RED);
					label2.setBounds(250, 425, 250, 40);
					pasField.setBackground(Color.RED);
					LoginBtn.setBounds(400, 425, 75, 30);
					loginframe.add(label2);
					
				}
				
			}
		});
		MenuBtn.addActionListener(new ActionListener() {//Menu Button Listener
			
			@Override
			public void actionPerformed(ActionEvent e) {
				s.firstMenu(tables,customers); 
				loginframe.dispose();
				loginframe.setVisible(false);
				
			}
		});
		goBackBtn.addActionListener(new ActionListener() {//Go back button Program goes to back page
			
			@Override
			public void actionPerformed(ActionEvent e) {
				login(tables,customers);
				loginframe.setVisible(false);
				loginframe.dispose();
				
			}
		});
		SignInBtn.addActionListener(new ActionListener() {//Sign in button goes to sign up page
			
			@Override
			public void actionPerformed(ActionEvent e) {
				s.SignIn(tables,customers);
				loginframe.dispose();
				loginframe.setVisible(false);
				
			}
		});
		
		
		
		
		
		loginframe.setSize(800,800);
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginframe.setVisible(true);
		loginframe.getContentPane().setLayout(null);
		
		loginframe.add(label);
		loginframe.add(label1);
		loginframe.add(label2);
		loginframe.add(password);
		loginframe.add(LoginBtn);
		loginframe.add(SignInBtn);
		loginframe.add(MenuBtn);
		loginframe.add(IDField);
		loginframe.add(pasField);
		loginframe.add(goBackBtn);
		
		
	}
}