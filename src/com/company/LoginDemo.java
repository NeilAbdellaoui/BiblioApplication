package com.company;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.UIManager;

public class LoginDemo extends JFrame implements ActionListener {

	JPanel panel;
	JLabel user_label, password_label, message;
	JTextField userName_text;
	JPasswordField password_text;
	JButton submit, cancel;

	LoginDemo() {
		setType(Type.POPUP);
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/neilabdellaoui/Downloads/bookappimage.png"));
		// User Label
		user_label = new JLabel();
		user_label.setForeground(new Color(25, 25, 112));
		user_label.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		user_label.setText("Username :");
		userName_text = new JTextField();
		userName_text.setHorizontalAlignment(SwingConstants.CENTER);

		// Password

		password_label = new JLabel();
		password_label.setForeground(new Color(25, 25, 112));
		password_label.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 18));
		password_label.setVerticalAlignment(SwingConstants.BOTTOM);
		password_label.setText("Password :");
		password_text = new JPasswordField();

		// Submit

		submit = new JButton("SUBMIT");
		submit.setForeground(Color.BLACK);
		submit.setBackground(new Color(70, 130, 180));
		submit.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 14));

		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));

		message = new JLabel();
		message.setFont(new Font("Urdu Typesetting", Font.BOLD | Font.ITALIC, 16));
		message.setForeground(Color.RED);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Adding the listeners to components..
		submit.addActionListener(this);
		getContentPane().add(panel, BorderLayout.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup( 
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(266, Short.MAX_VALUE)
					.addComponent(submit, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addGap(93))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(61)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(password_label, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(password_text))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addComponent(user_label, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addComponent(userName_text, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)))
					.addGap(81))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(75)
					.addComponent(message, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(90, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(user_label, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(userName_text, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(password_label, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(password_text, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addComponent(submit, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(message, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		setTitle("Please Login Here !");
		setSize(468, 275);
		setVisible(true);

	}

	public static void main(String[] args) {

		new LoginDemo();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		ConnectionDataBase connection = new ConnectionDataBase();
	
		String userName = userName_text.getText();
		String password = password_text.getText();
		String result = ConnectionDataBase.authentification(password, userName);
		if (result.equals("admin")) {
			
			AdmineChose frame = new AdmineChose();
			frame.setVisible(true);
		    this.dispose();
			//message.setText(" Hello " + userName + "");
			
		}else if (result.equals("user")) {
			
			userInterface  frame = new userInterface();
			frame.setVisible(true);
		    this.dispose();
			//message.setText(" Hello " + userName + "");
			
		}
		
		
		
		
		else {
			message.setText(" Invalid User Try Again Please ! ");
		}

	}

}