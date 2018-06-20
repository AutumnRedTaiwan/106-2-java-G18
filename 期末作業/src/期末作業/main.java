package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class main { 
		static	String Filename;
		static	BufferedImage image;
		static	JFrame jf;
	public static void main(String[] args) {
		startgame sg = new startgame();
		
		sg.screen();
		/*gamescreen gs = new gamescreen();
		gs.screen(Filename, image, jf);*/
		
	}
}
