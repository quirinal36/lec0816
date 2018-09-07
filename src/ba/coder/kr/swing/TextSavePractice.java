package ba.coder.kr.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextSavePractice extends JFrame implements ActionListener {

	JTextField textField;
	
	public TextSavePractice() {
		setLayout(new BorderLayout());						// 레이아웃 지정
		
		textField = new JTextField(20);						// 글 작성하는 공간
		JButton saveButton = new JButton("저장");				// 저장 버튼
		saveButton.addActionListener(this);					// 버튼 동작 감지
		
		add(textField, BorderLayout.CENTER);				// 글 작성공간을 Center 에 두기
		add(saveButton, BorderLayout.SOUTH);				// 버튼을 아래쪽에 두기
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		final String textSave = textField.getText();		// 작성한 글 받아오기
		
		writeFile(textSave);								// 메소드 호출
	}
	
	/**
	 * 파일 작성 메소드
	 * @param inputText
	 */
	private void writeFile(String inputText) {
		File file = new File("resource" , "output.txt");	// 파일경로, 파일명
		FileWriter writer = null;
		try {
			writer = new FileWriter(file, false);			// 작성할 파일, 이어쓰기
			writer.write(inputText);						// 파일 만들기
			writer.flush();									// 비워내기
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer!=null) {
					writer.close();							// 닫기
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
