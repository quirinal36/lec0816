package ba.coder.kr;

import javax.swing.JFrame;

import ba.coder.kr.swing.SoundPractice;

public class MainClass {
	
	public static void main(String[] args) {
//		TextSavePractice textFrame = new TextSavePractice();
		SoundPractice frame = new SoundPractice();
		
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}