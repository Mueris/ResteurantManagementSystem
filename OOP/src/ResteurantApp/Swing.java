package ResteurantApp;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.*;
public class Swing {
	//this class will be used to implement GUI to the project. All frontend operations will be done in this part.
	public void menu() {
		JFrame frame = new JFrame();	
		JButton signButton = new JButton();
		JButton LoginButton = new JButton();
		JButton TableButton = new JButton();
		JButton exitButton= new JButton();
		JLabel label1=new JLabel();
		
		signButton.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	frame.dispose();
					frame.setVisible(false);
		        	SignIn();    

		        }
		    });
		
		
		signButton.setText("Sign-in");
		LoginButton.setText("Log-in");
		TableButton.setText("Tables");
		exitButton.setText("exit");
		label1.setText("WELCOME TO RESTEURANT MANAGEMENT SYSTEM");
		
		
		
		label1.setBounds(225,50,400,100);
		signButton.setBounds(250, 150, 200, 100);
		LoginButton.setBounds(250, 250, 200, 100);
		TableButton.setBounds(250, 350, 200, 100);
		exitButton.setBounds(250, 450, 200, 100);
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		
		frame.add(signButton);
		frame.add(LoginButton);
		frame.add(TableButton);
		frame.add(exitButton);
		frame.add(label1);
		
		
		
		
		
		
		
	}
	public void SignIn() {//Sign operation
		JFrame signFrame=new JFrame();
		//initiallize Labels
		JLabel nameLabel= new JLabel("Please Enter Your First Name");
		JLabel lastNameLabel= new JLabel("Please Enter Your Last Name");
		JLabel phoneNumberLabel= new JLabel("Please Enter Your phone Number");
		JLabel mailLabel= new JLabel("Please Enter Your email address");
		JLabel typeLabel= new JLabel("Please The account Type as: Employee | Customer ");
		//initiallize Buttons
		JButton okayButton= new JButton();
		JButton exitButton=new JButton();
		
		okayButton.setText("GO!");
		exitButton.setText("menu");
		
		
		JTextField nameField= new JTextField();
		JTextField lastNameField= new JTextField();
		JTextField phoneNumberField= new JTextField();
		JTextField mailField= new JTextField();
		JTextField typeField= new JTextField();
		//arrenging the bounds
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
	        	if(typeField.getText().equals("Customer")) {
	        		//call addUser for customer
	        		JLabel end = new JLabel("Succesfully Signed In you can go back to menu!");
	        		end.setBounds(600,600,250,40);
	        		signFrame.add(end);
	        	}
	        	else if(typeField.getText().equals("Employee")) {
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
	        	SignIn();

	        }
	    });
		
		
		
		exitButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	signFrame.dispose();
	        	signFrame.setVisible(false);
	        	menu();    

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
	
}
