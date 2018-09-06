package example01;

import javax.swing.JOptionPane;

public class ValueTest {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("입력하세요.");
		System.out.println("input : " + input);
		
		int integerParse = Integer.parseInt(input);
		System.out.println("int Input : " + integerParse);
	}
}
