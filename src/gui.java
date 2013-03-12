import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.*;

public class gui {

	JLabel text[];
	JLabel lGradient;
	myLabel test;
	
	public gui(){
		// edit 25.02.2013 - check at home!!!
		JFrame myFrame = new JFrame("GUI");
		myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		myFrame.setLayout(null);
		text = new JLabel[10];

		for (int i = 0; i < 10 ; i++){
			text[i]=new JLabel("Test " + i);
			text[i].setOpaque(true);
			text[i].setBackground(new Color(220,220,200));
			text[i].setBounds(10,21*i,40,20);
			myFrame.add(text[i]);
				
		}
		
		lGradient = new JLabel("Hello Color") {
			@Override
				            protected void paintComponent(Graphics grphcs) {
				                Graphics2D g2d = (Graphics2D) grphcs;
				                //super.paintComponent(grphcs);
				                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				                        RenderingHints.VALUE_ANTIALIAS_ON);
				 
				                GradientPaint gp = new GradientPaint(
				                		0, 0,
				                		new Color( 	255,165,0),
				                		0, getHeight()/2,
				                		new Color(255,215,0),
				                		true);
				 
				                g2d.setPaint(gp);
				                g2d.fillRect(0, 0, getWidth(), getHeight());
				                
				                //System.out.println(super.);
				                
				                //g2d.setColor(new Color(10,100,200));
				                //g2d.drawLine(0, 0, 80,20);
				                super.paintComponent(grphcs);
				                
				            }	
		};
		
		//lGradient.setOpaque(true);
		//lGradient.setBackground(new Color(220,220,200));
		//lGradient.setBounds(100,100,80,20);

		myFrame.add(lGradient);
		
		
			        JPanel contentPane = new JPanel() {
				            @Override
				            protected void paintComponent(Graphics grphcs) {
				                Graphics2D g2d = (Graphics2D) grphcs;
				                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				                        RenderingHints.VALUE_ANTIALIAS_ON);
				 
				                GradientPaint gp = new GradientPaint(0, 0,
				                        getBackground().brighter().brighter(), 0, getHeight(),
				                        getBackground().darker().darker());
				 
				                g2d.setPaint(gp);
			                 g2d.fillRect(0, 0, getWidth(), getHeight());
				 
				                super.paintComponent(grphcs);
				            }
				        };
				        contentPane.setOpaque(false);
				        //myFrame.setContentPane(contentPane);
				        
		test = new myLabel();		       
		test.setText("Moin");
		test.setBounds(150,50,80,20);
		
		
		myFrame.add(test);
		
		myFrame.setSize(320,180);
		myFrame.setVisible(true);
		System.out.println("Test 2");
	}
	
	
	
	public void counter(){
		
	}
	
	public void setPos(int nr, int x, int y){
		
		
		text[nr].setBounds(x,y,40,20);
	}
	
}
