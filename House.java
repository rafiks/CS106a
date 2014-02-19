/*
 * File: House.java

 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

//import acm.graphics.GLine;
import acm.program.*;
import acm.graphics.*;



public class House extends GraphicsProgram {
	private static final int DELTA_X = 210;
	private static final int DELTA_Y = 85;
	private static final int DELTA_Z = 165;
	private static final int DELTA_F= 400;
	
	
	public void run() {
		/* You fill this in */
		int midpoint_x = getWidth() /2;
		int midpoint_y = getHeight() /2;
		
		int mid_left_window = ((midpoint_x-45)-(midpoint_x-DELTA_X)/2 );
		
		GLine left_roof = new GLine(midpoint_x-DELTA_X,DELTA_X,midpoint_x,DELTA_Y);
		add(left_roof);
		
		GLine right_roof = new GLine(midpoint_x+DELTA_X,DELTA_X,midpoint_x,DELTA_Y);
		add(right_roof);
		
		GLine base_roof = new GLine(midpoint_x-DELTA_X,DELTA_X,midpoint_x+DELTA_X,DELTA_X);
		add(base_roof);
		
		GLine floor = new GLine(midpoint_x-DELTA_X,DELTA_F,midpoint_x+DELTA_X,DELTA_F);
		add(floor);
		
		GLine left_wall = new GLine(midpoint_x-DELTA_X,DELTA_X,midpoint_x-DELTA_X,DELTA_F);
		add(left_wall);
		
		GLine right_wall = new GLine(midpoint_x+DELTA_X,DELTA_X,midpoint_x+DELTA_X,DELTA_F);
		add(right_wall);
		
		GLine top_door = new GLine(midpoint_x-45,DELTA_X+50,midpoint_x+45,DELTA_X+50);
		add(top_door);
		
		GLine leftside_door = new GLine(midpoint_x-45,DELTA_X+50,midpoint_x-45,DELTA_F);
		add(leftside_door);
		
		
		GLine rightside_door = new GLine(midpoint_x+45,DELTA_X+50,midpoint_x+45,DELTA_F);
		add(rightside_door);
		
		
		GLine t_leftwindow = new GLine(mid_left_window-45,DELTA_X+35,mid_left_window+45,DELTA_X+35);
		add(t_leftwindow);
		
		GLine r_leftwindow = new GLine(mid_left_window+45,DELTA_X+35,mid_left_window+45,DELTA_X+125);
		add(r_leftwindow);
		
		GLine l_leftwindow = new GLine(mid_left_window-45,DELTA_X+35,mid_left_window-45,DELTA_X+125);
		add(l_leftwindow);
		
		GLine b_leftwindow = new GLine(mid_left_window-45,DELTA_X+125,mid_left_window+45,DELTA_X+125);
		add(b_leftwindow);
		
		
		
	}
}

