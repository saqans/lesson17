package com.practicaljava.lesson17;
import javax.swing.*;
import java.awt.FlowLayout;

public class MyCustomizableGUI extends JFrame{
	
	public static void main(String[] args){

	// Creation of a label to contain all the JButtons.
		
	FlowLayout flow = new FlowLayout();
	
	
	
    JPanel panel = new JPanel();
    
    panel.setLayout(flow);
    JButton button = new JButton("Open File...");
    panel.add(button);

	
    JFrame frame = new JFrame();
	frame.setContentPane(panel);
	
	frame.setSize(400, 400);
	frame.setVisible(true);
    


	}
}