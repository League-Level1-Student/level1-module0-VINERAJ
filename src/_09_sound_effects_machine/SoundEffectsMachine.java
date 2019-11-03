package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panle = new JPanel();
JButton b = new JButton(); 
JButton bu = new JButton();
JButton butt = new JButton();
public void sound() {
	frame.setVisible(true);
	frame.add(panle);
	panle.add(b);
	b.setText("saw");
	b.addActionListener(this);
	panle.add(bu);
	bu.setText("buzz");
	bu.addActionListener(this);
	panle.add(butt);
	butt.setText("Me Like");
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	// TODO Auto-generated method stub
	if(buttonPressed==b) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	else if(buttonPressed==bu) {
		playSound("buzzz.wav");
	}
	else if(buttonPressed==butt) {
		playSound("me like.mp3");
	}
}
private void playSound(String soundFile) { 
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
