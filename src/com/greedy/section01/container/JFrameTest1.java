package com.greedy.section01.container;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {

	public JFrameTest1() {
	
//		this.setSize(800, 500);
//		this.setLocation(300, 200);
		
		this.setBounds(300, 200, 800, 500);
		
		this.setTitle("MyFrame");
		
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.PNG")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setResizable(false);
		
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
