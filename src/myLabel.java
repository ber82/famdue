import javax.swing.*;
import java.awt.*;




public class myLabel extends JLabel {

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
	
	
}
