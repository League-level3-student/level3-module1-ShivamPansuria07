package _00_Intro_To_ArrayLists;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class _02_GuestBook {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */ 
	 public static void main(String[] args) {
		 JFrame frame = new JFrame();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JPanel panel = new JPanel();
		 frame.add(panel);
		 frame.pack();
		       JButton button= new JButton();
		       JButton button2 = new JButton();
		        panel.add(button);
		        button.setText("Add Name");
		        panel.add(button2);
		        button2.setText("View Names");
		        frame.setSize(150, 125);
	       
	    
	}
}


