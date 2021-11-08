package com.company;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Color;

public class AdmineChose extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmineChose frame = new AdmineChose();
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
	public AdmineChose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 633);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Gestion des utilisateurs");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			AdmineGestionUsers frame1 = new AdmineGestionUsers();
				frame1.setVisible(true);
				dispose();
				
			}
		});
		
		JButton btnGestionDesResources = new JButton("Gestion des ressources");
		btnGestionDesResources.setForeground(Color.BLACK);
		btnGestionDesResources.setBackground(SystemColor.textHighlight);
		btnGestionDesResources.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 24));
		btnGestionDesResources.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdmineGestionResources frame2 = new AdmineGestionResources();
				frame2.setVisible(true);
				dispose();
				
			}
		});
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("Users/neilabdellaoui/Downloads/bookappimage.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
					.addComponent(btnGestionDesResources, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
					.addGap(47))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(308, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
					.addGap(173))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(147)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGestionDesResources, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addComponent(label)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
}
