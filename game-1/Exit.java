package game;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exit extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DrawPanel drawPanel;
	
	private JPanel ExitPanel;
	
	private JButton Yes;
	private JButton No;

	
	public Exit() {
		super();
		drawPanel = new DrawPanel();
	    add(drawPanel, BorderLayout.CENTER);
	    
	    ExitPanel = new JPanel();
	    Yes = new JButton("YES");
	    Yes.addActionListener(this);
	    ExitPanel.add(Yes);
	    
	    No = new JButton("NO");
        No.addActionListener(this);
        ExitPanel.add(No);
        add(ExitPanel, BorderLayout.CENTER);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Yes) {
			
		}else if(e.getSource()==No) {
			
		}
	}
    
}
