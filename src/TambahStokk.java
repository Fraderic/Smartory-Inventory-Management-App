import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class TambahStokk extends javax.swing.JFrame {
	public PreparedStatement preparedStatement;
	public Connection connection;
	public Statement statement;
	static JFrame frame;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField IdField;
	private JTextField NameField;
	private JTextField StockField;
	private JTextField inField;
	private JLabel lblNewLabel_4;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_5;
	private ArrayList<String>ItemId = new ArrayList<>();
	private JPanel jp = new JPanel();
	Stuff stuff = new Stuff();
	Vector<Stuff> arraystuff = new Vector<>();
	private int i = 0 ;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setTitle("ADD ITEMS SMARTORY");
					frame.setVisible(true);
					frame.setSize(920,580);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TambahStokk(Home home) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 920,580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 920,580);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Item ID (ITD)");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel.setBounds(44, 43, 104, 14);
		panel.add(lblNewLabel);
		
		IdField = new JTextField();
		IdField.setBounds(44, 68, 366, 20);
		panel.add(IdField);
		//IdField.setColumns();
		
		
		JLabel lblNewLabel_1 = new JLabel("Nama Item");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_1.setBounds(44, 99, 86, 14);
		panel.add(lblNewLabel_1);
		
		NameField = new JTextField();
//		NameField.setColumns(10);
		NameField.setBounds(44, 124, 366, 20);
		panel.add(NameField);
		
		JLabel lblNewLabel_2 = new JLabel("Stok Barang");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_2.setBounds(44, 164, 104, 14);
		panel.add(lblNewLabel_2);
		
		StockField = new JTextField();
		StockField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//StockField.setColumns(Integer.parseInt(StockField.getText()));
		
		StockField.setBounds(44, 189, 366, 20);
		panel.add(StockField);
		
		JLabel lblNewLabel_3 = new JLabel("Kategori");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_3.setBounds(44, 277, 86, 14);
		panel.add(lblNewLabel_3);
		
		inField = new JTextField();
//		inField.setColumns(10);
		inField.setBounds(44, 245, 366, 20);
		panel.add(inField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sepatu", "Totebag", "Beanniehat"}));
		comboBox.setBounds(44, 302, 366, 20);
		panel.add(comboBox);
		
		lblNewLabel_4 = new JLabel("Barang Masuk");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_4.setBounds(44, 220, 111, 14);
		panel.add(lblNewLabel_4);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Hatstore", "Sepatuku", "BagDior"}));
		comboBox_1.setBounds(44, 357, 366, 20);
		panel.add(comboBox_1);
		
		lblNewLabel_5 = new JLabel("Supplier");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_5.setBounds(44, 333, 104, 14);
		panel.add(lblNewLabel_5);
		
		JButton CancelBut = new JButton("Cancel");
		CancelBut.setBackground(Color.RED);
		CancelBut.setBounds(172, 418, 104, 54);
		panel.add(CancelBut);
		
		JButton AddBtn = new JButton("Add");
		AddBtn.setBackground(Color.CYAN);
		AddBtn.setBounds(306, 418, 104, 54);
		panel.add(AddBtn);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(this.getClass().getResource("/logo.png")));
		lblNewLabel_6.setBounds(626, 124, 104, 125);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Smartory");
		lblNewLabel_7.setFont(new Font("Yu Gothic", Font.BOLD, 30));
		lblNewLabel_7.setBounds(612, 220, 135, 75);
		panel.add(lblNewLabel_7);
		
		AddBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(IdField.getText().equals("")) {
					JOptionPane.showMessageDialog(panel, "you have to input ItemID ","wrong ID input",JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(NameField.getText().equals("")) {
					JOptionPane.showMessageDialog(panel, "you have to input Name ","wrong input",JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(StockField.getText().equals("")) {
					JOptionPane.showMessageDialog(panel, "you have to input stok barang ","wrong input",JOptionPane.ERROR_MESSAGE);
					return;
				}if(inField.getText().equals("")) {
					JOptionPane.showMessageDialog(panel, "you have to input Jumlah barang ","wrong input",JOptionPane.ERROR_MESSAGE);
					return;
				}

				
				
				if(e.getSource()== AddBtn){
				JOptionPane.showMessageDialog(panel, "Object Added Successfully");
				ItemId.add(IdField.getText());
				

								
				
				int i = 1;

				int j = 1;
				int itemId = Integer.valueOf(IdField.getText());
				String item = NameField.getText();
				String kategori = (String) comboBox.getSelectedItem();
				int stok = Integer.valueOf(StockField.getText());
				
				int barangmasuk = Integer.valueOf(inField.getText());
				
				String supply = (String) comboBox_1.getSelectedItem();
				
				
				try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/group3","root","");
				         Statement stmt = conn.createStatement();
				      ) {  
					
					
					try {
						Class.forName("com.mysql.jdbc.Driver");
						
						connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/group3","root","");
						
						statement = connection.createStatement();
						
					} catch (Exception a) {
						// TODO Auto-generated catch block
						a.printStackTrace();
					}
					
				         // Execute a query
				         System.out.println("Inserting records into the table...");          
//				         String sql = "INSERT INTO items VALUES (itemId, 'item', 'kategori', stok, barangmasuk, 'supply')";
//				         stmt.executeUpdate(sql);
//
//				         	preparedStatement.setInt(1, itemId);
//							preparedStatement.setString(3, item);
//							preparedStatement.setString(4, kategori);
//							preparedStatement.setInt(5, stok);
//							preparedStatement.setInt(6, barangmasuk);
//							preparedStatement.setString(7, supply);
//
//							preparedStatement.execute();
//							
				         
				     			preparedStatement = connection.prepareStatement(
				    			"INSERT INTO items (itemId, item,kategori,stok,barangmasuk,supply)"
				    			+ "VALUES (?,?,?,?,?,?)");
				    			
				    		
				    			preparedStatement.setInt(1, itemId);
				    			preparedStatement.setString(2, item);
				    			preparedStatement.setString(3, kategori);
				    			preparedStatement.setInt(4, stok);
				    			preparedStatement.setInt(5, barangmasuk);
				    			preparedStatement.setString(6, supply);

				    			preparedStatement.execute();
				         
				         
				         System.out.println("Inserted records into the table...");      
				      } catch (SQLException a) {
				         a.printStackTrace();
				      }
				
				j++;
				
				home.tambahRow(itemId, item, kategori, stok, barangmasuk, supply);
				
				setVisible(false);
				Stuff newstuff = new Stuff(itemId, item, kategori, stok, barangmasuk, supply);
				}
			}
		});
		
		
		
		AddBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
			
		});
		
		CancelBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			    setVisible(false);
				
			}
			
		});
		
		
		
	}
	
	
	
	
	
	public int angka(){
		return i;
	}
	public int checker(int i) {
			
		if(ItemId.isEmpty()) {
			
			return 1;
		}else {
			return ++i;
		}
		
	}

	
	

}
