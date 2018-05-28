package game;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.GradientPaint;


public class Background extends SettingBackground{
    public Background(int x1,int y1, int x2, int y2, int Color) {
    	super(x1,y1,x2, y2,Color);
    }
    
    @Override
    public void draw(Graphics g){
    	
    	g.drawLine(100, 100, 100, 300);
    }
}
