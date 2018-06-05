package game;


//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class DrawPanel extends JPanel{


	private static final long serialVersionUID = 1L;


	public DrawPanel() {
		super();

		

	}


	public void stop() {
		
		
	}


	public void exit() {
		JInternalFrame inf = new JInternalFrame("Are you sure to exit?", true,true,true,true);
		inf.setSize(300,300);
		inf.setLocation(25, 25);
		inf.setVisible(true);
		
	}

}