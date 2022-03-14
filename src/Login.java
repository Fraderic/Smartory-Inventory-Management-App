import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener{
	
			Vector<User> userVector;
			User user ;
			
			
			//Komponen atas
			JPanel mainPanel, mainAtas;
			JLabel welcomeLab,bawahWelcomeLab,logoLab;
	
			// Komponen Tgh
			JPanel mainTgh,userPanel,pwPanel,buttonPanel,centerTgh,buttonPan;
			JLabel userName,password;
	
			JTextField userText2;
			JPasswordField pw;
		
			JButton loginButton,signInButton;

			// Komponen bwh
			JPanel mainBwh;
	
	
			//Komponen Support
			JPanel east,west;
			
		
	public Login(Vector<User> userVector) {			
			
		// user vector
		this.userVector = userVector;
		
		
		//Main
			mainPanel = new JPanel(new BorderLayout());
		
		// Panel Atas
			mainAtas = new JPanel(new BorderLayout());
			//mainAtas.setBackground(Color.blue);
			
			//logo...
			ImageIcon img = new ImageIcon(this.getClass().getResource("/logo.png"));
			
			logoLab = new JLabel();
			logoLab.setSize(10, 10);
			logoLab.setIcon(img);
			logoLab.setBorder(new EmptyBorder(20, 405, 0, 0));

			//welcomelab....
			welcomeLab = new JLabel("Welcome");
			welcomeLab.setFont(welcomeLab.getFont().deriveFont(36.0f));
			welcomeLab.setBorder(new EmptyBorder(0, 375, 0, 0));
			
			
			
			
			// label inventory....
			bawahWelcomeLab = new JLabel ("Login to access your inventory");
			bawahWelcomeLab.setFont(welcomeLab.getFont().deriveFont(18.0f));
			bawahWelcomeLab.setBorder(new EmptyBorder(2, 320, 10, 0));
			//bawahWelcomeLab.setForeground(Color.decode("#99A6C0"));
			//new EmptyBorder(top, left, bottom, right)
	
			
			
		// Compile panel atas	
			mainAtas.add(logoLab,BorderLayout.NORTH);
			mainAtas.add(welcomeLab,BorderLayout.CENTER);
			mainAtas.add(bawahWelcomeLab,BorderLayout.SOUTH);
			
			
			
			mainPanel.add(mainAtas, BorderLayout.NORTH);
			
		
// PANEL Tengah =============================================
			// frame di tgh utk name, pas, nanti diwarnain , btuoon sign in, label
			//buttonPanel.setBackground(Color.decode("#00FFFF"));
			
			//Panel tgh
			mainTgh = new JPanel(new BorderLayout());
			mainTgh.setBounds(120, 150, 90, 100);
			
			mainTgh.setBackground(Color.decode("#F4F8FF"));
			
			//KOMPONEN TGH
			
//				JButton Button;
			
			centerTgh = new JPanel(new GridLayout(2, 1));
			centerTgh.setBackground(Color.decode("#F4F8FF"));
			
			userPanel = new JPanel(new BorderLayout());
			userPanel.setBackground(Color.decode("#F4F8FF"));
			
			userName = new JLabel("Username");
			userName.setFont(welcomeLab.getFont().deriveFont(12.0f));
			userName.setForeground(Color.decode("#99A6C0"));
			
			userName.setBorder(new EmptyBorder(5, 5, 5, 0));
			
			userText2 = new JTextField();
			userText2.setPreferredSize(new Dimension(0, 25));
			
			userPanel.setBorder(new EmptyBorder(20, 20, 25, 15));
			//user.setBounds(0, 0, 5, 25);
		
			
			//user.setBorder(new EmptyBorder(top, left, bottom, right));
			
			
			userPanel.add(userName, BorderLayout.NORTH);
			userPanel.add(userText2, BorderLayout.CENTER);
			
			// pw
			pwPanel = new JPanel(new BorderLayout());
			pwPanel.setBackground(Color.decode("#F4F8FF"));
			pwPanel.setBorder(new EmptyBorder(0, 20, 45, 15));
			
			
			password = new JLabel("Password");
			password.setFont(welcomeLab.getFont().deriveFont(12.0f));
			password.setForeground(Color.decode("#99A6C0"));
			password.setBorder(new EmptyBorder(5, 5, 5, 0));
			
			
			pw = new JPasswordField();
			pw.setPreferredSize(new Dimension(10, 25));
			
			
			pwPanel.add(password, BorderLayout.NORTH);
			pwPanel.add(pw, BorderLayout.CENTER);
			
			
			
			
			centerTgh.add(userPanel, BorderLayout.NORTH);
			centerTgh.add(pwPanel, BorderLayout.CENTER);
			
			
			
			
			mainTgh.add(centerTgh, BorderLayout.CENTER);
			
			mainPanel.add(mainTgh,BorderLayout.CENTER);
			
						

// PANEL SUPPORT TGH KIRI KANAN
			east = new JPanel();
			west = new JPanel();
			
			east.setBorder(new EmptyBorder(2, 290, 10, 0));
			//east.setBackground(Color.decode("#FFFFFF"));
			west.setBorder(new EmptyBorder(2, 290, 10, 0));
			mainTgh.add(east,BorderLayout.EAST);
			mainTgh.add(west,BorderLayout.WEST);
			
			
// PANEL BWH
			mainBwh = new JPanel();
			mainBwh.setBorder(new EmptyBorder(5, 0, 40, 0));
			buttonPan = new JPanel(new GridLayout(2, 1));
			
						
			loginButton	= new JButton("Login");
			loginButton.setPreferredSize(new Dimension(10, 20));
			loginButton.setBackground(Color.decode("#0064AA"));
			loginButton.setForeground(Color.WHITE);
			
			
			signInButton = new JButton("Don't have any account? Sign In now!");
			signInButton.setBorder(null);
			signInButton.setContentAreaFilled(false);
			signInButton.setBorder(new EmptyBorder(10, 5, 10, 0));
			//(top, left, bottom, right)
			
			loginButton.addActionListener(this);
			signInButton.addActionListener(this);
			
			buttonPan.add(loginButton);
			buttonPan.add(signInButton);
			
			mainBwh.add(buttonPan);
			
			mainPanel.add(mainBwh,BorderLayout.SOUTH);
			
			// Compile ke frame
			add(mainPanel);		
			
			
			
			
			// Frame
			setTitle("Login Page SMARTORY");
			setVisible(true);
			setSize(920,580);
			setResizable(false);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginButton ) {
			

			String userLogin = userText2.getText();
			String passwordLogin = pw.getText();
			
			if (userVector.isEmpty()) {
				JOptionPane.showMessageDialog(this,"NO USER FOUND ! Sign In First","Error",JOptionPane.ERROR_MESSAGE);

				this.dispose();
				new SignIn(userVector);
				
			} 
			
			else if (userLogin.isEmpty()) {
				JOptionPane.showMessageDialog(this,"Username still EMPTY must be filled !","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			else if (passwordLogin.isEmpty()) {
				JOptionPane.showMessageDialog(this,"Password still EMPTY must be filled !","Error",JOptionPane.ERROR_MESSAGE);
	
			}
			
			
			else if (validation(userLogin,passwordLogin)) {
				this.dispose();
				new Home(user);
			}			
			
			
		
		
		} else if (e.getSource() == signInButton ) {
			this.dispose();
			new SignIn(userVector);
	}
		
	}


	
	private boolean validation(String userLogin,String passwordLogin ) {
		
		for (User user : userVector) {
			
		
		if (userLogin.equals(user.getUserVek())) {
			if (passwordLogin.equals(user.getPassword())) {
				this.user = user;
				return true;
			}
			
			else {
				JOptionPane.showMessageDialog(this,"Wrong Password !","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		else {
			JOptionPane.showMessageDialog(this,"Wrong User Name !","Error",JOptionPane.ERROR_MESSAGE);
			
		}
		
		return false;
	}
		return false;
	}
}



// COLOR LIBRARY
//0064AA 
