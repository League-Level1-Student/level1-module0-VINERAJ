import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JFrame farme = new JFrame();
JPanel panle = new JPanel();
JButton buton = new JButton();
JButton button = new JButton();
JButton buttton = new JButton();
public void cute() {
	farme.add(panle);
	panle.add(buton);
	buton.setText("Duck");
	buton.addActionListener(this);
	panle.add(button);
	button.setText("Frog");
	button.addActionListener(this);
	panle.add(buttton);
	buttton.setText("Unicorn");
	buttton.addActionListener(this);
	farme.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	// TODO Auto-generated method stub
	if(buttonPressed==buton) {
		
	}
}

}
