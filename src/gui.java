import java.awt.Color;

import javax.swing.*;

public class gui {

	JLabel text;
	
	public gui(){
		// edit 25.02.2013 - check at home!!!
		JFrame myFrame = new JFrame("GUI");
		myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		myFrame.setLayout(null);
		text = new JLabel("Test");
		text.setOpaque(true);
		text.setBackground(new Color(220,220,200));
		text.setBounds(10,10,40,20);
		myFrame.add(text);
		myFrame.setSize(320,180);
		myFrame.setVisible(true);
		System.out.println("Test 2");
	}
	
	public void counter(){
		
	}
	
	public void setPos(int x, int y){
		text.setBounds(x,y,40,20);
	}
	
}
