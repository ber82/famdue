
import java.util.Timer;


public class TimerTaskDemo
{
	
	public static void main( String[] args )
  {

		gui mygui = new gui();
			
		Timer timer = new Timer();
    
    // Start in 2 Sekunden
    //timer.schedule( new Task(),200 );

    // Start in einer Sekunde dann Ablauf alle 5 Sekunden
		timer.schedule( new Task(mygui), 1000, 10 );

  }
  
  
  
}