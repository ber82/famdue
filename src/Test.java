import javax.swing.*;

public class Test {
	public static void main(String args[]){
		
		// google --> "java jframe"
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new gui();
	            }
	        }); // Erzeugt einen neuen Thread, der eine Instanz von TestJFrame erzeugt

	}
}
