package ba.coder.kr.swing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextPractice extends JFrame{

	public TextPractice() {
		String content = new String();

		try {
			content = new String(Files.readAllBytes(Paths.get("resource/poetry.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel label = new JLabel(content);
		add(label);
	}
}
