package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton buton = new JButton();
JButton buon = new JButton();
public void cute() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	button.setText("Duck");
	button.addActionListener(this);
	panel.add(buton);
	buton.setText("Frog");
	buton.addActionListener(this);
	panel.add(buon);
	buon.setText("Unicorn");
	buon.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	// TODO Auto-generated method stub
	if(buttonPressed==button) {
		showDucks();
	}
	if(buttonPressed==buton) {
		showFrog();
	}
	if(buttonPressed==buon) {
		showFluffyUnicorns();
	}
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
