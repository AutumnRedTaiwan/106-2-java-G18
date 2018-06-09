package game;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class MainTest {
	
	static	String Filename;
	static	BufferedImage image;

	public static void main(String[] args) {
		DrawMainFrame app = new DrawMainFrame();

		Filename = "src/background.png";
		try
	    {
	            image = ImageIO.read(new File(Filename));
	    }
	    catch(Exception e)
	    {
	            javax.swing.JOptionPane.showMessageDialog(null, "¸ü¤J¹ÏÀÉ¿ù»~: "+Filename);
	            image=null;
	    }
		JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon("Resource/background.png")));
		
		app.getContentPane().add(scrollPane);
		app.pack();
		app.setDefaultCloseOperation(DrawMainFrame.EXIT_ON_CLOSE);
		app.setTitle(Filename+" "+image.getWidth()+" x "+image.getHeight());
		app.setLocationRelativeTo(null);
		app.setVisible(true);  
	}

}
