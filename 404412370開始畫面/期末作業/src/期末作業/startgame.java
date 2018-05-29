package 期末作業;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
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
	public void screen(){
	Filename="startgame.png";
	winlost wl = new winlost();
    try
    {
            image=ImageIO.read(new File(Filename));
    }
    catch(Exception e)
    {
            javax.swing.JOptionPane.showMessageDialog(null, "載入圖檔錯誤: "+Filename);
            image=null;
    }
    /**
     * 建立視窗
     */
    jf = new JFrame("");
    JButton b1 = new JButton("開始");
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
    JButton b2 = new JButton("紀錄");
    b2.setForeground(Color.BLACK);
    b2.setBackground(Color.WHITE);
    b2.setBounds(365, 285, 60, 85);
    jf.add(b2);
    JButton b3 = new JButton("結束");
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
     * 設定背景
     */
    JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon(image)));
    /**
     * 設定視窗大小
     */
    
    jf.getContentPane().add(scrollPane);
    jf.pack();
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setTitle(Filename+" "+image.getWidth()+" x "+image.getHeight());
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);  
    
}

}