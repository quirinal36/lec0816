package ba.coder.kr.swing;

import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImagePractice {

	public ImagePractice() {
		JFrame frame = new JFrame("image");
		ImageIcon img = new ImageIcon("resource/01.PNG");
		
		JLabel label = new JLabel(img);
		frame.add(label);
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.invalidate();
	}
}
