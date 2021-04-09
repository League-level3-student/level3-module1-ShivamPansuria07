package _00_Intro_To_ArrayLists;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class _02_GuestBook implements ActionListener {
	
	/*
	 * Create a GUI with two buttons. One button reads "Add Name" and the other
	 * button reads "View Names". When the add name button is clicked, display an
	 * input dialog that asks the user to enter a name. Add that name to an
	 * ArrayList. When the "View Names" button is clicked, display a message dialog
	 * that displays all the names added to the list. Format the list as follows:
	 * Guest #1: Bob Banders Guest #2: Sandy Summers Guest #3: Greg Ganders Guest
	 * #4: Donny Doners
	 */
	 ArrayList<String> names = new ArrayList<String>();
	JButton button = new JButton();
	 JButton button2 = new JButton();
	public void run() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.pack();
        button.addActionListener(this);
        button2.addActionListener(this);
		panel.add(button);
		button.setText("Add Name");
		panel.add(button2);
		button2.setText("View Names");
		frame.setSize(300, 120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		 

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (button == buttonPressed) {
String name = JOptionPane.showInputDialog("Enter a name");
names.add(name);
		}
		
        
		if (button2 == buttonPressed) {
			for(int i = 0; i < names.size(); i++){
	            String s = names.get(i);
	           
	            	JOptionPane.showMessageDialog(null, "Guest #" + (i+1) + ": " + s);
				}
	            
	        }
            
		}

	}

	

