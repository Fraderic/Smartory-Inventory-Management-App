import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import java.awt.Component;
import java.awt.Container;
import javax.swing.Box;
import java.awt.Checkbox;

public class Home extends javax.swing.JFrame {

	Stuff stuff = new Stuff();
	Vector<Stuff> arraystuff = new Vector<>();
	Vector<User> userVector;
	public JFrame frame;
	public JTextField txtCariProduk;
	JTextField label_1_1;
	int totalstok;
	public JTable table_1;
	DefaultTableModel tabel;
	public int j = 1;
	JLabel label_1_1_1;
	JTextField label_1;
	User user ;

	TambahStokk ts = new TambahStokk(this);
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//		Home window = new Home();
//		window.frame.setVisible(true);
//	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}
	
	public Home(User user) {
		this.user = user;
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */


	private void initialize() {
		frame = new JFrame();
		
		frame.setVisible(true);
		frame.setSize(920,580);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(0, 255, 255), 10), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 914, 545);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 727, 43);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNamaLogo = new JLabel("SMARTORY");
		lblNamaLogo.setForeground(Color.BLUE);
		Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage().getScaledInstance(50, 43,Image.SCALE_SMOOTH);
		lblNamaLogo.setIcon(new ImageIcon (img));
		
	
		lblNamaLogo.setBounds(12, 0, 207, 43);
		panel_1.add(lblNamaLogo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(726, 0, 188, 43);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		
		
		JLabel lblNama = new JLabel(user.getUserVek());
		lblNama.setFont(new Font("Tahoma", Font.PLAIN, 15));
	//	Image gambar = new ImageIcon(this.getClass().getResource("Ellipse 1.png")).getImage().getScaledInstance(35,  35, Image.SCALE_SMOOTH);
	//	lblNama.setIcon(new ImageIcon(gambar));
		lblNama.setBounds(25, 0, 134, 43);
		panel_2.add(lblNama);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null), null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 42, 241, 503);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		
		JLabel lblDashboard = new JLabel("Dashboard");
		Image home = new ImageIcon(this.getClass().getResource("Vector.png")).getImage();
		lblDashboard.setIcon(new ImageIcon(home));
		lblDashboard.setForeground(Color.BLUE);
		lblDashboard.setBounds(18, 13, 211, 54);
		panel_3.add(lblDashboard);
		
		JLabel label = new JLabel("");
		label.setBounds(46, 368, 56, 16);
		panel_3.add(label);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
		panel_4.setBackground(SystemColor.activeCaption);
		panel_4.setBounds(239, 42, 675, 503);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		txtCariProduk = new JTextField();
		txtCariProduk.setBounds(247, 41, 116, 22);
		panel_4.add(txtCariProduk);
		txtCariProduk.setText("Cari Produk");
		txtCariProduk.setColumns(10);
		
		JLabel lblInventoryBulanIni = new JLabel("Inventory Bulan Ini");
		lblInventoryBulanIni.setBounds(80, 35, 129, 30);
		panel_4.add(lblInventoryBulanIni);
		lblInventoryBulanIni.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(57, 114, 584, 259);
		panel_4.add(panel_5);
		
		JButton btnTambahStok = new JButton("Tambah Stok");
		btnTambahStok.setForeground(Color.WHITE);
		btnTambahStok.setBackground(new Color(0, 0, 255));
		btnTambahStok.setBounds(32, 206, 109, 25);
		btnTambahStok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_5.setLayout(null);
		
		
		panel_5.add(btnTambahStok);
		
		JButton btnPenjualan = new JButton("Penjualan");
		btnPenjualan.setBackground(new Color(0, 0, 255));
		btnPenjualan.setForeground(Color.WHITE);
		btnPenjualan.setBounds(163, 206, 97, 25);
		panel_5.add(btnPenjualan);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 584, 193);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
	
	
		String[] kolomTabel = {"#", "Item Id", "Item", "Kategori", "Stok Barang", "Barang Masuk", "Supplier"};
		
		Object[][] dataTabel = {
//				{"01", "ITD1" , "vanz01", "sepatu", "20" , "10", "AC"}
		};
		
        tabel = new DefaultTableModel(dataTabel,kolomTabel){
            //membuat tabel tidak bisa diedit saat diklik
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        
        JTable table_1_1 = new JTable(tabel);
    
    	JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 584, 193);
		panel_7.add(scrollPane);
		
		scrollPane.setViewportView(table_1_1);
		table_1_1.setVisible(true);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(62, 406, 129, 55);
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblTotalStokBulan = new JLabel("  Total Stok Bulan Ini");
		lblTotalStokBulan.setBounds(0, 0, 129, 30);
		panel_6.add(lblTotalStokBulan);
		lblTotalStokBulan.setBackground(Color.WHITE);
		
		label_1 = new JTextField("0");
		label_1.setForeground(Color.GREEN);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(58, 26, 18, 16);
		panel_6.add(label_1);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.WHITE);
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(234, 406, 129, 55);
		panel_4.add(panel_6_1);
		
		JLabel lblTotalStokBulan_1 = new JLabel("  Total Stok Masuk");
		lblTotalStokBulan_1.setBackground(Color.YELLOW);
		lblTotalStokBulan_1.setBounds(0, 0, 129, 30);
		panel_6_1.add(lblTotalStokBulan_1);
		
		label_1_1 = new JTextField("0");
		label_1_1.setForeground(Color.YELLOW);
		label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1_1.setBounds(58, 26, 18, 16);
		panel_6_1.add(label_1_1);
		
		JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setForeground(Color.ORANGE);
		panel_6_1_1.setBackground(Color.WHITE);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(405, 406, 129, 55);
		panel_4.add(panel_6_1_1);
		
		JLabel lblTotalStokBulan_1_1 = new JLabel("  Total Stok Keluar");
		lblTotalStokBulan_1_1.setBackground(Color.WHITE);
		lblTotalStokBulan_1_1.setBounds(0, 0, 129, 30);
		panel_6_1_1.add(lblTotalStokBulan_1_1);
		
		
		label_1_1_1 = new JLabel("0");
		label_1_1_1.setForeground(Color.ORANGE);
		label_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1_1_1.setBounds(58, 26, 18, 16);
		panel_6_1_1.add(label_1_1_1);
		
		btnTambahStok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ts.setVisible(true);
				if(ts.angka()==1){
				ts.setVisible(false);
				}
				
			}	
		});
		
		
		btnPenjualan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				JOptionPane.showMessageDialog(btnPenjualan,"FEATURE NOT AVAILABLE! >:(","Error",JOptionPane.ERROR_MESSAGE);
				
			}	
		});
		
	}
	
	public void tambahRow(int itemId, String item, String kategori,int stok,int barangmasuk,String supply){
		
		Object[] newRow = {j,itemId, item, kategori,stok,barangmasuk,supply};
		tabel.addRow(newRow);
		
		j++;
	
		Stuff stuff = new Stuff(itemId, item, kategori,stok,barangmasuk,supply);
        arraystuff.add(stuff);
		
		for(int i = 0; i<arraystuff.size(); i++){
			totalstok = + arraystuff.get(i).getStok();
        }

        String totalstokk = Integer.toString(totalstok);
        label_1.setText(totalstokk);
        label_1_1.setText(totalstokk);
        repaint();
        
        
        
//        System.out.println(totalstokk);
		
	}
	
		
}