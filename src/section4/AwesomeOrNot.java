package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int R=new Random ().nextInt(4);
	// 3. Print out this variable
		System.out.println(R);
	// 4. Get the user to enter something that they think is awesome
		String s=JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
		if (0==R) {
		JOptionPane.showMessageDialog(null, s+ "is awesome!!!!!");	
		}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
		if (1==R) {
			JOptionPane.showMessageDialog(null, s+ "is ok");	
			}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
		if (2==R) {
			JOptionPane.showMessageDialog(null, s+ "is boring");	
			}
	// -- tell the user whatever they entered is boring.
		
	// 8. If the random number is 3
		if (3==R) {
			JOptionPane.showMessageDialog(null, s+ "is Sucks");	
			}
	// -- write your own answer

}}


