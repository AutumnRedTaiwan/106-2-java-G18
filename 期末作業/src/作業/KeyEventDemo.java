package 作業;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;


public class KeyEventDemo extends JFrame{
	
		
        private KeyboardPanel keyboardPanel = new KeyboardPanel();
       
        public KeyEventDemo() {
        	
        }
        
        public KeyEventDemo(int start){           

        			add( keyboardPanel);
                    
                    keyboardPanel.setFocusable(true);
      	      
              
       }
       
       
        static class KeyboardPanel extends JPanel{
               private int x = 100;
               private int y = 100;
               
               private int gametime = 0;
               
               private int x3, y3, x4, y4 ;
               
               private int x2 = 200;
               private int y2 = 200;
               private char KeyChar = 'A' ;
               private char KeyChar2 = 'B' ;
              
               public KeyboardPanel(){
                     addKeyListener( new KeyAdapter(){
                            public void keyPressed(KeyEvent e){
                                   switch(e.getKeyCode()){
                                   case KeyEvent.VK_DOWN: y += 10;break;
                                   case KeyEvent.VK_UP: y -= 10; break;
                                   case KeyEvent.VK_LEFT: x -= 10; break;
                                   case KeyEvent.VK_RIGHT: x += 10; break;
                                   }
                                   Random rand = new Random();
                                   
                                   x3 = x2-x;
                                   if(x3<0) x4 = 0-x3;
                                   else x4 = x3;
                                   y3 = y2-y;
                                   if(y3<0) y4 = 0-y3;
                                   else y4 = y3;
                                   
                                   if(x4<y4) {
                                	   if(x3>0) x2 += 20;
                                	   else x2 -= 20;
                                	   
                                	   if(x2>270){
                                		   if(y2<=20) y2 += 20;
                                		   else if(y2>=260) y2-= 20; 
                                		   else {
                                			   x2 -= 20;
                                			   if(y2<=20) y2 += 20;
                                			   else if(y2>=260) y2 -=20;
                                			   else{
                                				   int ynum;
                                				   ynum = rand.nextInt()%4;
                                				   if(ynum==0) x2 += 20;
                                				   else if(ynum==1) x2 += 20;
                                				   else if(ynum==2) x2 += 20;
                                				   else x2 -= 20;
                                			   }
                                		   }
                                	   }else if(x2<=0){
                                		   if(y2<=20) y2 += 20;
                                		   else if(y2>=260) y2-= 20;
                                		   else {
                                			   x2 += 20;
                                			   if(y2<=20) y2 += 20;
                                			   else if(y2>=260) y2 -=20;
                                			   else{
                                				   int ynum;
                                				   ynum = rand.nextInt()%4;
                                				   if(ynum==0) x2 += 20;
                                				   else if(ynum==1) x2 -= 20;
                                				   else if(ynum==2) x2 += 20;
                                				   else x2 -= 20;
                                			   }
                                		   }
                                	   }
                                   }else if(x4>y4) {
                                	   if(y3>0) y2 += 20;
                                	   else y2 -= 20;
                                	   
                                	   if(y2>260){
                                		   if(x2<=0) x2 += 20;
                                		   else if(x2>=270) x2-= 20; 
                                		   else {
                                			   y2 += 20;
                                			   if(x2<=20) x2 -= 20;
                                			   else if(x2>=260) x2 +=20;
                                			   else{
                                				   int xnum;
                                				   xnum = rand.nextInt()%4;
                                				   if(xnum==0) y2 += 20;
                                				   else if(xnum==1) y2 -= 20;
                                				   else if(xnum==2) x2 += 20;
                                				   else x2 -= 20;
                                			   }
                                		   }
                                	   }else if(y2<=20){
                                		   if(x2<=0) x2 += 20;
                                		   else if(x2>=270) x2-= 20; 
                                		   else {
                                			   y2 -= 20;
                                			   if(x2<=20) x2 += 20;
                                			   else if(x2>=260) x2 -=20;
                                			   else{
                                				   int xnum;
                                				   xnum = rand.nextInt()%4;
                                				   if(xnum==0) y2 += 20;
                                				   else if(xnum==1) y2 -= 20;
                                				   else if(xnum==2) x2 += 20;
                                				   else x2 -= 20;
                                			   }
                                		   }
                                	   }
                                   }
                                   
                                  repaint();
                           }
                     });
              }
              
               protected void paintComponent(Graphics g){
                      super.paintComponent(g);
                     
                     g.setFont( new Font("TimesRoman" ,Font.PLAIN,24));
                     if(x<0) x=0;
                     else if(x>270) x=270;
                     else if(y<20) y=20;
                     else if(y>260) y=260;
                     if(x2<0) x2=0;
                     else if(x2>270) x2=270;
                     else if(y2<20) y2=20;
                     else if(y2>260) y2=260;
                     g.drawString(String. valueOf(KeyChar), x, y);
                     g.drawString(String. valueOf(KeyChar2), x2, y2);
                     if(x==x2) {
                    	 if(y==y2) {
                    		 if(gametime==0) {
                    			 x=100;
                    			 x2=200;
                    			 y=100;
                    			 y2=200;
                    			 
                    			 JOptionPane.showMessageDialog(null, "A追到B了", "結束", JOptionPane.INFORMATION_MESSAGE );
                    			 
                    			 System.exit(0);
                    		 }
                     }
                     System.out.println("x="+x+", y="+y);
                     System.out.println("x2="+x2+", y2="+y2);
                     }
               }
        }
}