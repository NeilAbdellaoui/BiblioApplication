package com.company;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import java.awt.Scrollbar;
import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class userInterface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	private JButton btnNewButton_1;
	private JTextField SupportNummero;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField numero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userInterface frame = new userInterface();
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
	public userInterface() {
		setTitle("Gestion Des Ulisateures ");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/neilabdellaoui/Downloads/bookappimage.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 633);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(100, 149, 237));
		comboBox.addItem("Titre");
		comboBox.addItem("Auteur");
		comboBox.addItem("Domaine");
		
		JButton Chercher = new JButton("Chercher");
		Chercher.setForeground(Color.BLACK);
		Chercher.setBackground(new Color(100, 149, 237));
		Chercher.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		
		scrollPane = new JScrollPane();
		
		JButton btnNewButton_3 = new JButton("D\u00E9connecter");
		btnNewButton_3.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_3.setForeground(SystemColor.textHighlight);
		btnNewButton_3.setBackground(SystemColor.text);
		
		table = new JTable();
		scrollPane.setRowHeaderView(table);
		table.setVisible(false);
		scrollPane.setVisible(false);
		btnNewButton_1 = new JButton("Calculer la date de retour");
		
		JDateChooser xdate = new JDateChooser();
		
		SupportNummero = new JTextField();
		SupportNummero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Entrer le numero de suport ");
		
		JLabel dateretour = new JLabel("");
		
		JButton emprunter = new JButton("Emprunter ");
		
		numero = new JTextField();
		numero.setColumns(10);
		
		JLabel lblEntrerVotreNumero = new JLabel("Entrez votre Numero ");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(47, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEntrerVotreNumero, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)
								.addComponent(xdate, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
							.addGap(39)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(21)
									.addComponent(btnNewButton_1)
									.addGap(18)
									.addComponent(dateretour, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(numero, Alignment.LEADING)
									.addComponent(SupportNummero, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
							.addGap(25))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(emprunter)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(dateretour, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(SupportNummero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(numero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEntrerVotreNumero))
							.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, Alignment.TRAILING)
								.addComponent(xdate, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(16)
					.addComponent(emprunter)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("Chercher  un  suport ");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 19));
		
		JLabel lblNewLabel_2 = new JLabel("Num\u00E9ro");
		
		JLabel lblNewLabel_2_1 = new JLabel("Titre");
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Auteur");
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Date Edition");
		
		JLabel lblNewLabel_1_1 = new JLabel("Emprunter un  suport ");
		lblNewLabel_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 19));
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(89)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
							.addGap(56)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(Chercher, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(660)
							.addComponent(btnNewButton_3)))
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(81)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(84))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(253, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(49)
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(47)
							.addComponent(lblNewLabel_2_1_1_1_1))
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(210))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(645, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(lblNewLabel_1)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Chercher, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_2_1_1_1_1)
						.addComponent(lblNewLabel_2_1_1))
					.addGap(3)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addGap(90))
		);
		contentPane.setLayout(groupLayout);
		lblNewLabel_2_1_1_1_1.setVisible(false);
		lblNewLabel_2_1_1.setVisible(false);
		lblNewLabel_2_1.setVisible(false);
		lblNewLabel_2.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				int n = 0;
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date d = xdate.getDate();
				int id = Integer.valueOf(numero.getText());
				NormalUser u = new NormalUser();
				try {
					n =  u.SelectNumperOfAllowedSuports(id);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				String s = (String)dateFormat.format(d);
				Date date;
				try {
					date = new Date(sdf.parse(s).getTime());
					date.setMonth(date.getMonth() + n);
					String now = (String)dateFormat.format(date);
					dateretour.setText(now);
					
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
					
				
				
				
				
				
				
			}
		});
		
		
		Chercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String r = (String) comboBox.getSelectedItem();
				String l = textField.getText();
				
			Suport s = new Suport();
			ResultSet res  = s.getSupportbytitre(l, r);
			if(res!=null) {
				
				
				lblNewLabel_2_1_1_1_1.setVisible(true);
				lblNewLabel_2_1_1.setVisible(true);
				lblNewLabel_2_1.setVisible(true);
				lblNewLabel_2.setVisible(true);
				
			table.setModel(DbUtils.resultSetToTableModel(res));
			scrollPane.setVisible(true);
			table.setVisible(true);
			
			
			}
			else {
				lblNewLabel_2_1_1_1_1.setVisible(false);
				lblNewLabel_2_1_1.setVisible(false);
				lblNewLabel_2_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				
				table.setVisible(false);
				scrollPane.setVisible(false);
				
				JOptionPane.showMessageDialog(null,"No results");

			}
				
			
			

			
			
			
			}
		});
		
		
		emprunter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date d = xdate.getDate();
				int a = 0;
				int x =0;
				String s1 = (String)dateFormat.format(d);
				String s2 = dateretour.getText();
				int id = Integer.parseInt(numero.getText());
				//SupportNummero
				int idSuport = Integer.parseInt(SupportNummero.getText());
				NormalUser U= new  NormalUser();
				try {
					 a =  NormalUser.numberOfSuportsLeft(id );
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				 try {
					x = NormalUser.IsInterdicted(id);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				Emprunt E = new Emprunt();
				Emprunt EM = new Emprunt();
				U.setId(id);
				Suport S = new Suport();
				System.out.println(x);
				
				if (a>0 && x ==0) {
				S.setId_support(idSuport);
				E.setUser(U);
				E.setSupport(S);
				E.setDate_debut(s1);
				E.setDate_fin(s2);
            
			    try {
					EM.addEmprunt(E);
					 JOptionPane.showMessageDialog(null," emprunted succesufully  ");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}
				
				else if(x==1){
					 JOptionPane.showMessageDialog(null," La date de l'une de votre empunts est expir�e ");
					
					
				}
				else if(a<= 0){
					 JOptionPane.showMessageDialog(null," Vous avez d�pass� la limite de votre nombre d'emprunts ");
					
					
				}
				
				
				
				
			

			
			
			
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginDemo frame2 = new LoginDemo();
				frame2.setVisible(true);
				dispose();
				}
				
				
			
		});
	}
}
