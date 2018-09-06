package ba.coder.kr;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JTextField inputNumber01;
	JTextField inputNumber02;
	JLabel result;
	JButton btnPlus;
	
	public Calculator() {
		JFrame frame = new JFrame("계산기");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 500, 500);
		frame.setVisible(true);
		
		// init(frame);
	}
	
	public void init(JFrame root) {
		JPanel parent = new JPanel();
		parent.setBackground(Color.YELLOW);
		parent.setLayout(new GridLayout(4, 1));
		root.getContentPane().add(parent);
		
		inputNumber01 = new JTextField(5);
		inputNumber01.setHorizontalAlignment(JTextField.CENTER);
		inputNumber01.setFont(new Font(null, Font.BOLD, 20));
		JPanel operandPanel = new JPanel();
		operandPanel.setBackground(Color.RED);
		inputNumber02 = new JTextField(5);
		inputNumber02.setHorizontalAlignment(JTextField.CENTER);
		inputNumber02.setFont(new Font(null, Font.BOLD, 20));
		result = new JLabel("결과 : ");
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setFont(new Font(null, Font.BOLD, 20));
		
		operandLine(operandPanel);
		
		parent.add(inputNumber01);
		parent.add(inputNumber02);
		parent.add(operandPanel);
		parent.add(result);
		
		root.validate();
	}
	
	public void operandLine(JPanel parent) {
		parent.setLayout(new GridLayout(1, 4));
		
		btnPlus = new JButton("+");
		btnPlus.setFont(new Font(null, Font.BOLD, 20));
		btnPlus.addActionListener(this);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font(null, Font.BOLD, 20));
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font(null, Font.BOLD, 20));
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font(null, Font.BOLD, 20));
		
		parent.add(btnPlus);
		parent.add(btnMinus);
		parent.add(btnMul);
		parent.add(btnDiv);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MyCalcInfo info = new MyCalcInfo();
		info.setInput1(Integer.parseInt(inputNumber01.getText())); 
		info.setInput2(Integer.parseInt(inputNumber02.getText()));
		
		if(e.getSource() == btnPlus) {
			info.setOperator("+");
			info.setResult(info.add());
			
			System.out.println(info.toString());
			
			this.result.setText("결과 : "+String.valueOf(info.getResult()));
		}
	}
}
