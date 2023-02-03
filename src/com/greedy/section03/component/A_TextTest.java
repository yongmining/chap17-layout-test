package com.greedy.section03.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_TextTest {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame();
		mf.setSize(800, 300);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		/* 글을 입력할 수 있는 한 줄 짜리 대화 상자*/
		JTextField id = new JTextField();
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		/* 비밀번호를 입력할 수 있는 대화상자(입력되는 값을 화면에서 볼 수 없음)*/
		JPasswordField password = new JPasswordField();	
		panel.add(new JLabel("PASSWORD"));
		panel.add(password);
		
		/* 여러 줄의 텍스트를 입력할 수 있는 상자를 TextArea 라고 한다.*/
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		JButton btn =new JButton("보내기");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				text += "password = " + password.getPassword() + "\n";	
				
				char[] pass = password.getPassword();
				for(int i = 0; i < pass.length; i++) {
					System.out.print(pass[i]);
				}
				
				textArea.append(text);
			}
		});

//		btn.addActionListener(e -> {
//			
//			String text = "id = " + id.getText() + "\n";
//			text += "password = " + password.getPassword() + "\n";
//			
//			char[] pass = password.getPassword();
//			for(int i = 0; i < pass.length; i++) {
//				System.out.print(pass[i]);
//		}
//		
//		
		mf.add(panel, BorderLayout.NORTH);
		mf.add(textArea, BorderLayout.CENTER);
		mf.add(btn, BorderLayout.SOUTH);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
