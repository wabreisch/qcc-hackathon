import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Menu extends JPanel{
	private JLabel logo;
	private JButton startButton;
	private static int state = 0;
	public Menu(){
    
    super();
    setLayout(new BorderLayout());
    
    ImageIcon logoImage = new ImageIcon("/Users/mattfishman/Documents/workspace/HackAThon/Images/logo.png");
    
    logo = new JLabel(logoImage, SwingConstants.CENTER);
	logo.setPreferredSize(new Dimension(400, 300));
	
	
	this.add(logo, BorderLayout.NORTH);
	
	JPanel buttonPanel = new JPanel();
	
	startButton = new JButton("Get Started");
	startButton.setPreferredSize(new Dimension(200,50));
	startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttonPanel.add(startButton);
	
	this.add(buttonPanel, BorderLayout.CENTER);
	
	startButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event){
			setState(1);
		}
	});
		
  }
	public static int getState(){
		return state;
	}
	
	public static void setState(int state){
		Menu.state = state;
	}
	
}


