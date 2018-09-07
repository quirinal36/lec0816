package ba.coder.kr.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundPractice extends JFrame implements ActionListener {
	
	public SoundPractice() {
		JButton button = new JButton(new ImageIcon("resource/dice.png"));
		add(button);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		bgmPlay(new File("resource/dice.wav"));
	}
	
	public void bgmPlay(File file){
	    try{
	        final Clip clip = (Clip)AudioSystem.getLine(new Line.Info(Clip.class));
	        clip.addLineListener(new LineListener(){
	            @Override
	            public void update(LineEvent event){
	                if (event.getType() == LineEvent.Type.STOP)
	                    clip.close();
	            }
	        });

	        clip.open(AudioSystem.getAudioInputStream(file));
	        clip.start();
	    } catch (Exception exc){
	        exc.printStackTrace(System.out);
	    }
	}
}
