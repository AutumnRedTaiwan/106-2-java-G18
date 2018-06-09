package game;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class DrawPanel extends JPanel implements ActionListener,KeyListener{
	final int SPRITES_NUM = 2;
	final int SCREEN_WIDTH = 600;
	final int SCREEN_HEIGHT = 600;
	
	int xSpeed = 30;
	int ySpeed = 30;

	private static final long serialVersionUID = 1L;


	int[] spritePosX = new int[SPRITES_NUM];
	int[] spritePosY = new int[SPRITES_NUM];
	
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


	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
	
	// Move the Square
	if( key == KeyEvent.VK_UP )
		spritePosY[0] -= ySpeed;
	
	if( key == KeyEvent.VK_DOWN )
		spritePosY[0] += ySpeed;
	
	if( key == KeyEvent.VK_LEFT )
		spritePosX[0] -= xSpeed;
	
	if( key == KeyEvent.VK_RIGHT )
		spritePosX[0] += xSpeed;
	
	// Move the Circle
	if( key == KeyEvent.VK_W )
		spritePosY[1] -= ySpeed;
	
	if( key == KeyEvent.VK_X )
		spritePosY[1] += ySpeed;
	
	if( key == KeyEvent.VK_A )
		spritePosX[1] -= xSpeed;
	
	if( key == KeyEvent.VK_D)
		spritePosX[1] += xSpeed;
	
	checkSpritePosRange();
	repaint();	
	}
	
	private void checkSpritePosRange() {
		for(int i = 0; i < SPRITES_NUM; i++) {
			if( spritePosX[i] < 0)	spritePosX[i] = SCREEN_WIDTH;
			if( spritePosY[i] < 0)	spritePosY[i] = SCREEN_HEIGHT;
			if( spritePosX[i] > SCREEN_WIDTH) spritePosX[i] = 0;
			if( spritePosY[i] > SCREEN_HEIGHT) spritePosY[i] = 0;
		}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}