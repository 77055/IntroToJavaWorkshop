package day3;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
	String Code =JOptionPane.showInputDialog("Do you know how to write code");
		

		// 2. If they say "yes", tell them they will rule the world.
         if (Code.equals("yes")) {
        	 JOptionPane.showMessageDialog(null, "You will rule the world");
        	 
			
		}
         else
         {
          JOptionPane.showMessageDialog(null, "Good luck washing the dishes");
        	 
        	 
        	 
        	 
         }
         }
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

