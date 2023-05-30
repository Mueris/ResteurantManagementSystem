package ResteurantApp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class tableScreen {
	
	private Customer User1;
	private Customer User2;
	private Customer User3;
	private Customer User4;
	private Table table;
	private boolean user1Choosen=false;
	private boolean user2Choosen=false;
	private boolean user3Choosen=false;
	private boolean user4Choosen=false;
	private boolean tableChoosen=false;
	

	
	
	public Customer getUser1() {
		return User1;
	}

	public void setUser1(Customer user1) {
		User1 = user1;
	}

	public Customer getUser2() {
		return User2;
	}

	public void setUser2(Customer user2) {
		User2 = user2;
	}

	public Customer getUser3() {
		return User3;
	}

	public void setUser3(Customer user3) {
		User3 = user3;
	}

	public Customer getUser4() {
		return User4;
	}

	public void setUser4(Customer user4) {
		User4 = user4;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}
	public boolean isUser1Choosen() {
		return user1Choosen;
	}

	public void setUser1Choosen(boolean user1Choosen) {
		this.user1Choosen = user1Choosen;
	}
	public boolean isUser2Choosen() {
		return user2Choosen;
	}

	public void setUser2Choosen(boolean user2Choosen) {
		this.user2Choosen = user2Choosen;
	}
	public boolean isUser3Choosen() {
		return user3Choosen;
	}

	public void setUser3Choosen(boolean user3Choosen) {
		this.user3Choosen = user3Choosen;
	}
	public boolean isUser4Choosen() {
		return user4Choosen;
	}

	public void setUser4Choosen(boolean user4Choosen) {
		this.user4Choosen = user4Choosen;
	}
	public boolean isTableChoosen() {
		return tableChoosen;
	}

	public void settableChoosen(boolean tableChoosen) {
		this.tableChoosen = tableChoosen;
	}
	
	public void setChoosen1True(){
		this.user1Choosen=true;
		this.user2Choosen=false;
		this.user3Choosen=false;
		this.user4Choosen=false;
		this.tableChoosen=false;
		
	}
	public void setChoosen2True(){
		this.user2Choosen=true;
		this.user1Choosen=false;
		this.user3Choosen=false;
		this.user4Choosen=false;
		this.tableChoosen=false;
		
	}
	public void setChoosen3True(){
		this.user3Choosen=true;
		this.user2Choosen=false;
		this.user1Choosen=false;
		this.user4Choosen=false;
		this.tableChoosen=false;
		
	}
	public void setChoosen4True(){
		this.user4Choosen=true;
		this.user2Choosen=false;
		this.user3Choosen=false;
		this.user1Choosen=false;
		this.tableChoosen=false;
		
	}
	public void setTableTrue(){
		this.tableChoosen=true;
		this.user2Choosen=false;
		this.user3Choosen=false;
		this.user1Choosen=false;
		this.user4Choosen=false;
		
	}
	
	
	public void tableScreenView(Table[] tables, LinkedList<Customer>customers ,int tableID) throws IOException {
		
		
		LinkedList orders = tables[tableID].getOrders();
		String[] customer=new String[orders.size()];
		Product[] product=new Product[orders.size()];
		String[] productName=new String[orders.size()];
		String[] productID= new String[orders.size()];
		String[] quantity=new String[orders.size()];
		String[] orderID=new String[orders.size()];
		JButton[] update = new JButton[orders.size()];
		String[] categories = {"Customer", "Food","productID", "Quantity", "orderID"};//price icin quantitiy times foodPrice hesaplanabilir
		String[][] rowData = new String[6][orders.size()];
		
		
		for (int i = 0; i < orders.size(); i++) {
			customer[i]=String.valueOf(((Order) orders.get(i)).getCustomerID());
			orderID[i]=String.valueOf(((Order) orders.get(i)).getOrderID());
			product[i]=((Order) orders.get(i)).getProduct();
			productName[i]=product[i].getFood();
			productID[i]=String.valueOf(product[i].getSpecialID());
			quantity[i]=String.valueOf(((Order) orders.get(i)).getProductQuantity());

		}
		rowData[0]=customer;
		rowData[1]=productName;
		rowData[2]=productID;
		rowData[3]=quantity;
		rowData[4]=orderID;
		
		
		DefaultTableModel tableModel = new DefaultTableModel(rowData,categories);
		JTable list = new JTable(tableModel);
		list.setVisible(true);
		list.setBounds(350, 50,400, 400);
		list.setBackground(null);
		//list.setRowSelectionAllowed(tableChoosen);ROW SEÇİMİ YAPILIYOR
		
		
		
		
		JFrame tableScreen= new JFrame();
		BufferedImage buttonIcon = ImageIO.read(new File("C:\\Users\\musta\\eclipse-workspace\\OOP\\src\\user1.png"));
		BufferedImage tableIcon = ImageIO.read(new File("C:\\Users\\musta\\eclipse-workspace\\OOP\\src\\table2.png"));
		JButton user1btn= new JButton(new ImageIcon(buttonIcon));
		JButton user2btn= new JButton(new ImageIcon(buttonIcon));
		JButton user3btn= new JButton(new ImageIcon(buttonIcon));
		JButton user4btn= new JButton(new ImageIcon(buttonIcon));
		JButton table = new JButton(new ImageIcon(tableIcon));
		
		JLabel User1Name= new JLabel();
		JLabel User2Name= new JLabel();
		JLabel User3Name= new JLabel();
		JLabel User4Name= new JLabel();
		
		
		JLabel message = new JLabel();
		JTextField IDinput = new JTextField();
		JButton btn1 = new JButton("Login");
		JButton btn2 = new JButton("Login");
		JButton btn3 = new JButton("Login");
		JButton btn4 = new JButton("Login");
		
		IDinput.setVisible(false);
		btn1.setVisible(false);
		btn2.setVisible(false);
		btn3.setVisible(false);
		btn4.setVisible(false);
		message.setVisible(false);
		
		IDinput.setBounds(50,450,250,40);
		btn1.setBounds(50,500,75,40);
		btn2.setBounds(50,500,75,40);
		btn3.setBounds(50,500,75,40);
		btn4.setBounds(50,500,75,40);
		message.setBounds(50,400,250,40);
		
		table.setBounds(125,125,100,100);
		table.setBorder(BorderFactory.createEmptyBorder());
		table.setContentAreaFilled(false);
		
		user1btn.setBorder(BorderFactory.createEmptyBorder());
		user1btn.setContentAreaFilled(false);
		user1btn.setBounds(150,50,50,50);
		User1Name.setBounds(150,90,100,40);
		
		user2btn.setBorder(BorderFactory.createEmptyBorder());
		user2btn.setContentAreaFilled(false);
		user2btn.setBounds(50,150,50,50);
		User2Name.setBounds(60,190,100,40);
		
		user3btn.setBorder(BorderFactory.createEmptyBorder());
		user3btn.setContentAreaFilled(false);
		user3btn.setBounds(150,250,50,50);
		User3Name.setBounds(160,290,100,40);
		
		user4btn.setBorder(BorderFactory.createEmptyBorder());
		user4btn.setContentAreaFilled(false);
		user4btn.setBounds(250,150,50,50);
		User4Name.setBounds(305,150,100,40);
		
		
		table.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				table.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));
				user1btn.setBorder(BorderFactory.createEmptyBorder());
				user2btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user3btn.setBorder(BorderFactory.createEmptyBorder());
				user4btn.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setVisible(false);
				btn1.setVisible(false);
				btn2.setVisible(false);
				btn3.setVisible(false);
				btn4.setVisible(false);
				message.setVisible(false);
				setTableTrue();
				
			}
		});
		
		user1btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				user1btn.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));//paints the choosen user's border 
				user2btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user3btn.setBorder(BorderFactory.createEmptyBorder());
				user4btn.setBorder(BorderFactory.createEmptyBorder());
				table.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setBackground(Color.WHITE);
				btn2.setVisible(false);
				btn3.setVisible(false);
				btn4.setVisible(false);
				setChoosen1True();
				
				if(getUser1()==null) {
					message.setText("Please Enter the ID of User1: ");
					message.setVisible(true);
					IDinput.setVisible(true);
					btn1.setVisible(true);
					btn1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String id= IDinput.getText();
							for(int i = 0; i < customers.size(); i++) {
								if(customers.get(i).getUserID() == Integer.valueOf(id)) {
									setUser1(customers.get(i));
									User1Name.setText(User1.getName());
									break;
								}
									
							}
							if(User1==null) {
								IDinput.setBackground(Color.RED);
							}
							
							
						}
					});
				}
				else {//BIRI ZATEN OTURUYOR ILGILI ISLEMLER
					
				}
				
			}
		});
		
		user2btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				user2btn.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));//paints the choosen user's border 
				user1btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user3btn.setBorder(BorderFactory.createEmptyBorder());
				user4btn.setBorder(BorderFactory.createEmptyBorder());
				table.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setBackground(Color.WHITE);
				btn1.setVisible(false);
				btn3.setVisible(false);
				btn4.setVisible(false);
				setChoosen2True();
				
				if(getUser2()==null) {
					message.setText("Please Enter the ID of User2: ");
					message.setVisible(true);
					IDinput.setVisible(true);
					btn2.setVisible(true);
					btn2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String id= IDinput.getText();
							for(int i = 0; i < customers.size(); i++) {
								if(customers.get(i).getUserID() == Integer.valueOf(id)) {
									setUser2(customers.get(i));
									User2Name.setText(User2.getName());
									break;
								}
									
							}
							if(User2==null) {
								IDinput.setBackground(Color.RED);
							}
							
							
						}
					});
				}
				else {//BIRI ZATEN OTURUYOR ILGILI ISLEMLER
					
				}
				
			}
		});
		user3btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				user3btn.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));//paints the choosen user's border 
				user1btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user2btn.setBorder(BorderFactory.createEmptyBorder());
				user4btn.setBorder(BorderFactory.createEmptyBorder());
				table.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setBackground(Color.WHITE);
				btn2.setVisible(false);
				btn1.setVisible(false);
				btn4.setVisible(false);
				setChoosen3True();
				
				if(getUser3()==null) {
					message.setText("Please Enter the ID of User3: ");
					message.setVisible(true);
					IDinput.setVisible(true);
					btn3.setVisible(true);
					btn3.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String id= IDinput.getText();
							for(int i = 0; i < customers.size(); i++) {
								if(customers.get(i).getUserID() == Integer.valueOf(id)) {
									setUser3(customers.get(i));
									User3Name.setText(User3.getName());
									break;
								}
									
							}
							if(User3==null) {
								IDinput.setBackground(Color.RED);
							}
							
							
						}
					});
				}
				else {//BIRI ZATEN OTURUYOR ILGILI ISLEMLER
					
				}
				
			}
		});
		user4btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				user4btn.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));//paints the choosen user's border 
				user1btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user3btn.setBorder(BorderFactory.createEmptyBorder());
				user2btn.setBorder(BorderFactory.createEmptyBorder());
				table.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setBackground(Color.WHITE);
				btn2.setVisible(false);
				btn3.setVisible(false);
				btn1.setVisible(false);
				setChoosen4True();
				if(getUser4()==null) {
					message.setText("Please Enter the ID of User4: ");
					message.setVisible(true);
					IDinput.setVisible(true);
					btn4.setVisible(true);
					btn4.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String id= IDinput.getText();
							for(int i = 0; i < customers.size(); i++) {
								if(customers.get(i).getUserID() == Integer.valueOf(id)) {
									setUser4(customers.get(i));
									User4Name.setText(User4.getName());
									break;
									
								}
									
							}
							if(User4==null) {
								IDinput.setBackground(Color.RED);
							}
							
							
						}
					});
				}
				
				else {//BIRI ZATEN OTURUYOR ILGILI ISLEMLER
					
				}
				
				
			}
		});
		
		
		
		tableScreen.setSize(800,800);
		tableScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tableScreen.setVisible(true);
		tableScreen.getContentPane().setLayout(null);
		
		tableScreen.add(user1btn);
		tableScreen.add(user2btn);
		tableScreen.add(user3btn);
		tableScreen.add(user4btn);
		tableScreen.add(IDinput);
		tableScreen.add(btn1);
		tableScreen.add(btn2);
		tableScreen.add(btn3);
		tableScreen.add(btn4);
		tableScreen.add(message);
		tableScreen.add(User1Name);
		tableScreen.add(User2Name);
		tableScreen.add(User3Name);
		tableScreen.add(User4Name);
		tableScreen.add(table);
		tableScreen.add(list);
		
	}

	
}