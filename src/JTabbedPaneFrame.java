
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import painter.DrawPanel;
import slider.SliderPanel;

public class JTabbedPaneFrame extends JFrame  
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// set up GUI
   public JTabbedPaneFrame()
   {
      super( "JTabbedPane Demo " );

      JTabbedPane tabbedPane = new JTabbedPane(); // create JTabbedPane 

      // set up pane11 and add it to JTabbedPane 
      DrawPanel painter = new DrawPanel();
      tabbedPane.addTab("Painter", null, painter, "First Panel");  // create first panel
     
      
      // set up panel2 and add it to JTabbedPane
      SliderPanel slider = new SliderPanel( );    
      tabbedPane.addTab( "Slider", null , slider, "Second Panel" ); 

      // set up panel3 and add it to JTabbedPane
      JLabel label3 = new JLabel( "panel three" );
      JPanel panel3 = new JPanel(); // create third panel
      panel3.setLayout( new BorderLayout() ); // use borderlayout
      panel3.add( new JButton( "North" ), BorderLayout.NORTH );
      panel3.add( new JButton( "West" ), BorderLayout.WEST );
      panel3.add( new JButton( "East" ), BorderLayout.EAST );
      panel3.add( new JButton( "South" ), BorderLayout.SOUTH );
      panel3.add( label3, BorderLayout.CENTER );
      tabbedPane.addTab( "Tab Three", null, panel3, "Third Panel" );

      add( tabbedPane ); // add JTabbedPane to frame
   } // end JTabbedPaneFrame constructor
} // end class JTabbedPaneFrame


