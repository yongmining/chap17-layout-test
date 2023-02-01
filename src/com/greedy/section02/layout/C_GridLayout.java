package com.greedy.section02.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {

	public C_GridLayout() {
		super("GridLayout");
		
		this.setBounds(300, 200, 800, 500);
	
		this.setLayout(new GridLayout(5, 5));
		for(int i = 1; i < 26; i ++) {
			this.add(new JButton(i + ""));
		}
	
	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
