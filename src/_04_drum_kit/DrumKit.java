package _04_drum_kit;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel drumLabelWithImage;
    JLabel bassLabelWithImage;
    JLabel floorLabelWithImage;
    JLabel cymbalLabelWithImage;
	public void run() throws MalformedURLException {

		// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame j = new JFrame();
		// 2. Make the frame visible and
		// set its default close operation to JFrame.EXIT_ON_CLOSE
j.setVisible(true);
		// 3. Set the size of the frame
j.setSize(100, 100);
		// 4. Set the title of the frame
j.setTitle("Drum Kit");
		// 5. Make a JPanel variable and initialize it using "new JPanel().
JPanel p = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
j.add(p);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".

		// 8. Put the name of your image file in a String variable.
String drumImage = "druum.jpeg";
		// 9. Edit the next line to use your String variable
		// drumLabelWithImage = createLabelImage(drumImageString);
drumLabelWithImage = createLabelImage(drumImage);
		// 10. Add the image to the panel
p.add(drumLabelWithImage);
		// 11. Set the layout of the panel to "new GridLayout()"
p.setLayout(new GridLayout());
		// 12. call the pack() method on the frame. Run your program. Do you see
		// your drum image?
j.pack();
		// 13. add this mouse listener to drumLabelWithImage
drumLabelWithImage.addMouseListener(this);
		// 18. Add more images to make a drumkit. Remember to add this mouse
		// listener to each one.
String bassDrumImage = "baas.jpg";
bassLabelWithImage = createLabelImage(bassDrumImage);
p.add(bassLabelWithImage);
p.setLayout(new GridLayout());
j.pack();
bassLabelWithImage.addMouseListener(this);
String floorImage = "flooor.jpeg";
floorLabelWithImage = createLabelImage(floorImage);
p.add(floorLabelWithImage);
p.setLayout(new GridLayout());
j.pack();
floorLabelWithImage.addMouseListener(this);
String cymbalImage = "cymbaal.jpeg";
cymbalLabelWithImage = createLabelImage(cymbalImage);
p.add(cymbalLabelWithImage);
p.setLayout(new GridLayout());
j.pack();
cymbalLabelWithImage.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// 14. Print "mouse clicked" to the console. Run your program and watch
		// the console to see when this is printed.
System.out.println("mouse clicked");
		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label
														// that the mouse
														// clicked on

		// 15. Download a drum sound and drop it into your "default package".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.

		// 16. If they clicked on the drumImage...
if(drumLabelWithImage==drumClicked) {
	playSound("drum.wav");
}
		// 17. ...use the playSound method to play a drum sound. Test to see if
		// it works
if(bassLabelWithImage==drumClicked) {
	playSound("bassDrum.wav");
}
if(cymbalLabelWithImage==drumClicked) {
	playSound("bigHit.wav");
}
if(floorLabelWithImage==drumClicked) {
	playSound("flooooor.wav");
}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
