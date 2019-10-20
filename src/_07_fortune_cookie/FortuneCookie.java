package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame= new JFrame();
	JButton button = new JButton();
	public void showButton() {
		frame.setVisible(true);
        System.out.println("Button clicked");
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "The sun is shining today. You should enjoy it for as long as you can. You never know if you'll see it again.");
			
		}
		else if(rand==1) {
			JOptionPane.showMessageDialog(null, "The FBI are closing in");
		}
		else if(rand==2) {
			JOptionPane.showMessageDialog(null, "Watch out for white vans");
		}
		else if(rand==3) {
			JOptionPane.showMessageDialog(null, "Close all the windows. Someone is stalking you. Oops, too late, they're in your house");
		}
		else if(rand==4) {
			JOptionPane.showMessageDialog(null, "Don't go to school tommorow");
		}
	}
}
