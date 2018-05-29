package 期末作業;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;


public class test
{
        String Filename;
        BufferedImage image;
        JFrame jf;
        public static void main(String argv[])
        {
                new test();
        }
        public test()
        {
                LoadFile();
                SetTable();
        }
        public void LoadFile()
        {
                Filename="西洋棋.jpg";//設定檔名
                try
                {
                        image=ImageIO.read(new File(Filename));//讀取檔案
                }
                catch(Exception e)
                {
                        javax.swing.JOptionPane.showMessageDialog(null, "載入圖檔錯誤: "+Filename);
                        image=null;//如果錯誤的話顯示錯誤訊息
                }
        }
        public void SetTable()//設定版面
        {
                jf = new JFrame("");
                JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon(image)));//把Image放進label裡

                jf.getContentPane().add(scrollPane);
                jf.pack();
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.setTitle(Filename+" "+image.getWidth()+" x "+image.getHeight());
                jf.setLocationRelativeTo(null);
                jf.setVisible(true);              
        }
}