package painter;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape{
	
	private int tx4,ty4;
	
	public Circle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
	}

	public Circle(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled) {
		super(x1, y1, x2, y2, color, color2, filled);
	}
	

	public Circle(int x1, int y1, int x2, int y2, Color color) {
		super(x1,y1,x2,y2,color);
		
	}


	  
    @Override
    public void draw(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
		GradientPaint gpaint = new GradientPaint(55, 80, color, 100, 150, color2, true);
		g2d.setPaint(gpaint);
		g2d.setStroke(new BasicStroke(10.0f));
    	
    	int px1 = Math.min(x1, x2);
    	int py1 = Math.min(y1, y2);  	
    	
    	if(Math.abs(x1-x2) > Math.abs(y1-y2)) {
    		tx4 = Math.abs(y1-y2);
    	    ty4 = Math.abs(y1-y2);
    	}else if(Math.abs(y1-y2) > Math.abs(x1-x2)) {
    		tx4 = Math.abs(x1-x2);
    		ty4 = Math.abs(x1-x2);
    	}
    	
    	int px4 = tx4;
    	int py4 = ty4;
    	
    	if(filled) {
    		g.fillOval(px1,py1,px4,py4);
    	}else {
    		g.drawOval(px1,py1,px4,py4);
    	}
    }
}
