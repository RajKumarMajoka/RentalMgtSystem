package rentalMgtSys;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField uid;
	private JPasswordField upassword;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		ImageIcon ii=new ImageIcon("C:\\Users\\lenovo\\Pictures\\rentalMgtSys\\loginpageimage.jpg");
		JLabel background1 = new JLabel("",ii,JLabel.CENTER);
		background1.setBounds(0, 0, 776, 453);
		background1.setVerticalAlignment(SwingConstants.TOP);
		background1.setIcon(new ImageIcon(""));
		contentPane.add(background1);
		
		JPanel loginPanel = new JPanel();
		background1.add(loginPanel);
		loginPanel.setBackground(new Color(192, 192, 192));
		loginPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		loginPanel.setBounds(90, 79, 432, 252);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman",Font.BOLD,22));
		lblNewLabel.setBounds(70, 35, 137, 37);
		loginPanel.add(lblNewLabel);
		
		uid = new JTextField();
		uid.setFont(new Font("Tahoma",Font.BOLD,22));
		uid.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		uid.setHorizontalAlignment(SwingConstants.CENTER);
		uid.setBounds(195, 34, 176, 37);
		loginPanel.add(uid);
		uid.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman",Font.BOLD,22));
		lblPassword.setBounds(70, 93, 137, 37);
		loginPanel.add(lblPassword);
		
		upassword = new JPasswordField();
		upassword.setFont(new Font("Tahoma",Font.BOLD,22));
		upassword.setHorizontalAlignment(SwingConstants.CENTER);
		upassword.setColumns(10);
		upassword.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		upassword.setBounds(195, 92, 176, 37);
		loginPanel.add(upassword);
		
		JButton login = new JButton("Login");
		login.setMnemonic('L');
		login.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userid="user101";
				String userpass="12345";
				String uid1=uid.getText();
				String upass1=new String(upassword.getPassword());
				
				if((userid.equals(uid1) && userpass.equals(upass1))||(userid.equals(uid1.toLowerCase()) &&
						userpass.equals(upass1.toLowerCase())))
				{
					JOptionPane.showMessageDialog(login, "Login Successful");
					HomePage hp=new HomePage();
					hp.setVisible(true);
					setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(loginPanel, "Either id or Password is incorrect");
					uid.setText("");
					upassword.setText("");
				}
				
			}
		});
		login.setFont(new Font("Times New Roman",Font.BOLD, 22));
		login.setBounds(136, 157, 95, 37);
		loginPanel.add(login);
		
		JButton reset = new JButton("Reset");
		reset.setMnemonic('R');
		reset.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				uid.setText("");
				upassword.setText("");
				
			}
		});
		reset.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		reset.setFont(new Font("Times New Roman",Font.BOLD,22));
		reset.setBounds(262, 157, 95, 37);
		loginPanel.add(reset);
		
		
		JLabel heading = new JLabel("Rental Management System");
		background1.add(heading);
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(new Color(32, 178, 170));
		heading.setFont(new Font("Times New Roman",Font.BOLD,30));
		heading.setBounds(94, 24, 420, 42);
	}

}
