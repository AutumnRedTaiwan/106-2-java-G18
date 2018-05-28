package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private DrawPanel drawPanel;
	
	private JPanel playPanel;
	private JButton stop;
	private JButton exit;
	private JButton score;
	

	public DrawFrame(){
		super();
		drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);
		
		playPanel = new JPanel();
		stop = new JButton("STOP");
		stop.addActionListener(this);
		playPanel.add(stop);
		
		exit = new JButton("EXIT");
		exit.addActionListener(this);
		playPanel.add(exit);
		
		score = new JButton("SCORE");
		score.addActionListener(this);
		playPanel.add(score);
		
		add(playPanel, BorderLayout.NORTH);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==stop) {
			
		}else if(e.getSource()==exit) {
			
		}else if(e.getSource()==score) {
			
		}
	}
	
}
