package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog(null, "Are you happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		}
		else if (happy.equalsIgnoreCase("no")) {
			String doYouWant = JOptionPane.showInputDialog(null, "Do you want to be happy");

			 if (doYouWant.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			 else if (doYouWant.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing?");
			}
		}
	}
}
