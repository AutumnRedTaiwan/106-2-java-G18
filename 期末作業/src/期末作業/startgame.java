package �����@�~;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class startgame {
		static	String Filename;
		static	BufferedImage image;
		static	JFrame jf;
		static	int musicon = 0;
	public void screen(){
	Filename="startgame.png";
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
    JButton b1 = new JButton("�}�l");
    b1.setForeground(Color.BLACK);
    b1.setBackground(Color.WHITE);
    b1.setBounds(275, 285, 60, 85);
    jf.add(b1);
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	gamescreen gs = new gamescreen();
        	gs.screen();
        }
    });
    JButton b2 = new JButton("�]�w");
    b2.setForeground(Color.BLACK);
    b2.setBackground(Color.WHITE);
    b2.setBounds(365, 285, 60, 85);
    jf.add(b2);
    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	setscreen ss = new setscreen();
        	ss.screen();
        }
    });
    JButton b3 = new JButton("����");
    b3.setForeground(Color.BLACK);
    b3.setBackground(Color.WHITE);
    b3.setBounds(455, 285, 60, 85);
    jf.add(b3);
    b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	System.exit(0);
        }
    });
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
    jf.setTitle("�d�P�C��");
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);  
    
}

}