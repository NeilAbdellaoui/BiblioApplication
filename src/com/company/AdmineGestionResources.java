package com.company;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.toedter.calendar.JDayChooser;

import net.proteanit.sql.DbUtils;

import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.UIManager;

public class AdmineGestionResources extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table_1;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_17;
	private JTextField textField_16;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTable table_3;
	private JTextField textField_21;
	private JTable table_2;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTable table_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmineGestionResources frame = new AdmineGestionResources();
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
	public AdmineGestionResources() {
		setTitle("Gestion Des Ressources ");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/neilabdellaoui/Downloads/bookappimage.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 633);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(46, 84, 764, 410);
		
		JButton oeuvre = new JButton(" Oeuvre");
		oeuvre.setBounds(11, 11, 107, 38);
		oeuvre.setForeground(Color.BLACK);
		oeuvre.setBackground(SystemColor.textHighlight);
		oeuvre.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		oeuvre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton oeuvre_1 = new JButton("Auteur");
		oeuvre_1.setBounds(124, 11, 137, 39);
		oeuvre_1.setForeground(Color.BLACK);
		oeuvre_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		oeuvre_1.setBackground(SystemColor.textHighlight);
		
		JButton oeuvre_1_1 = new JButton(" Editeur");
		oeuvre_1_1.setBounds(263, 11, 137, 39);
		oeuvre_1_1.setForeground(Color.BLACK);
		oeuvre_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		oeuvre_1_1.setBackground(SystemColor.textHighlight);
		
		JButton oeuvre_1_1_1 = new JButton("Edition ");
		oeuvre_1_1_1.setBounds(406, 11, 137, 39);
		oeuvre_1_1_1.setForeground(Color.BLACK);
		oeuvre_1_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		oeuvre_1_1_1.setBackground(SystemColor.textHighlight);
		
		JButton oeuvre_1_1_1_1 = new JButton(" Suport");
		oeuvre_1_1_1_1.setBounds(549, 11, 137, 39);
		oeuvre_1_1_1_1.setForeground(Color.BLACK);
		oeuvre_1_1_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		oeuvre_1_1_1_1.setBackground(SystemColor.textHighlight);
		
		JButton oeuvre_1_1_1_1_1 = new JButton("Retour  D'Un Suport");
		oeuvre_1_1_1_1_1.setBounds(692, 11, 169, 39);
		oeuvre_1_1_1_1_1.setForeground(Color.BLACK);
		oeuvre_1_1_1_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		oeuvre_1_1_1_1_1.setBackground(SystemColor.textHighlight);
		
		JButton btnNewButton_4 = new JButton("D\u00E9connection");
		btnNewButton_4.setBounds(725, 525, 136, 29);
		btnNewButton_4.setBackground(SystemColor.controlLtHighlight);
		btnNewButton_4.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_4.setForeground(SystemColor.textHighlight);
		
		JButton btnNewButton_4_1 = new JButton("Gestion Des Utilisateurs");
		btnNewButton_4_1.setBounds(503, 523, 180, 33);
		btnNewButton_4_1.setForeground(SystemColor.textHighlight);
		btnNewButton_4_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_4_1.setBackground(Color.WHITE);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.menuText);
		layeredPane.add(panel, "name_15898201285300");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tire");
		lblNewLabel_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_1_1 = new JLabel("Numéro d'oeuvre");
		lblNewLabel_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Numéo d'auteur");
		lblNewLabel_1_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_1_2 = new JLabel("Ajouter une oeuvre");
		lblNewLabel_1_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Supprimer une oeuvre");
		lblNewLabel_1_2_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_2_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Numéro d'oeuvre");
		lblNewLabel_1_1_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setForeground(Color.BLACK);
		btnSupprimer.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		btnSupprimer.setBackground(SystemColor.textHighlight);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Chercher une oeuvre");
		lblNewLabel_1_2_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_2_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JScrollPane scrollPane_4 = new JScrollPane();
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Num\u00E9ro");
		lblNewLabel_1_1_2_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		
		JButton btnChercher = new JButton("Chercher");
		btnChercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnChercher.setForeground(Color.BLACK);
		btnChercher.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		btnChercher.setBackground(SystemColor.textHighlight);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Num\u00E9ro");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Titre");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblNewLabel_1_1_2_1_1_2 = new JLabel(" Num\u00E9ro D'auteur");
		lblNewLabel_1_1_2_1_1_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(108)
								.addComponent(lblNewLabel_1_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
								.addGap(93)
								.addComponent(lblNewLabel_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
								.addGap(77)
								.addComponent(lblNewLabel_1_1_2_1_1_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(76)
								.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_1_1_2_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_1_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 127, Short.MAX_VALUE)
													.addGroup(gl_panel.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))
												.addGap(12)
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(textField_2, Alignment.LEADING)
													.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
													.addComponent(textField_1, Alignment.LEADING)
													.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))))
										.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
									.addGap(134)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(btnChercher, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
											.addComponent(btnSupprimer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))))))
					.addContainerGap(131, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(83)
							.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnChercher, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1_1_2_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table_4 = new JTable();
		scrollPane_4.setColumnHeaderView(table_4);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_15904116262800");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblNumero = new JLabel("Num\u00E9ro");
		lblNumero.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance");
		lblDateDeNaissance.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnNewButton_1 = new JButton("Ajouter");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Ajouter Auteur");
		lblNewLabel_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		
		JLabel lblNewLabel_2_1 = new JLabel("Chercher Auteur");
		lblNewLabel_2_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_2_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNumero_1 = new JLabel("Num\u00E9ro");
		lblNumero_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton_1_1 = new JButton("Chercher");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1_1.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblPrenom, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_5, 131, 131, 131)
							.addGap(34)
							.addComponent(lblDateDeNaissance)
							.addGap(18)
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNumero_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
									.addGap(47)
									.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))))
					.addGap(48))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(590, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_6, 177, 177, 177)
					.addGap(218))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(590, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(614, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addGap(69))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(btnNewButton_1)
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPrenom, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblDateDeNaissance, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumero_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 22, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_15911386167100");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nom");
		lblNewLabel_3.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_3_1 = new JLabel("Prenom");
		lblNewLabel_3_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Numero");
		lblNewLabel_3_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JButton btnNewButton_2 = new JButton("Ajouter");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(SystemColor.textHighlight);
		btnNewButton_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_4 = new JLabel("Ajouter Editeur ");
		lblNewLabel_4.setForeground(SystemColor.textHighlight);
		lblNewLabel_4.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_4_1 = new JLabel("Chercher");
		lblNewLabel_4_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_4_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nom");
		lblNewLabel_3_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		JButton btnNewButton_2_1 = new JButton("Chercher");
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_2_1.setBackground(SystemColor.textHighlight);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addGap(31)
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(127)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
									.addGap(30)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
										.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
										.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
							.addGap(83))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
							.addGap(228)))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_2_1))
					.addGap(219))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(108)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(148, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel_4)
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(0)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(72)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		layeredPane.add(panel_3, "name_15914022723800");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		JLabel Numero = new JLabel("Num\u00E9ro ");
		Numero.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNumroDoeuvre = new JLabel("Numéro oeuvre");
		lblNumroDoeuvre.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNumroDediteur = new JLabel("Numéro d'editeur");
		lblNumroDediteur.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_5 = new JLabel("Ajouter Edition ");
		lblNewLabel_5.setForeground(SystemColor.textHighlight);
		lblNewLabel_5.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNewLabel_5_1 = new JLabel("Chercher Edition ");
		lblNewLabel_5_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_5_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		JLabel Numero_1 = new JLabel("Num\u00E9ro ");
		Numero_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JButton btnNewButton_5 = new JButton("Chercher");
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setBackground(SystemColor.textHighlight);
		
		JButton btnNewButton_5_1 = new JButton("Ajouter");
		btnNewButton_5_1.setForeground(Color.BLACK);
		btnNewButton_5_1.setBackground(SystemColor.textHighlight);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JLabel Numero_2 = new JLabel("Num\u00E9ro ");
		Numero_2.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		Numero_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNumroDoeuvre_1 = new JLabel("Numéro oeuvre");
		lblNumroDoeuvre_1.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		lblNumroDoeuvre_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNumroDediteur_1 = new JLabel("Numéro editeur");
		lblNumroDediteur_1.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		lblNumroDediteur_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		lblDate_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_5_1_2 = new JLabel("Supprimer Edition ");
		lblNewLabel_5_1_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_5_1_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		
		JLabel Numero_1_1 = new JLabel("Numéro edition");
		Numero_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JButton btnNewButton_5_3 = new JButton("Supprimer");
		btnNewButton_5_3.setForeground(Color.BLACK);
		btnNewButton_5_3.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblNumroDoeuvre, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
							.addComponent(Numero)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(47)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNumroDediteur)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDate_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
										.addComponent(dateChooser_1, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(94, Short.MAX_VALUE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(612, Short.MAX_VALUE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(174)
					.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(435, Short.MAX_VALUE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5_1)
					.addGap(466)
					.addComponent(btnNewButton_5_1, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(26))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(11)
							.addComponent(Numero_2)
							.addGap(38)
							.addComponent(lblNumroDoeuvre_1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(lblNumroDediteur_1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Numero_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(178, Short.MAX_VALUE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(18)
					.addComponent(Numero_1_1)
					.addGap(41)
					.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_5_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(315, Short.MAX_VALUE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5_1_2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(579, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_5))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(58)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNumroDediteur)
								.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(Numero))))
					.addGap(36)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNumroDoeuvre)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
							.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblDate)))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(29)
							.addComponent(lblNewLabel_5_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnNewButton_5))
								.addComponent(Numero_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDate_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNumroDediteur_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNumroDoeuvre_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(Numero_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(lblNewLabel_5_1_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnNewButton_5_3))
								.addComponent(Numero_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_5_1)))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		table_2 = new JTable();
		scrollPane_2.setColumnHeaderView(table_2);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_15917198585800");
		
		JLabel lblNumro = new JLabel("Num\u00E9ro  ");
		lblNumro.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNumroDoeuvre_1_2 = new JLabel("Numéro d'edition");
		lblNumroDoeuvre_1_2.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNumroDoeuvre_1_3 = new JLabel("Domaine");
		lblNumroDoeuvre_1_3.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		JButton btnNewButton_5_2 = new JButton("Ajouter");
		btnNewButton_5_2.setForeground(Color.BLACK);
		btnNewButton_5_2.setBackground(SystemColor.textHighlight);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		
		JLabel lblNumro_1 = new JLabel("Num\u00E9ro  ");
		lblNumro_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JButton btnNewButton_5_2_1 = new JButton("Chercher");
		btnNewButton_5_2_1.setForeground(Color.BLACK);
		btnNewButton_5_2_1.setBackground(SystemColor.textHighlight);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Chercher Suport");
		lblNewLabel_5_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_5_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Ajouter Suport");
		lblNewLabel_5_1_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_5_1_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNumro_1_1 = new JLabel("Num\u00E9ro  ");
		lblNumro_1_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNumroDoeuvre_1_2_1 = new JLabel("Numéro d'edition");
		lblNumroDoeuvre_1_2_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNumroDoeuvre_1_3_1 = new JLabel("Domaine");
		lblNumroDoeuvre_1_3_1.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(61)
									.addComponent(lblNumro)
									.addGap(45)
									.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addGap(37)
									.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNumroDoeuvre_1_3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNumroDoeuvre_1_2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(28)
									.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)))
							.addGap(44)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_5_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(20)
							.addComponent(lblNewLabel_5_1_1_1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(69)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_4.createSequentialGroup()
											.addComponent(lblNumro_1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
											.addGap(85)
											.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
											.addGap(32)
											.addComponent(btnNewButton_5_2_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
											.addGap(39))
										.addGroup(gl_panel_4.createSequentialGroup()
											.addComponent(lblNumro_1_1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addGap(125)
											.addComponent(lblNumroDoeuvre_1_2_1, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addComponent(lblNumroDoeuvre_1_3_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))))
					.addGap(62))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_5_1_1_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumro)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumroDoeuvre_1_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumroDoeuvre_1_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(btnNewButton_5_2)
							.addGap(37)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_5_2_1)))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNumro_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(19)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumro_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumroDoeuvre_1_3_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumroDoeuvre_1_2_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		
		table_3 = new JTable();
		scrollPane_3.setColumnHeaderView(table_3);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		layeredPane.add(panel_5, "name_15920715990500");
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Numéro d'emprunt");
		lblNewJgoodiesLabel.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Confirmer le retour du suport ");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(SystemColor.textHighlight);
		btnNewButton_3.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 15));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewJgoodiesLabel, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
					.addComponent(btnNewButton_3)
					.addGap(63))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(169)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewJgoodiesLabel)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3))
					.addContainerGap(211, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		contentPane.add(layeredPane);
		contentPane.add(btnNewButton_4_1);
		contentPane.add(btnNewButton_4);
		contentPane.add(oeuvre);
		contentPane.add(oeuvre_1);
		contentPane.add(oeuvre_1_1);
		contentPane.add(oeuvre_1_1_1);
		contentPane.add(oeuvre_1_1_1_1);
		contentPane.add(oeuvre_1_1_1_1_1);
		
		oeuvre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		oeuvre_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		oeuvre_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});

		oeuvre_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		oeuvre_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		oeuvre_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = textField.getText();
				int id = Integer.parseInt(textField_1.getText());
				int idAuteur = Integer.parseInt(textField_2.getText());
				Auteur a = new Auteur();
				a.setId(idAuteur);
				
				Oeuvre o = new Oeuvre(  );
				Oeuvre o2 = new Oeuvre();
				o2.setTitre(t);
				o2.setAuteur(a);
				o2.setId(id);
				try {
					o.Ajouter(o2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id2 = Integer.parseInt(textField_3.getText());
				
				
				Oeuvre o = new Oeuvre();
				
				try {
					o.Supprimer(id2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id2 = Integer.parseInt(textField_13.getText());
				
				
				Emprunt E = new Emprunt();
				
				
				try {
					E.addReturn(id2);
					
					JOptionPane.showMessageDialog(null," Modifi� avec succ�s ");
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
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdmineGestionUsers frame2 = new AdmineGestionUsers();
				frame2.setVisible(true);
				
				}
				
				
			
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date newDate = new Date();
             Date d = dateChooser.getDate();
			
             String date = (String)dateFormat.format(d);
			int id = Integer.parseInt(textField_6.getText());
			String nom  = textField_4.getText();
			String prenom  = textField_5.getText();
			
			Auteur A = new Auteur();
			Auteur B = new Auteur();
			A.setDateNaissance(date);
			A.setNom(nom);
			A.setId(id);
			A.setPrenom(prenom);
			try {
				B.Ajouter(A);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
				
				
				
				
				
				
				
				}
				
				
			
		});
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			String id = textField_7.getText();
			
			
			Auteur B = new Auteur();
			 ResultSet res = null;
			try {
				res =B.chercher(id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(res != null) {
				
				
				table.setModel(DbUtils.resultSetToTableModel(res));
				 
			}
			else {
           	
           	  
           	  JOptionPane.showMessageDialog(null,"No Auteur");
             } 
				
				
				
			
				
				
				
				
				
				
				
				
				
				}
			
				
				
			
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			int id = Integer.parseInt(textField_10.getText());
			String nom  = textField_8.getText();
			String prenom  = textField_9.getText();
			
			Editeur A = new Editeur();
			Editeur B = new Editeur();
			A.setNom(nom);
			A.setId(id);
			A.setPrenom(prenom);
			try {
				B.Ajouter(A);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
				
				
				
				
				
				
				
				}
			
				
				
			
		});
		
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date newDate = new Date();
             Date d = dateChooser_1.getDate();
			
             String date = (String)dateFormat.format(d);
			int id = Integer.parseInt(textField_12.getText());
			int  numeroOeuvre  = Integer.parseInt(textField_14.getText());
			int  prenom  = Integer.parseInt(textField_15.getText());
			
			Oeuvre A = new Oeuvre();
			Editeur B = new Editeur();
			
			A.setId(numeroOeuvre);
			B.setId(prenom);
			Edition E= new Edition();
			Edition H= new Edition();
			E.setDate(date);
			E.setOeuvre(A);
			E.setEditeur(B);
			E.setId(id);
			
			try {
				H.Ajouter(E);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
				
				
				
				
				
				
				
				}
				
				
			
		});
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			String id = textField_11.getText();
			
			
			Editeur B = new Editeur();
			 ResultSet res = null;
			try {
				res =B.chercher(id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(res != null) {
				
				
				table_1.setModel(DbUtils.resultSetToTableModel(res));
				table_1.setVisible(true);
				 
			}
			else {
           	
           	  
           	  JOptionPane.showMessageDialog(null,"No Editeur");
           	table_1.setVisible(false);
             } 
				
				
				
			
				
				
				
				
				
				
				
				
				
				}
			
				
				
			
		});

		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			String id = textField_17.getText();
			
			
			Edition B = new Edition();
			 ResultSet res = null;
			try {
				res =B.chercher(id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(res != null) {
				
				
				table_2.setModel(DbUtils.resultSetToTableModel(res));
				table_2.setVisible(true);
				 
			}
			else {
           	
           	  
           	  JOptionPane.showMessageDialog(null,"No Edition Found ");
           	table_2.setVisible(false);
             } 
				
				
				
			
				
				
				
				
				
				
				
				
				
				}
			
				
				
			
		});
		
		
		
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String  id2 = textField_22.getText();
				
				
				Edition o = new Edition();
				
				try {
					o.Supprimer(id2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		btnChercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			String id = textField_23.getText();
			
			
			Oeuvre B = new Oeuvre();
			 ResultSet res = null;
			try {
				res =B.chercher(id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(res != null) {
				
				
				table_4.setModel(DbUtils.resultSetToTableModel(res));
				table_4.setVisible(true);
				 
			}
			else {
           	
           	  
           	  JOptionPane.showMessageDialog(null,"Not  Found ");
           	table_4.setVisible(false);
             } 
				
				
				
			
				
				
				
				
				
				
				
				
				
				}
			
				
				
			
		});
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			int id = Integer.parseInt(textField_16.getText());
			int  id3  = Integer.parseInt(textField_19.getText());
			String key  = textField_20.getText();
			
			Suport A = new Suport();
			Suport B = new Suport();
			Edition E = new Edition() ;
			E.setId(id3);
			A.setEdition(E);
			A.setKey_words(key);
			A.setNumber(1);
			A.setId(id);
			
			try {
				B.Ajouter(A);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
				
				
				
				
				
				
				
				}
			
				
				
			
		});
		
		btnNewButton_5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			String id = textField_21.getText();
			
			
			Suport B = new Suport();
			 ResultSet res = null;
			try {
				res =B.chercher(id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(res != null) {
				
				
				table_3.setModel(DbUtils.resultSetToTableModel(res));
				table_3.setVisible(true);
				 
			}
			else {
           	
           	  
           	  JOptionPane.showMessageDialog(null,"Not  Found ");
           	table_3.setVisible(false);
             } 
				
				
				
			
				
				
				
				
				
				
				
				
				
				}
			
				
				
			
		});
	}
}


