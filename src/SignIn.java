import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignIn  extends JFrame implements ActionListener {
	
	Vector<User> userVector;
	
	//Komponen Main
		JPanel mainPanel;
	
	//Komponen atas
		JPanel mainAtas;
		JLabel welcomeLab,bawahWelcomeLab,logoLab;	
		
	// Komponen Tgh
		JPanel mainTgh,userPanel,pwPanel,confirmPwPanel,rolesPanel,genderPanel, genderOptionPanel;
		JLabel userName,password,confirm,roles,gender;
		//Komponen Support
		JPanel east,west;
		
		JTextField userText;
		JPasswordField pw,conPw;
		
		String[] roleArray = {"Choose Role","Inventory Staff", "Sales Staff"};
		JComboBox roleComboBox;
		
		JRadioButton maleRadioButton, femaleRadioButton;
		ButtonGroup genderButtonGroup;
		
		
	// KOM BWH
		JPanel mainBwh,buttonPanel,centerTgh,buttonPan;
		JButton signInButton;
		
	public SignIn(Vector<User> userVector) {
		
		// user vector
				this.userVector = userVector;
		
		
		// Main
		mainPanel = new JPanel(new BorderLayout());
		
		// Panel Atas
					mainAtas = new JPanel(new BorderLayout());
					//mainAtas.setBackground(Color.blue);
					
					//logo...
					ImageIcon img = new ImageIcon(this.getClass().getResource("/logo.png"));
					
					logoLab = new JLabel();
					logoLab.setSize(10, 10);
					logoLab.setIcon(img);
					logoLab.setBorder(new EmptyBorder(10, 405, 0, 0));
		
					//welcomelab....
					welcomeLab = new JLabel("Welcome");
					welcomeLab.setFont(welcomeLab.getFont().deriveFont(36.0f));
					welcomeLab.setBorder(new EmptyBorder(0, 375, 0, 0));
					
					
					
					
					// label inventory....
					bawahWelcomeLab = new JLabel ("Create your SMARTORY Account! ");
					bawahWelcomeLab.setFont(welcomeLab.getFont().deriveFont(18.0f));
					bawahWelcomeLab.setBorder(new EmptyBorder(5, 310, 10, 0));
					
					
			
					
					
				// Compile panel atas	
					mainAtas.add(logoLab,BorderLayout.NORTH);
					mainAtas.add(welcomeLab,BorderLayout.CENTER);
					mainAtas.add(bawahWelcomeLab,BorderLayout.SOUTH);
					
					
					
					mainPanel.add(mainAtas, BorderLayout.NORTH);
					
// PANEL Tengah =============================================
					//Panel tgh
					mainTgh = new JPanel(new BorderLayout());
					mainTgh.setBounds(120, 150, 90, 100);
					mainTgh.setBackground(Color.decode("#F4F8FF"));
					
					
	//KOMPONEN TGH				
					centerTgh = new JPanel(new GridLayout(5, 1));
					centerTgh.setBackground(Color.decode("#F4F8FF"));
					
					userPanel = new JPanel(new BorderLayout());
					userPanel.setBackground(Color.decode("#F4F8FF"));
					
					userName = new JLabel("Username (Use G-Mail)");
					userName.setFont(userName.getFont().deriveFont(12.0f));
					userName.setForeground(Color.decode("#99A6C0"));
					
					userName.setBorder(new EmptyBorder(5, 5, 5, 0));
					
					userText = new JTextField();
					userText.setPreferredSize(new Dimension(0, 25));
					
					userPanel.setBorder(new EmptyBorder(0, 20, 10, 15));
					//user.setBorder(new EmptyBorder(top, left, bottom, right));
					
					userPanel.add(userName, BorderLayout.NORTH);
					userPanel.add(userText, BorderLayout.CENTER);
					

					
					
					// pw
					pwPanel = new JPanel(new BorderLayout());
					pwPanel.setBackground(Color.decode("#F4F8FF"));
					
					
					password = new JLabel("Password (Min 5 Character)");
					password.setFont(password.getFont().deriveFont(12.0f));
					password.setForeground(Color.decode("#99A6C0"));
					password.setBorder(new EmptyBorder(5, 5, 5, 0));
					
					
					pw = new JPasswordField();
					pw.setPreferredSize(new Dimension(0, 25));
					
					pwPanel.setBorder(new EmptyBorder(-10, 20, 18, 15));
					pwPanel.add(password, BorderLayout.NORTH);
					pwPanel.add(pw, BorderLayout.CENTER);
					
				
					
					// CONFIRM
					confirmPwPanel = new JPanel(new BorderLayout());
					confirmPwPanel.setBackground(Color.decode("#F4F8FF"));
					confirmPwPanel.setBorder(new EmptyBorder(-10, 20, 20, 15));
					
					confirm = new JLabel("Confirm Password");
					confirm.setFont(confirm.getFont().deriveFont(12.0f));
					confirm.setForeground(Color.decode("#99A6C0"));
					confirm.setBorder(new EmptyBorder(5, 5, 5, 0));
					
					
					conPw = new JPasswordField();
					conPw.setPreferredSize(new Dimension(10, 25));
					
					
					confirmPwPanel.add(confirm, BorderLayout.NORTH);
					confirmPwPanel.add(conPw, BorderLayout.CENTER);
					
					//Roles
					
					rolesPanel = new JPanel(new BorderLayout());
					rolesPanel.setBackground(Color.decode("#F4F8FF"));
					rolesPanel.setBorder(new EmptyBorder(-10, 20, 0, 15));
					//user.setBorder(new EmptyBorder(top, left, bottom, right));
					
					
					roles = new JLabel("Roles");
					roles.setFont(roles.getFont().deriveFont(12.0f));
					roles.setForeground(Color.decode("#99A6C0"));
					roles.setBorder(new EmptyBorder(5, 5, 0, 0));
					
					roleComboBox = new JComboBox<String>(roleArray);
					//roleComboBox.setBorder(new EmptyBorder(-10, 20, -10, 15));
					
					rolesPanel.add(roles, BorderLayout.NORTH);
					rolesPanel.add(roleComboBox, BorderLayout.CENTER);
					
					
//					JPanel genderPanel;
//					JLabel gender;				
					
					genderPanel = new JPanel(new BorderLayout());
					genderPanel.setBackground(Color.decode("#F4F8FF"));
					genderPanel.setBorder(new EmptyBorder(0, 20, 0, 15));
					
					gender = new JLabel("Gender");
					gender.setFont(gender.getFont().deriveFont(12.0f));
					gender.setForeground(Color.decode("#99A6C0"));
					gender.setBorder(new EmptyBorder(5, 5, 5, 0));
					
					genderOptionPanel = new JPanel(new GridLayout(1, 2));

					genderButtonGroup = new ButtonGroup();
			 		maleRadioButton = new JRadioButton("Male");
			 		femaleRadioButton = new JRadioButton("Female");
			 		maleRadioButton.setBackground(Color.decode("#F4F8FF"));
			 		femaleRadioButton.setBackground(Color.decode("#F4F8FF"));
			 		
			 		
					genderButtonGroup.add(maleRadioButton);
					genderButtonGroup.add(femaleRadioButton);
					
					genderOptionPanel.add(maleRadioButton);
					genderOptionPanel.add(femaleRadioButton);
					genderOptionPanel.setBackground(Color.decode("#F4F8FF"));
					
					genderPanel.add(gender, BorderLayout.NORTH);
					genderPanel.add(genderOptionPanel, BorderLayout.CENTER);
					
					
					centerTgh.add(userPanel);
					centerTgh.add(pwPanel);
					centerTgh.add(confirmPwPanel);
					centerTgh.add(rolesPanel);
					centerTgh.add(genderPanel);
					
					mainTgh.add(centerTgh, BorderLayout.CENTER);
				
					
					//BWH
					mainBwh = new JPanel();
					mainBwh.setBorder(new EmptyBorder(5, 0, 10, 0));
					buttonPan = new JPanel();
					
					
					signInButton = new JButton("Sign In");
					//signInButton.setPreferredSize(new Dimension(10, 20));
					signInButton.setBackground(Color.decode("#0064AA"));
					signInButton.setForeground(Color.WHITE);
					signInButton.addActionListener(this);
					
					buttonPan.add(signInButton);
					mainBwh.add(buttonPan);
					
					mainPanel.add(mainBwh,BorderLayout.SOUTH);
					mainPanel.add(mainTgh,BorderLayout.CENTER);
					
					
					
					
					// PANEL SUPPORT TGH KIRI KANAN
					east = new JPanel();
					west = new JPanel();
					
					east.setBorder(new EmptyBorder(2, 290, 10, 0));
					//east.setBackground(Color.decode("#FFFFFF"));
					west.setBorder(new EmptyBorder(2, 290, 10, 0));
					mainTgh.add(east,BorderLayout.EAST);
					mainTgh.add(west,BorderLayout.WEST);		
					
					
			
					
					
					
					
		// Compile ke frame
		add(mainPanel);	
		
		
		// Frame
		setTitle("Sign In SMARTORY");
		setVisible(true);
		setSize(920,580);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == signInButton ) {
			
			// Create Acc
			//JPasswordField pw,conPw;JComboBox roleComboBox;
			
			String userVek = userText.getText();
			String password = pw.getText();
			String confirmPassword = conPw.getText();
			String roles = (String) roleComboBox.getSelectedItem() ;
			String gender= (maleRadioButton.isSelected()) ? "Male" : "Female";
			
			
			
			if (validation(userVek,password,confirmPassword,roles,gender)) {
				
				User newUser = new User(userVek,password,confirmPassword,roles,gender);
				
				userVector.add(newUser);
				
				JOptionPane.showMessageDialog(this,"User added Succesfully :D ","Added Succesfully",JOptionPane.INFORMATION_MESSAGE);
				
				
				this.dispose();
				new Login(userVector);
			}
			
			
			//	
//			JRadioButton maleRadioButton, femaleRadioButton;
//			ButtonGroup genderButtonGroup;
			//
			
			} 
	}
	
	
	public boolean validation(String userVek,String password,String confirmPassword,String roles,String gender) {
		
		if (!userVek.isEmpty()) {
			if (userVek.endsWith("@gmail.com")) {
				if (!password.isEmpty()) {
					if (password.length()>=5) {
						if (!confirmPassword.isEmpty()) {
							if (confirmPassword.equals(password)) {
								if (!roles.equals("Choose Role")) {
									if (!roles.equals("Sales Staff")) {
										if (maleRadioButton.isSelected()) {
											return true;
										}
										else {
											if (femaleRadioButton.isSelected()) {
												return true;
											}
											else {
												JOptionPane.showMessageDialog(this,"Gender still EMPTY must be filled !","Error",JOptionPane.ERROR_MESSAGE);
											} //
										}
									}
									else {
										JOptionPane.showMessageDialog(this,"Role NOT AVAILABLE !","Error",JOptionPane.ERROR_MESSAGE);
						
									}
								}
								else {
									JOptionPane.showMessageDialog(this,"Choose ROLE ! still EMPTY ! ","Error",JOptionPane.ERROR_MESSAGE);
									
								}
							}
							else {
								JOptionPane.showMessageDialog(this,"Check Your Confirm Password !","Error",JOptionPane.ERROR_MESSAGE);
								
							}
						}
						else {
							JOptionPane.showMessageDialog(this,"Confirm Password still EMPTY !","Error",JOptionPane.ERROR_MESSAGE);
							
						}
					}
					else {
						JOptionPane.showMessageDialog(this,"Password must CONSIST of 5 CHAR or More !","Error",JOptionPane.ERROR_MESSAGE);
				
					}
				}
				else {
					JOptionPane.showMessageDialog(this,"Password still EMPTY must be filled !","Error",JOptionPane.ERROR_MESSAGE);
					
				}
			}
			else {
				JOptionPane.showMessageDialog(this,"Username USE G-MAIL !(@gmail.com)","Error",JOptionPane.ERROR_MESSAGE);
				
			}
		}
		else {
			JOptionPane.showMessageDialog(this,"Username still EMPTY must be filled !","Error",JOptionPane.ERROR_MESSAGE);
			
		}
		
				return false;
	}
	
}
