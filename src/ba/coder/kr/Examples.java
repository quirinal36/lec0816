package ba.coder.kr;

import javax.swing.JOptionPane;

public class Examples {

	public static void main(String[] args) {
		int i;
		int input;
		boolean result = true;
		
		input = Integer.parseInt(JOptionPane.showInputDialog("2 이상의 정수를 입력하십시오."));
		for(i=2; i<input; i++) {
			if(input%i == 0) {
				result = false;
				break;
			}
		}
		
		if(result) {
			System.out.println(input +" 는 소수입니다.");
		}else {
			System.out.println(input +" 은 소수가 아닙니다.");
		}
	}
}
