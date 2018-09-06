package ba.coder.kr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Index implements ActionListener {
	JButton btnNewButton;
	JTextField textField;
	JFrame frame;
	
	public Index() {
		frame = new JFrame("Title");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		panel.setLayout(new BorderLayout());
		
//		btnNewButton = new JButton("검색");
//		btnNewButton.addActionListener(this);
//		panel.add(btnNewButton);
		
		
		
		
		
		 btnNorth = new JButton("North");
		 btnWest = new JButton("West");
		 btnCenter = new JButton("Center");
		 btnEast = new JButton("East");
		 btnSouth = new JButton("South");
		btnNorth.addActionListener(this);
		btnWest.addActionListener(this);
		btnCenter.addActionListener(this);
		btnEast.addActionListener(this);
		btnSouth.addActionListener(this);
		
		panel.add(btnNorth, BorderLayout.NORTH);
		panel.add(btnWest, BorderLayout.WEST);
		panel.add(btnCenter, BorderLayout.CENTER);
		panel.add(btnEast, BorderLayout.EAST);
		panel.add(btnSouth, BorderLayout.SOUTH);
		
		frame.validate();
	}
	JButton btnNorth;
	JButton btnWest;
	JButton btnCenter;
	JButton btnEast;
	JButton btnSouth;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNorth) {
			System.out.println("윗쪽");
		}else if(e.getSource() == btnWest) {
			System.out.println("왼쪽");
		}else if(e.getSource() == btnCenter) {
			System.out.println("점프");
		}else if(e.getSource() == btnEast) {
			System.out.println("오른쪽");
		}else if(e.getSource() == btnSouth) {
			System.out.println("아래쪽");
		}
	}
}
