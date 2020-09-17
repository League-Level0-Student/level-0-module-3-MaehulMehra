package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog (null,"One time a man went into a restaurant. He was deciding between mac and cheese or ravioli. It was a very tough decision for him" );
		String question1 = JOptionPane.showInputDialog(null, "Which one would you eat, mac and cheese or ravioli");
		if (question1.equalsIgnoreCase("mac and cheese")) {
			JOptionPane.showMessageDialog (null, "Now the man has ordered mac and cheese, but he doesn't know if he wants to sit outside or inside");
		}
		else if (question1.equalsIgnoreCase("ravioli")) {
			JOptionPane.showMessageDialog(null, "Now the man has ordered ravioli, but he doesn't know whether to sit inside or outside.");
		}
		String question2 = JOptionPane.showInputDialog (null, "What would you rather do sit inside or outside while eating your food?");
		if (question2.equalsIgnoreCase("outside")) {
			JOptionPane.showMessageDialog(null, "Now the man is sitting outside enjoying the nice fresh air");
		}
		else if (question2.equalsIgnoreCase("inside")) {
			JOptionPane.showMessageDialog(null, "Now the man is sitting inside in the A.C.");
		}
	}
}
