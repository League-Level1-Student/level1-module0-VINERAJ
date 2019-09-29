package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String strong = "https://i0.wp.com/www.thenerddaily.com/wp-content/uploads/2018/09/Robert-Downey-Jr.jpg?fit=1000%2C742&ssl=1";
// 2. create a variable of type "Component" that will hold your image
Component comp;
		// 3. use the "createImage()" method below to initialize your Component
comp = createImage(strong);
		// 4. add the image to the quiz window
quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String jop = JOptionPane.showInputDialog("Did he play Sherlock Holmes?");
		// 7. print "CORRECT" if the user gave the right answer
if(jop.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "CORRECT!!!");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "INCORRECT!!!");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line
		// of code)
strong = "https://www.thesun.co.uk/wp-content/uploads/2019/03/NINTCHDBPICT0004777086082.jpg";
Component cooomp;
cooomp=createImage(strong);
		// 11. add the second image to the quiz window
quizWindow.add(cooomp);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String quoston = JOptionPane.showInputDialog("Which actor plays Gollum?");
		// 14+ check answer, say if correct or incorrect, etc.
if(quoston.equalsIgnoreCase("Andy Serkis")) {
	JOptionPane.showMessageDialog(null, "CORRECT!!!");
	quizWindow.dispose();
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT!!!");
	quizWindow.dispose();
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
