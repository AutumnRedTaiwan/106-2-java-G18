package �����@�~;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class gamescreen {
	static	String Filename;
	static	BufferedImage image;
	static	JFrame jf;
	public void screen(){
	Filename="gamescreen.png";
	winlost wl = new winlost();
    try
    {
            image=ImageIO.read(new File(Filename));
    }
    catch(Exception e)
    {
            javax.swing.JOptionPane.showMessageDialog(null, "���J���ɿ��~: "+Filename);
            image=null;
    }
    /**
     * �إߵ���
     */
    jf = new JFrame("");
    /**
     * �]�w�I��
     */
    JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon(image)));
    /**
     * �]�w�����j�p
     */
    jf.getContentPane().add(scrollPane);
    jf.pack();
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setTitle(Filename+" "+image.getWidth()+" x "+image.getHeight());
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);  
}

}
