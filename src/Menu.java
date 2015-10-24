import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    logo = new JLabel("WishBay", SwingConstants.CENTER);
	logo.setPreferredSize(new Dimension(100, 100));
	this.add(logo, BorderLayout.NORTH);
	
	JPanel buttonPanel = new JPanel();
	
	startButton = new JButton("Get Started");
	startButton.setPreferredSize(new Dimension(400,250));
	startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttonPanel.add(startButton);
	
	this.add(buttonPanel, BorderLayout.CENTER);
	
	startButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event){
			setState(1);
			System.out.println(state);
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
