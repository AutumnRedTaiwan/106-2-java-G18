import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args){
		
		int start = 0;
		
		JFrame jf = new JFrame();
		
		Container cp=jf.getContentPane();
		cp.setLayout(null);
		
		JButton b1 = new JButton("�}�l");
	    b1.setForeground(Color.BLACK);
	    b1.setBackground(Color.WHITE);
	    b1.setBounds(95, 75, 100, 100);
	    cp.add(b1);
	    
	    
	    
	    b1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	KeyEventDemo frame = new KeyEventDemo(start);
	        	frame.setTitle( "�l�v�C��");
	            frame.setSize(300,300);
	            frame.setLocationRelativeTo( null);
	            frame.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
	            frame.setVisible( true);
	        }
	    });
	    
	    jf.setTitle( "�}�l�e��");
        jf.setSize(300,300);
        jf.setLocationRelativeTo( null);
        jf.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        jf.setVisible( true);
		
        
        
 }
}
