package �����@�~;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class setscreen {
	static	String Filename;
	static	BufferedImage image;
	static	JFrame jf;
	int num;
	
	public void screen(){
		
	Filename="setting.png";
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
    
    Container cp=jf.getContentPane();
    
    JButton b1 = new JButton("�n����");
    b1.setForeground(Color.WHITE);
    b1.setBackground(Color.BLACK);
    b1.setBounds(35,138,150,35);
    cp.add(b1);
    
    
    JButton b2 = new JButton("���n����");
    b2.setForeground(Color.WHITE);
    b2.setBackground(Color.BLACK);
    b2.setBounds(35,219,150,35);
    b2.setEnabled(false);
    cp.add(b2);
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	MP3 mp3 = new MP3("Resource/YoGiOh.mp3");
        	    mp3.setLoop(true);
        	    mp3.play();
        	    b1.setEnabled(false);
        	    b2.setEnabled(true);
        }
    });
    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	MP3 mp3 = new MP3("Resource/YoGiOh.mp3");
        	    mp3.stop();
        	    b1.setEnabled(true);
        	    b2.setEnabled(false);
        }
    });
    
    JLabel music=new JLabel("����");
    music.setBounds(50,58,75,55);
    cp.add(music);

    /**
     * �]�w�I��
     */
    JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon(image)));
    /**
     * �]�w�����j�p
     */
    jf.getContentPane().add(scrollPane);
    jf.pack();
    jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    jf.setTitle("�]�w");
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);  
}
}
