package com.company;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Label;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JLocaleChooser;

import net.proteanit.sql.DbUtils;

import com.toedter.calendar.JDateChooser;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;
import java.awt.SystemColor;

public class AdmineGestionUsers extends JFrame {

	private JPanel contentPane;
	private JTextField nomtext;
	private JTextField prenomtext;
	private JTextField phonetext;
	private JTextField emailtext;
	private JTextField logintext;
	private JTextField passwordtext;
	private JTextField numerotext;
	private JComboBox categorietext = new JComboBox();
	private JDateChooser datetext = new JDateChooser();
	private JTextField textField;
	private JTextField txtNom;
	private JTextField prenom;
	private JTextField login;
	private JTextField password;
	private JTextField phone;
	private JTextField email;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	private JTextField textField_2;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmineGestionUsers frame = new AdmineGestionUsers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 

	 */
	

	public AdmineGestionUsers() {
		setTitle("Gestion Des Ulisateures ");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/neilabdellaoui/Downloads/bookappimage.png"));
		
	    
		
		
		
		
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 633);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.text);
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setForeground(new Color(255, 255, 255));
		layeredPane.setBorder(null);
		layeredPane.setBackground(new Color(255, 255, 255));
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));

		
		JButton Modifier = new JButton("Modifier");
		Modifier.setForeground(Color.BLACK);
		Modifier.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		Modifier.setBackground(new Color(30, 144, 255));
		
		JButton suppprimer = new JButton("Supprimer");
		suppprimer.setForeground(Color.BLACK);
		suppprimer.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		suppprimer.setBackground(new Color(30, 144, 255));
		
		JButton chercher = new JButton("Chercher");
		chercher.setForeground(Color.BLACK);
		chercher.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		chercher.setBackground(new Color(30, 144, 255));
		
		JButton btnNewButton_1_3 = new JButton("Liste d'interdiction");
		btnNewButton_1_3.setForeground(Color.BLACK);
		btnNewButton_1_3.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_1_3.setBackground(new Color(30, 144, 255));
		
		JButton btnNewButton_4 = new JButton("D\u00E9connecter");
		btnNewButton_4.setBackground(SystemColor.text);
		btnNewButton_4.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_4.setForeground(SystemColor.textHighlight);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(layeredPane, 0, 0, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(Modifier, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(suppprimer, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(chercher, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(btnNewButton_1_3)))
					.addContainerGap(36, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(755, Short.MAX_VALUE)
					.addComponent(btnNewButton_4))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnNewButton_4)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(Modifier, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_3, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
						.addComponent(suppprimer, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
						.addComponent(chercher, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
					.addGap(41)
					.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		layeredPane.add(panel, "name_30902662700100");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/neilabdellaoui/Downloads/bookappimage.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(290, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
					.addGap(140))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(51)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(54, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		layeredPane.add(panel_1, "name_31026803340700");
		
		nomtext = new JTextField();
		nomtext.setColumns(10);
		
		prenomtext = new JTextField();
		prenomtext.setColumns(10);
		
		phonetext = new JTextField();
		phonetext.setColumns(10);
		
		emailtext = new JTextField();
		emailtext.setColumns(10);
		
		logintext = new JTextField();
		logintext.setColumns(10);
		
		passwordtext = new JTextField();
		passwordtext.setColumns(10);
		
		numerotext = new JTextField();
		numerotext.setColumns(10);
		
		categorietext .addItem(1);
		categorietext .addItem(2);
		categorietext .addItem(3);
	
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_1_1 = new JLabel("Prenom");
		lblNewLabel_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_1_2 = new JLabel("Phone");
		lblNewLabel_1_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_1_3 = new JLabel("email");
		lblNewLabel_1_3.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_1_4 = new JLabel("Date De Naissance ");
		lblNewLabel_1_4.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_1_5 = new JLabel("login");
		lblNewLabel_1_5.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_1_6 = new JLabel("Password");
		lblNewLabel_1_6.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Numero");
		lblNewLabel_1_6_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_1_6_1_1 = new JLabel("Cat\u00E9gorie");
		lblNewLabel_1_6_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		 
		JButton save = new JButton("Enregistrer");
		save.setForeground(Color.BLACK);
		save.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		save.setBackground(SystemColor.textHighlight);
		
		
		
		JLabel lblNewLabel_1_7 = new JLabel("Ajouter  Un  Utilisateur");
		lblNewLabel_1_7.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_7.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 24));
		
		JLabel message = DefaultComponentFactory.getInstance().createLabel("");
		message.setForeground(new Color(255, 0, 0));
		message.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 19));
		
		
		
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(47)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_6_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_6_1_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_1_4)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
							.addGap(58)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(emailtext, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(logintext, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(categorietext, 0, 298, Short.MAX_VALUE)
								.addComponent(numerotext, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(passwordtext, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(prenomtext, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(phonetext, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(nomtext, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(datetext, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(135)
									.addComponent(save, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(61)
									.addComponent(message, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(247)
							.addComponent(lblNewLabel_1_7, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel_1_7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(nomtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(prenomtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(phonetext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(emailtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(datetext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_4))
							.addGap(32)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(logintext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_6_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(numerotext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(123)
							.addComponent(message, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_6_1_1)
						.addComponent(categorietext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(save))
					.addContainerGap(9, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel Modification = new JPanel();
		layeredPane.add(Modification, "name_31031466039500");
		
		JLabel lblNewLabel_2 = new JLabel("Num\u00E9ro D'utulisateur ");
		lblNewLabel_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Chercher");
		btnNewButton_1.setForeground(Color.BLACK);
		
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		
		prenom = new JTextField();
		prenom.setVisible(false);
		prenom.setColumns(10);
		
		login = new JTextField();
		login.setVisible(false);
		login.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setVisible(false);
		phone = new JTextField();
		phone.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setVisible(false);
		JComboBox categorietext_1 = new JComboBox();
		
		categorietext_1.setVisible(false);
		phone.setVisible(false);
		password.setVisible(false);
		password.setVisible(false);
		login.setVisible(false);
		prenom.setVisible(false);
		txtNom.setVisible(false);
		JButton btModifer = new JButton("Modifier");
		
		btModifer.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		btModifer.setBackground(SystemColor.textHighlight);
		btModifer.setVisible(false);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nom");
		lblNewLabel_2_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Prenom");
		lblNewLabel_2_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Login");
		lblNewLabel_2_1_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Password");
		lblNewLabel_2_1_3.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNewLabel_2_1_4 = new JLabel("T\u00E9l\u00E9phone ");
		lblNewLabel_2_1_4.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Email");
		lblNewLabel_2_1_5.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNewLabel_2_1_7 = new JLabel("Cat\u00E9gorie");

		 
		lblNewLabel_2_1_7.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		 lblNewLabel_2_1.setVisible(false);
		 lblNewLabel_2_1_1.setVisible(false);
		 lblNewLabel_2_1_2.setVisible(false);
		 lblNewLabel_2_1_3.setVisible(false);
		 lblNewLabel_2_1_4.setVisible(false);
		 lblNewLabel_2_1_5.setVisible(false);
		 lblNewLabel_2_1_7.setVisible(false); 
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		GroupLayout gl_Modification = new GroupLayout(Modification);
		gl_Modification.setHorizontalGroup(
			gl_Modification.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Modification.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addComponent(btnNewButton_1)
					.addContainerGap(223, Short.MAX_VALUE))
				.addGroup(gl_Modification.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Modification.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Modification.createSequentialGroup()
							.addGroup(gl_Modification.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
							.addGap(36))
						.addGroup(gl_Modification.createSequentialGroup()
							.addGroup(gl_Modification.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2_1_4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_7, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(4)
					.addGroup(gl_Modification.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Modification.createSequentialGroup()
							.addComponent(txtNom, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_Modification.createSequentialGroup()
							.addGroup(gl_Modification.createParallelGroup(Alignment.LEADING, false)
								.addComponent(login, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
								.addComponent(phone, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
								.addComponent(categorietext_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_Modification.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Modification.createSequentialGroup()
									.addGap(71)
									.addComponent(lblNewLabel_2_1_5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Modification.createSequentialGroup()
									.addGap(53)
									.addComponent(lblNewLabel_2_1_3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(gl_Modification.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Modification.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(email, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
						.addComponent(password, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
					.addGap(44))
				.addGroup(gl_Modification.createSequentialGroup()
					.addContainerGap(609, Short.MAX_VALUE)
					.addComponent(btModifer, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(63))
				.addGroup(gl_Modification.createSequentialGroup()
					.addGap(149)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(365, Short.MAX_VALUE))
		);
		gl_Modification.setVerticalGroup(
			gl_Modification.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Modification.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_Modification.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1))
					.addGap(18)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_Modification.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1)
						.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_Modification.createParallelGroup(Alignment.BASELINE)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(login, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_Modification.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Modification.createSequentialGroup()
							.addGap(36)
							.addGroup(gl_Modification.createParallelGroup(Alignment.BASELINE)
								.addComponent(phone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Modification.createSequentialGroup()
							.addGap(44)
							.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(30)
					.addGroup(gl_Modification.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_7, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(categorietext_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btModifer, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		Modification.setLayout(gl_Modification);
		
		JPanel Supprimer = new JPanel();
		layeredPane.add(Supprimer, "name_31037019743800");
		
		JButton btnNewButton_3 = new JButton("Supprimer");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_3.setBackground(SystemColor.textHighlight);
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Num\u00E9ro D'utilisateur ");
		lblNewLabel_7.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		GroupLayout gl_Supprimer = new GroupLayout(Supprimer);
		gl_Supprimer.setHorizontalGroup(
			gl_Supprimer.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_Supprimer.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addGap(81)
					.addComponent(btnNewButton_3)
					.addContainerGap(119, Short.MAX_VALUE))
		);
		gl_Supprimer.setVerticalGroup(
			gl_Supprimer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Supprimer.createSequentialGroup()
					.addGap(110)
					.addGroup(gl_Supprimer.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(btnNewButton_3)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(293, Short.MAX_VALUE))
		);
		Supprimer.setLayout(gl_Supprimer);
		
		JPanel Chercher = new JPanel();
		layeredPane.add(Chercher, "name_31085825813000");
		
		JLabel lblNewLabel_2_2 = new JLabel("Num\u00E9ro D'utilisateur ");
		lblNewLabel_2_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Chercher");
		btnNewButton_2.setForeground(Color.BLACK);

		btnNewButton_2.setBackground(SystemColor.textHighlight);
		btnNewButton_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		table.setBorder(new EmptyBorder(1, 1, 1, 1));
		table.setBackground(SystemColor.activeCaption);
		table.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("Nom");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblNewLabel_3_1 = new JLabel("Prenom");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblNewLabel_3_2 = new JLabel("T\u00E9lephone");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblNewLabel_3_3 = new JLabel("Email");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblNewLabel_3_4 = new JLabel("Categorie");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3_1.setVisible(false);
		lblNewLabel_3_2.setVisible(false);
		lblNewLabel_3_3.setVisible(false);
		lblNewLabel_3_4.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		
		GroupLayout gl_Chercher = new GroupLayout(Chercher);
		gl_Chercher.setHorizontalGroup(
			gl_Chercher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Chercher.createSequentialGroup()
					.addGroup(gl_Chercher.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Chercher.createSequentialGroup()
							.addGap(70)
							.addGroup(gl_Chercher.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_Chercher.createSequentialGroup()
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(34)
									.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(42)
									.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(47)
									.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Chercher.createSequentialGroup()
									.addComponent(lblNewLabel_2_2)
									.addGap(58)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_Chercher.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Chercher.createSequentialGroup()
									.addGap(46)
									.addComponent(btnNewButton_2))
								.addGroup(gl_Chercher.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_Chercher.createSequentialGroup()
							.addGap(93)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(96, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_Chercher.createSequentialGroup()
					.addContainerGap(266, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
					.addGap(190))
		);
		gl_Chercher.setVerticalGroup(
			gl_Chercher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Chercher.createSequentialGroup()
					.addGap(64)
					.addGroup(gl_Chercher.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_Chercher.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(257, Short.MAX_VALUE))
		);
		Chercher.setLayout(gl_Chercher);
		
		JPanel Interdiction = new JPanel();
		layeredPane.add(Interdiction, "name_33349622308799");
		
		JLabel lblNewLabel_6 = new JLabel("Liste des interdictions");
		lblNewLabel_6.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_6.setForeground(SystemColor.textHighlight);
	      DefaultTableModel model = new DefaultTableModel();
		
		JScrollPane scrollPane = new JScrollPane();
     		
		GroupLayout gl_Interdiction = new GroupLayout(Interdiction);
		gl_Interdiction.setHorizontalGroup(
			gl_Interdiction.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Interdiction.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_Interdiction.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 687, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(94, Short.MAX_VALUE))
		);
		gl_Interdiction.setVerticalGroup(
			gl_Interdiction.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Interdiction.createSequentialGroup()
					.addGap(37)
					.addComponent(lblNewLabel_6)
					.addGap(72)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(201, Short.MAX_VALUE))
		);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		table_1.setBackground(SystemColor.activeCaption);
		scrollPane.setViewportView(table_1);
		
		Interdiction.setLayout(gl_Interdiction);
		table_1.setVisible(false);
		scrollPane.setVisible(false);
		
		javax.swing.JLabel label_1 = new javax.swing.JLabel("New label");
		
		javax.swing.JLabel label = new javax.swing.JLabel("New label");
		contentPane.setLayout(gl_contentPane);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1 );
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		
		Modifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Modification );
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		suppprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Supprimer );
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		chercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Chercher );
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
			
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Interdiction );
				layeredPane.repaint();
				layeredPane.revalidate();
				Emprunt e1 = new Emprunt();
				ResultSet resultat = null ;
				
					try {
						resultat = e1.chercherInterdiction();
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				
              if (resultat != null ) {			
            	  table_1.setVisible(true);
      		      scrollPane.setVisible(true);
				table_1.setModel(DbUtils.resultSetToTableModel(resultat));}
              else {
            	  table_1.setVisible(false);
          		scrollPane.setVisible(false);
            	  
            	  JOptionPane.showMessageDialog(null,"No Interdiction");
              } 
				
				
			}
		});
		
		save.addActionListener(new ActionListener() {	public void actionPerformed(ActionEvent e)  {
			
			EmailValidator emailValidator = new EmailValidator();
			   if(!emailValidator.validate(emailtext.getText().trim())) {
				   JOptionPane.showMessageDialog(null," Invalid Email");
			        /*
			           Action that you want to take. For ex. make email id field red
			           or give message box saying invalid email id.
			        */
			   }
			
			   else if (nomtext.getText().isEmpty() || prenomtext.getText().isEmpty()  || emailtext.getText().isEmpty() || logintext.getText().isEmpty() || passwordtext.getText().isEmpty()  || phonetext.getText().isEmpty()  ) {
				
				
				
				JOptionPane.showMessageDialog(null," Veuillez Remplir Tous Les Champs");
				
			}else {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date newDate = new Date();
			
			
			Categorie a = new Categorie(); 
			Date d = datetext.getDate();
			
			String s = (String)dateFormat.format(d);
			System.out.println(s);	
           int m=  (int) categorietext.getSelectedItem();//
           a.setCategorie(m);
		
		NormalUser u = new NormalUser(Integer.parseInt( numerotext.getText()),
					nomtext.getText() ,prenomtext.getText(),s,"user",
					emailtext.getText(),passwordtext.getText(), logintext.getText(), Integer.parseInt(phonetext.getText()), a);
		
		Admin A = new Admin();
		try {
			A.AjouterUser(u);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			A.AjouterNormalUser(u);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
			
		
 
		
		
		
		
		}
		}		
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero= Integer.parseInt( textField_1.getText());
				Admin A = new Admin();
				ResultSet res = null;
				try {
					res = A.chercherUser(numero);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if (res != null) {
				lblNewLabel_4.setVisible(true);
				lblNewLabel_3.setVisible(true);
				lblNewLabel_3_1.setVisible(true);
				lblNewLabel_3_2.setVisible(true);
				lblNewLabel_3_3.setVisible(true);
				lblNewLabel_3_4.setVisible(true);

				table.setVisible(true);
				table.setModel(DbUtils.resultSetToTableModel(res));}
				
				else {
					lblNewLabel_4.setVisible(false);
					lblNewLabel_3.setVisible(false);
					lblNewLabel_3_1.setVisible(false);
					lblNewLabel_3_2.setVisible(false);
					lblNewLabel_3_3.setVisible(false);
					lblNewLabel_3_4.setVisible(false);

					table.setVisible(false);
					
					JOptionPane.showMessageDialog(null,"utilisateur Num�ro  "+textField_1.getText()+" introuvable ");
					
				}
					
					
				
				
				
				try {
					res.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
				
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero= Integer.parseInt( textField.getText());
				ReturningTowTypes	result = new ReturningTowTypes() ;
				Admin A = new Admin();
				try {
						result = A.chercherUser2(numero);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				if (result.getExist() == 1) {
					
						NormalUser NU = result.getNU();
						User res1 = result.getU();
						int pho =res1.getPhone();
						String n =res1.getNom();
						String p =res1.getPrenom();
						String em =res1.getEmail();
						int  ca = NU.getCategorie().getId_categorie();
						
						String log = res1.getLogin();
						String pass = res1.getPassword();
						categorietext_1.setVisible(true);
						categorietext_1.addItem("1");
						categorietext_1.addItem("2");
						categorietext_1.addItem("3");
						categorietext_1.setSelectedItem(Integer.toString(ca));
					
						
						
						phone.setVisible(true);
						phone.setText(Integer.toString(pho));
						
						password.setVisible(true);
						prenom.setText(pass);
						login.setText(log);
						prenom.setText(p);
						login.setVisible(true);
						prenom.setVisible(true);
						password.setText(pass);
						
						
						email.setText(em);
						email.setVisible(true);
						txtNom.setVisible(true);
						txtNom.setText(n);
						lblNewLabel_2_1_1.setVisible(true);
						lblNewLabel_2_1.setVisible(true);
						lblNewLabel_2_1_2.setVisible(true);
						lblNewLabel_2_1_4.setVisible(true);
						lblNewLabel_2_1_7.setVisible(true);
						lblNewLabel_2_1_5.setVisible(true);
						lblNewLabel_2_1_5.setVisible(true);
						lblNewLabel_2_1_3.setVisible(true);

						lblNewLabel_2_1_5.setVisible(true);
						btModifer.setVisible(true);
					}
						
					
					
					
					
		
				
				else {
					
					JOptionPane.showMessageDialog(null,"utilisateur Num�ro  "+textField.getText()+" introuvable ");
					
					
				}
				
				
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = textField_2.getText();
				Admin A = new Admin();
				try {
					
					
					A.SupprimerUser(id);
					JOptionPane.showMessageDialog(null,"utilisateur Num�ro  "+ textField_2.getText()+" est supprim� avec succ�s ");

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		
		btModifer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			phone.getText();
			int id= Integer.parseInt( textField.getText());
			String pass= password.getText();
			String pren= prenom.getText();
			String log =login.getText();
			String em =email.getText();
			String pas= password.getText();
			   int tel = Integer.parseInt(phone.getText());
			String nom=txtNom.getText();
			int categorie =  Integer.parseInt( (String) categorietext_1.getSelectedItem());
			Categorie c = new Categorie();
			c.setCategorie(categorie);
			NormalUser u = new NormalUser();
			Admin  A = new Admin();
			u.setId(id);
			u.setEmail(em);
			u.setCategorie(c);
			u.setLogin(log);
			u.setPassword(pass);
			u.setPhone(tel);
			u.setNom(nom);
			u.setPrenom(pren);
			try {
			A.Update(u );
			A.Update2(u );
			JOptionPane.showMessageDialog(null,"utilisateur Numéro  "+textField.getText()+" est Modifié avec succès ");
			} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
			}
			});
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			LoginDemo frame2 = new LoginDemo();
			frame2.setVisible(true);
			dispose();
			}
			});
		
	}
}
