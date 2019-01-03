package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int Score=0;
		// 2.  Ask the user a question 
		String s=JOptionPane.showInputDialog("Whats 1+1?");
		// 3.  Use an if statement to check if their answer is correct
		if (s.equals("2")) {
		Score++;
		JOptionPane.showMessageDialog(null, "Correct!!!!!");
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String A=JOptionPane.showInputDialog("Whats 3X3?");
		// 3.  Use an if statement to check if their answer is correct
		if (A.equals("9")) {
		Score++;
		JOptionPane.showMessageDialog(null, "Correct!!!!!");
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score is "+ Score);
	}
}
