package ba.coder.kr;

import javax.swing.JFrame;

import ba.coder.kr.swing.ImagePractice;
import ba.coder.kr.swing.TextPractice;
import ba.coder.kr.swing.TextSavePractice;

public class MainClass {
	
	public static void main(String[] args) {
		TextSavePractice textFrame = new TextSavePractice();
		
		textFrame.setBounds(100, 100, 500, 500);
		textFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textFrame.setVisible(true);
	}
}