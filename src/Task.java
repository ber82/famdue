

import java.util.TimerTask;

class Task extends TimerTask
{
	
	gui mygui;
	static int x = 10;
	static int y = 10;
	static int xDir = 0;
	static int yDir = 0;
	
	Task(gui mygui){
		this.mygui = mygui;
	}
  @Override public void run()
  {
   // System.out.println( "Make my day." );
    mygui.setPos(0,x,y);
    
    
    if (xDir == 0){
    	if (x < 280)
    	{
    		++x;
    	}
    	else
    	{
    		--x;
    		xDir=1;
    	}
    }
    else
    {
    	if (x > 10)
    	{
    		--x;
    	}
    	else
    	{
    		x=x+2;
    		xDir=0;
    	}
    }
    
    if (yDir == 0){
    	if (y < 130)
    	{
    		++y;
    	}
    	else
    	{
    		--y;
    		yDir=1;
    	}
    }
    else
    {
    	if (y > 10)
    	{
    		--y;
    	}
    	else
    	{
    		++y;
    		yDir=0;
    	}
    }  
    
    
    


  
  
  }
}