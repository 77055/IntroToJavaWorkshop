package day3;

import javax.swing.JOptionPane;

public class SnooperCreeper {
	public static void main(String[] args) {
		String Color =JOptionPane.showInputDialog("What is your favorite color");
		JOptionPane.showMessageDialog(null,"I know your favorite color is "+ Color);
		String Password =JOptionPane.showInputDialog("What is your Email password");
		JOptionPane.showMessageDialog(null, "I know your Email Password is "+ Password );
		String Name =JOptionPane.showInputDialog("What is your name");
        JOptionPane.showMessageDialog(null, "I know your name is "+ Name);		
	}

}
