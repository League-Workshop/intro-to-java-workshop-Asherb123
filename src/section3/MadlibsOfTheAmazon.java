package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		String s=JOptionPane.showInputDialog("If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String A=JOptionPane.showInputDialog("enter an ajictive");
		// Get the user to enter a type of liquid
		String B=JOptionPane.showInputDialog("Enter a liquid");
		// Get the user to enter a body part
		String c=JOptionPane.showInputDialog("enter a body part");
		// Get the user to enter a verb
		String d=JOptionPane.showInputDialog("enter an action?");
		// Get the user to enter a place
		String e=JOptionPane.showInputDialog("enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more"+A+"during the day, cross the river at night. Pirhanhas are attracted to fresh"+B+"and will most likley take a bite out of your"+c+"if you"+d+"Whatever you do, if you have an open wound, try to find another way to get back to that"+e);

	}
}

