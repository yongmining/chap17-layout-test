package com.greedy.section01.container;

import javax.swing.JFrame;

public class JFrameTest2 {
	
	public void showMainFrame() {
		
		/* JFrame 인스턴스 생성 */
		JFrame mainFrame = new JFrame("MyFrame2");
		
		mainFrame.setBounds(300, 200, 800, 500);
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
