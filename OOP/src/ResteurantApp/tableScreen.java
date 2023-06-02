package ResteurantApp;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class tableScreen {
	
	private Customer User1;//Customer1
	private Customer User2;//Customer2
	private Customer User3;//Customer3
	private Customer User4;//Customer4
	private Table table;
	private boolean user1Choosen=false;//Customer1 is choosen
	private boolean user2Choosen=false;//Customer2 is choosen
	private boolean user3Choosen=false;//Customer3 is choosen
	private boolean user4Choosen=false;//Customer4 is choosen
	private boolean tableChoosen=false;//table is choosen
	private LinkedList<Order> orders= new LinkedList<Order>();
	private LinkedList<Order> user1Orders= new LinkedList<Order>();
	private LinkedList<Order> user2Orders= new LinkedList<Order>();
	private LinkedList<Order> user3Orders= new LinkedList<Order>();
	private LinkedList<Order> user4Orders= new LinkedList<Order>();
	
	JButton btn1 = new JButton("Login");
	JButton btn2 = new JButton("Login");
	JButton btn3 = new JButton("Login");
	JButton btn4 = new JButton("Login");
	
	JButton addOrder1 = new JButton("ORDER");
	JButton addOrder2 = new JButton("ORDER");
	JButton addOrder3 = new JButton("ORDER");
	JButton addOrder4 = new JButton("ORDER");
	
	JButton payOrder1 = new JButton("Pay1");
	JButton payOrder2 = new JButton("Pay2");
	JButton payOrder3 = new JButton("Pay3");
	JButton payOrder4 = new JButton("Pay4");
	JButton payOrderTable = new JButton("PAY TABLE");
	
	public void setButtonVisible(JButton btn) {
		btn1.setVisible(false);
		btn2.setVisible(false);
		btn3.setVisible(false);
		btn4.setVisible(false);
		
		addOrder1.setVisible(false);
		addOrder2.setVisible(false);
		addOrder3.setVisible(false);
		addOrder4.setVisible(false);
		
		payOrder1.setVisible(false);
		payOrder2.setVisible(false);
		payOrder3.setVisible(false);
		payOrder4.setVisible(false);
		
		payOrderTable.setVisible(false);
		
		btn.setVisible(true);
		if(btn==addOrder1)
			payOrder1.setVisible(true);
		if(btn==addOrder2)
			payOrder2.setVisible(true);
		if(btn==addOrder3)
			payOrder3.setVisible(true);
		if(btn==addOrder4)
			payOrder4.setVisible(true);
	}
	
	

	
	
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
	
	public LinkedList<Order> getOrders() {
		return orders;
	}

	public void setOrders(LinkedList<Order> orders) {
		this.orders = orders;
	}
	public LinkedList<Order> getuser1Orders() {
		return user1Orders;
	}

	public void setuser1Orders(LinkedList<Order> user1Orders) {
		this.user1Orders = user1Orders;
	}
	public LinkedList<Order> getuser2Orders() {
		return user2Orders;
	}

	public void setuser2Orders(LinkedList<Order> user2Orders) {
		this.user2Orders = user2Orders;
	}
	public LinkedList<Order> getuser3Orders() {
		return user3Orders;
	}

	public void setuser3Orders(LinkedList<Order> user3Orders) {
		this.user3Orders = user3Orders;
	}
	public LinkedList<Order> getuser4Orders() {
		return user4Orders;
	}

	public void setuser4Orders(LinkedList<Order> user4Orders) {
		this.user4Orders = user4Orders;
	}
	
	public void setChoosen1True(){//sets if a user choosen
		this.user1Choosen=true;
		this.user2Choosen=false;
		this.user3Choosen=false;
		this.user4Choosen=false;
		this.tableChoosen=false;
		
	}
	public void setChoosen2True(){//sets if a user choosen
		this.user2Choosen=true;
		this.user1Choosen=false;
		this.user3Choosen=false;
		this.user4Choosen=false;
		this.tableChoosen=false;
		
	}
	public void setChoosen3True(){//sets if a user choosen
		this.user3Choosen=true;
		this.user2Choosen=false;
		this.user1Choosen=false;
		this.user4Choosen=false;
		this.tableChoosen=false;
		
	}
	public void setChoosen4True(){//sets if a user choosen
		this.user4Choosen=true;
		this.user2Choosen=false;
		this.user3Choosen=false;
		this.user1Choosen=false;
		this.tableChoosen=false;
		
	}
	public void setTableTrue(){//sets if a user choosen
		this.tableChoosen=true;
		this.user2Choosen=false;
		this.user3Choosen=false;
		this.user1Choosen=false;
		this.user4Choosen=false;
		
	}
	public LinkedList<Order> personalOrderReturner(LinkedList<Order > tableOrders, Customer customer) {//Function gets the customer and table orders, @returns related user orders
		LinkedList<Order> userOrders=new LinkedList<Order>();
		for (int i = 0; i < tableOrders.size(); i++) {
			if(tableOrders.get(i).getCustomerID()==customer.getUserID()) {//controls and gets the orders which is belong to related user
				userOrders.add(tableOrders.get(i));
			}
		}
		return userOrders;
	}
	public void paymentPage(LinkedList<Order> userOrders,Table table,Customer customer) {
		JFrame paymentFrame=new JFrame();
		
		JButton useDiscount = new JButton("Use Discount");
		JButton pay = new JButton("Pay");
		
		JLabel wellcomeMessage = new JLabel("Please Choose Your payment method");
		JLabel orders= new JLabel("Wellcome"+customer.getName()+"Your Orders are listed Below");
		
		wellcomeMessage.setBounds(50,100,250,40);
		orders.setBounds(500,50,250,40);
		
		useDiscount.setBounds(400,500,150,50);
		pay.setBounds(560,500,120,50);
		
		useDiscount.setBackground(Color.GREEN);
		
		Object[][] allInfo=new Object[userOrders.size()][3];
		String[] productName=new String[userOrders.size()];
		int[] productPrice = new int[userOrders.size()];
		int[] productAmount= new int[userOrders.size()];
		String[] columns = {"Product","Product Amount","Product Price"};
		
		for (int i = 0; i < userOrders.size(); i++) {//loop to seperate titles to create a JTable
			productName[i]=userOrders.get(i).getProduct().getFood();
			productPrice[i]=userOrders.get(i).getProduct().getPrice();
			productAmount[i]=userOrders.get(i).getProductQuantity();
			allInfo[i][0]=productName[i];
			allInfo[i][1]=productPrice[i];
			allInfo[i][2]=productAmount[i];
		}
		DefaultTableModel model = new DefaultTableModel(allInfo,columns);
		JTable list = new JTable(model);
		list.setVisible(true);
		list.setSize(400,300);
		list.setBounds(350, 100,400, 300);
		list.setBackground(null);
		list.setRowSelectionAllowed(true);
		JScrollPane sp = new JScrollPane(list);
		list.setBorder(BorderFactory.createMatteBorder(01, 01, 01, 01,Color.BLUE));
		
		useDiscount.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int totaly =table.goDutch(User4);//calculates the neccesary amount NORMALDE SILIYORDU KAPATTIM DEGISIKLIKLER 4. USERDA
				int discountedy = table.useCupon(totaly, User4);//calculates discount cupon
				JLabel totalMes= new JLabel("Total Amount:");
				JLabel discounted = new JLabel("After Discount");
				
				discounted.setBounds(150,600,150,50);
				totalMes.setBounds(150,600,150,50);
				
				paymentFrame.add(totalMes);
				paymentFrame.add(discounted);
				
				
			}
		});
		
		pay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		paymentFrame.setSize(800,800);
		paymentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paymentFrame.setVisible(true);
		paymentFrame.getContentPane().setLayout(null);
		
		
		paymentFrame.add(wellcomeMessage);
		paymentFrame.add(sp);
		paymentFrame.add(orders);
		paymentFrame.add(list);
		paymentFrame.add(wellcomeMessage);
		paymentFrame.add(pay);
		paymentFrame.add(useDiscount);
		
		
	}
	
	
	public void tableScreenView(Table[] tables, LinkedList<Customer>customers,int tableID) throws IOException {//shows table screen
		JFrame tableScreen = new JFrame();
		
		
		LinkedList<Product> menu=new LinkedList<Product>();
		test.setMenu(menu,"products.csv");
		Object[][] rows = new Object[menu.size()][3];
		
		
		String[] price = new String[menu.size()];
		String[] foodName = new String[menu.size()];
		String[] Category = new String[menu.size()];
		
		String[] categories = {"Category", "Food Name","Price"};
		
		for (int i = 0; i < menu.size(); i++) {
			price[i]=String.valueOf("₺"+menu.get(i).getPrice());
			foodName[i]=menu.get(i).getFood();
			Category[i]=menu.get(i).getCategory();
		}
		for (int i = 0; i < menu.size(); i++) {
			rows[i][0]=Category[i];
			rows[i][1]=foodName[i];
			rows[i][2]=price[i];
			
		}
		
		
		
		DefaultTableModel tableModel = new DefaultTableModel(rows,categories);//shows table
		JTable list = new JTable(tableModel);
		list.setVisible(true);
		list.setSize(400,300);
		list.setBounds(350, 50,400, 300);
		list.setBackground(null);
		list.setRowSelectionAllowed(true);
		JScrollPane sp = new JScrollPane(list);
		list.setBorder(BorderFactory.createMatteBorder(01, 01, 01, 01,Color.BLUE));
		
		
		
		BufferedImage buttonIcon = ImageIO.read(new File("user1.png"));
		BufferedImage tableIcon = ImageIO.read(new File("table2.png"));
		JButton user1btn= new JButton(new ImageIcon(buttonIcon));
		JButton user2btn= new JButton(new ImageIcon(buttonIcon));
		JButton user3btn= new JButton(new ImageIcon(buttonIcon));
		JButton user4btn= new JButton(new ImageIcon(buttonIcon));
		JButton table = new JButton(new ImageIcon(tableIcon));
		JButton empMenu = new JButton("Menu");
		
		
		JButton closeTable=new JButton("CLOSE");
		closeTable.setBounds(400, 650, 75, 40);
		
		JButton exit = new JButton("exit");
		exit.setBounds(400, 600, 75, 40);
		empMenu.setBounds(500, 650, 75, 40);
		
		JLabel total=new JLabel("Total Value;");
		JLabel discounted = new JLabel("Discounted Paid Value:");
		JLabel success = new JLabel("Thank you for your payment");
			
		total.setBounds(500,400,250,40);
		discounted.setBounds(535,435,250,40);
		success.setBounds(535,470,250,40);
		
		total.setForeground(Color.RED);
		discounted.setForeground(Color.RED);
		success.setForeground(Color.GREEN);
		
		total.setVisible(false);
		discounted.setVisible(false);
		success.setVisible(false);
		
		JLabel User1Name= new JLabel();
		JLabel User2Name= new JLabel();
		JLabel User3Name= new JLabel();
		JLabel User4Name= new JLabel();
		
		
		JLabel message = new JLabel();
		JTextField IDinput = new JTextField();
		
		
		IDinput.setVisible(false);
		btn1.setVisible(false);
		btn2.setVisible(false);
		btn3.setVisible(false);
		btn4.setVisible(false);
		
		
		message.setVisible(false);
		IDinput.setBounds(50,450,250,40);
		btn1.setBounds(100,500,75,40);
		btn2.setBounds(100,500,75,40);
		btn3.setBounds(100,500,75,40);
		btn4.setBounds(100,500,75,40);
		addOrder1.setBounds(50,500,75,40);
		addOrder2.setBounds(50,500,75,40);
		addOrder3.setBounds(50,500,75,40);
		addOrder4.setBounds(50,500,75,40);
		payOrder1.setBounds(125,500,75,40);
		payOrder2.setBounds(125,500,75,40);
		payOrder3.setBounds(125,500,75,40);
		payOrder4.setBounds(125,500,75,40);
		payOrderTable.setBounds(125,500,100,50);
		message.setBounds(50,400,250,40);
		
		
		
		addOrder1.setVisible(false);
		addOrder2.setVisible(false);
		addOrder3.setVisible(false);
		addOrder4.setVisible(false);
		payOrder1.setVisible(false);
		payOrder2.setVisible(false);
		payOrder3.setVisible(false);
		payOrder4.setVisible(false);
		
		addOrder4.setEnabled(false);
		addOrder3.setEnabled(false);
		addOrder2.setEnabled(false);
		addOrder1.setEnabled(false);
		
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
		
		
		if(tables[tableID].getCustomers().size()>=1) {//refills initiallized table
			User1=tables[tableID].getCustomers().get(0);
			User1Name.setText(User1.getName());
			User1Name.setVisible(true);
		}
		 if(tables[tableID].getCustomers().size()>=2) {
			User2=tables[tableID].getCustomers().get(1);
			User2Name.setText(User2.getName());
			User2Name.setVisible(true);
		}
		 if(tables[tableID].getCustomers().size()>=3) {
			User3=tables[tableID].getCustomers().get(2);
			User3Name.setText(User3.getName());
			User3Name.setVisible(true);
		}
		 if(tables[tableID].getCustomers().size()>=4) {
			User4=tables[tableID].getCustomers().get(4);
			User4Name.setText(User4.getName());
			User4Name.setVisible(true);
		}
		
		closeTable.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tables[tableID].getCustomers().removeAll(tables[tableID].getCustomers());
				Swing a = new Swing();
				a.allTables(tables, customers);
				tableScreen.dispose();
				
			}
		});
		
		addOrder4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				int row =list.getSelectedRow();
				String name = (String) list.getModel().getValueAt(row,1);
				test t = new test();
				Product pr =t.searchProduct(name, menu);
				tables[tableID].getOrders().add(new Order(pr,User4.getUserID(),1,tableID));
				User4.setDiscountCoupons(User4.getDiscountCoupons()+1);
			
				
			}
		});
		
		payOrder4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				total.setVisible(true);
				discounted.setVisible(true);
				LinkedList<Order> orders = personalOrderReturner(tables[tableID].getOrders(),User4);
				paymentPage(orders, tables[tableID], User4);
				
				int totaly =tables[tableID].goDutch(User4);
				int discountedy = tables[tableID].useCupon(totaly, User4);
				discounted.setText("Discounted paid Value : "+discountedy);
				total.setText("Total Value without discount : "+totaly);
				if(discountedy!=totaly)
					discounted.setForeground(Color.BLUE);
				success.setVisible(true);
				System.out.println(tables[tableID].getOrders().size());
				
				
				
				
				
			}
		});
		
		addOrder1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row =list.getSelectedRow();
				String name = (String) list.getModel().getValueAt(row,1);
				test t = new test();
				Product pr =t.searchProduct(name, menu);
				tables[tableID].getOrders().add(new Order(pr,User1.getUserID(),1,tableID));
				User1.setDiscountCoupons(User1.getDiscountCoupons()+1);
			}
		});
		payOrder1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				total.setVisible(true);
				discounted.setVisible(true);
				int totaly =tables[tableID].goDutch(User1);
				int discountedy = tables[tableID].useCupon(totaly, User1);
				discounted.setText("Discounted paid Value : "+discountedy);
				total.setText("Total Value without discount : "+totaly);
				if(discountedy!=totaly)
					discounted.setForeground(Color.BLUE);
				success.setVisible(true);
				
			}
		});
		
		addOrder2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row =list.getSelectedRow();
				String name = (String) list.getModel().getValueAt(row,1);
				test t = new test();
				Product pr =t.searchProduct(name, menu);
				tables[tableID].getOrders().add(new Order(pr,User2.getUserID(),1,tableID));		
				User2.setDiscountCoupons(User2.getDiscountCoupons()+1);
			}
		});
		payOrder2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				total.setVisible(true);
				discounted.setVisible(true);
				int totaly =tables[tableID].goDutch(User2);
				int discountedy = tables[tableID].useCupon(totaly, User2);
				discounted.setText("Discounted paid Value : "+discountedy);
				total.setText("Total Value without discount : "+totaly);
				if(discountedy!=totaly)
					discounted.setForeground(Color.BLUE);
				success.setVisible(true);
				
			}
		});
		
		addOrder3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row =list.getSelectedRow();
				String name = (String) list.getModel().getValueAt(row,1);
				test t = new test();
				Product pr =t.searchProduct(name, menu);
				tables[tableID].getOrders().add(new Order(pr,User3.getUserID(),1,tableID));	
				User3.setDiscountCoupons(User3.getDiscountCoupons()+1);
			}
		});
		payOrder3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				total.setVisible(true);
				discounted.setVisible(true);
				int totaly =tables[tableID].goDutch(User3);
				int discountedy = tables[tableID].useCupon(totaly, User3);
				discounted.setText("Discounted paid Value : "+discountedy);
				total.setText("Total Value without discount : "+totaly);
				if(discountedy!=totaly)
					discounted.setForeground(Color.BLUE);
				success.setVisible(true);
				
			}
		});
		payOrderTable.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				total.setVisible(true);
				discounted.setVisible(false);
				int totaly =tables[tableID].payOrders();
				total.setText("Total Value without discount : "+totaly);
				
				success.setVisible(true);
				
			}
		});
		
		
		table.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				table.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));
				user1btn.setBorder(BorderFactory.createEmptyBorder());
				user2btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user3btn.setBorder(BorderFactory.createEmptyBorder());
				user4btn.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setVisible(false);
				message.setVisible(false);
				IDinput.setVisible(false);
				btn1.setVisible(false);
				btn2.setVisible(false);
				btn3.setVisible(false);
				btn4.setVisible(false);
				payOrderTable.setVisible(true);
				setTableTrue();
				discounted.setVisible(false);
				total.setVisible(false);
				success.setVisible(false);
				setButtonVisible(payOrderTable);
				
				
			}
		});
		
		user1btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setEnable(btn1);
				user1btn.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));//paints the choosen user's border 
				user2btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user3btn.setBorder(BorderFactory.createEmptyBorder());
				user4btn.setBorder(BorderFactory.createEmptyBorder());
				table.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setBackground(Color.WHITE);
				
				setChoosen1True();
				discounted.setVisible(false);
				total.setVisible(false);
				success.setVisible(false);
				if(getUser1()==null) {
					setButtonVisible(btn1);
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
									tables[tableID].getCustomers().add(User1);
									User1Name.setText(User1.getName());
									user1btn.setBorder(BorderFactory.createEmptyBorder());
									btn1.setVisible(false);
									IDinput.setVisible(false);
									message.setText("Successfully Loged in!");
									break;
								}
									
							}
							if(User1==null) {//ID not found exception
								IDinput.setBackground(Color.RED);
							}
							
							
						}
					});
				}
				
				else {
					setEnable(addOrder1);
					IDinput.setVisible(false);
					setButtonVisible(addOrder1);
					message.setText("Please Give an Order or Pay");
					
					addOrder1.getAction();
					payOrder1.getAction();
					
				}
				
			}
		});
		
		user2btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setEnable(btn2);
				user2btn.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));//paints the choosen user's border 
				user1btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user3btn.setBorder(BorderFactory.createEmptyBorder());
				user4btn.setBorder(BorderFactory.createEmptyBorder());
				table.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setBackground(Color.WHITE);
				
				setChoosen2True();
				discounted.setVisible(false);
				total.setVisible(false);
				success.setVisible(false);
				if(getUser2()==null ) {
					setButtonVisible(btn2);
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
									tables[tableID].getCustomers().add(User2);
									User2Name.setText(User2.getName());
									user2btn.setBorder(BorderFactory.createEmptyBorder());
									btn2.setVisible(false);
									IDinput.setVisible(false);
									message.setText("Successfully Loged in!");
									break;
								}
									
							}
							if(User2==null) {//ID not found exception
								IDinput.setBackground(Color.RED);
							}
							
							
						}
					});
				}
				
				else {
					
					
					setEnable(addOrder2);
					IDinput.setVisible(false);
					setButtonVisible(addOrder2);
					message.setText("Please Give an Order or Pay");
					
					addOrder2.getAction();
					payOrder2.getAction();
					
				}
				
			}
		});
		user3btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setEnable(btn3);
				user3btn.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));//paints the choosen user's border 
				user1btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user2btn.setBorder(BorderFactory.createEmptyBorder());
				user4btn.setBorder(BorderFactory.createEmptyBorder());
				table.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setBackground(Color.WHITE);
				
				setChoosen3True();
				discounted.setVisible(false);
				total.setVisible(false);
				success.setVisible(false);
				if(getUser3()==null) {
					setButtonVisible(btn3);
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
									tables[tableID].getCustomers().add(User3);
									User3Name.setText(User3.getName());
									user3btn.setBorder(BorderFactory.createEmptyBorder());
									btn3.setVisible(false);
									IDinput.setVisible(false);
									message.setText("Successfully Loged in!");
									break;
								}
									
							}
							if(User3==null) {//ID not found exception
								IDinput.setBackground(Color.RED);
							}
							
							
						}
					});
				}
				else {
					
					
					setEnable(addOrder3);
					IDinput.setVisible(false);
					setButtonVisible(addOrder3);
					message.setText("Please Give an Order or Pay");
					
					addOrder3.getAction();
					payOrder3.getAction();
					
				}
				
			}
		});
		user4btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setEnable(btn4);
				user4btn.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));//paints the choosen user's border 
				user1btn.setBorder(BorderFactory.createEmptyBorder());//if other users selected before they will return to default
				user3btn.setBorder(BorderFactory.createEmptyBorder());
				user2btn.setBorder(BorderFactory.createEmptyBorder());
				table.setBorder(BorderFactory.createEmptyBorder());
				IDinput.setBackground(Color.WHITE);
				setChoosen4True();
				discounted.setVisible(false);
				total.setVisible(false);
				success.setVisible(false);
				if(getUser4()==null) {
					setButtonVisible(btn4);
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
									tables[tableID].getCustomers().add(User4);
									User4Name.setText(User4.getName());
									user4btn.setBorder(BorderFactory.createEmptyBorder());
									btn4.setVisible(false);
									IDinput.setVisible(false);
									message.setText("Successfully Loged in!");
									break;
								}
									
							}
							if(User4==null) {//ID not found exception
								IDinput.setBackground(Color.RED);
							}
							
							
						}
					});
				}
				else {
					
					setEnable(addOrder4);
					IDinput.setVisible(false);
					setButtonVisible(addOrder4);
					message.setText("Please Give an Order or Pay");
					addOrder4.getAction();
					payOrder4.getAction();
					
					
					
					
					
				}
				
				
			
			}
		});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Swing a = new Swing();
				a.allTables(tables, customers);
				tableScreen.dispose();
				
			}
		});
		
		empMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Swing a = new Swing();
				
			
				a.firstMenu(tables, customers);
				tableScreen.dispose();
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
		tableScreen.add(addOrder1);
		tableScreen.add(addOrder2);
		tableScreen.add(addOrder3);
		tableScreen.add(addOrder4);
		tableScreen.add(payOrder1);
		tableScreen.add(payOrder2);
		tableScreen.add(payOrder3);
		tableScreen.add(payOrder4);
		tableScreen.add(payOrderTable);
		tableScreen.add(sp);
		tableScreen.add(discounted);
		tableScreen.add(total);
		tableScreen.add(success);
		tableScreen.add(exit);
		tableScreen.add(closeTable);
		tableScreen.add(empMenu);
		
		
		
	}
	public void payOrder(Table[] tables,int tableID, User user,boolean isTable) {
		//tables[tableID].
	}
	public void setEnable(JButton btn) {
		payOrder4.setEnabled(false);
		addOrder4.setEnabled(false);
		payOrder3.setEnabled(false);
		addOrder3.setEnabled(false);
		payOrder2.setEnabled(false);
		addOrder2.setEnabled(false);
		payOrder1.setEnabled(false);
		addOrder1.setEnabled(false);
		btn.setEnabled(true);
		if(btn==addOrder1)
			payOrder1.setEnabled(true);
		else if(btn==addOrder2)
			payOrder2.setEnabled(true);
		else if(btn==addOrder3)
			payOrder3.setEnabled(true);
		else if(btn==addOrder4)
			payOrder4.setEnabled(true);
	}
	

	

	
}