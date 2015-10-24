import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Monthly extends JPanel {
	private JLabel logo,car,phone,clothing,rent,utilities,gym;
	private TextField tfcp,tfp,tfc,tfr,tfu,tfg;
	private JButton nextButton, backButton;
	
	public Monthly(){
		
		super();
		setLayout(new BorderLayout());
		
		logo = new JLabel("Monthly Expenses", SwingConstants.CENTER);
		logo.setPreferredSize(new Dimension(100, 100));
		this.add(logo, BorderLayout.NORTH);
		
		JPanel fieldPanel = new JPanel();
		GridLayout fieldGrid = new GridLayout(6,2);
		fieldPanel.setLayout(fieldGrid);
		car = new JLabel("Car Payments:", SwingConstants.CENTER);
		tfcp = new TextField("Enter Amount", 20);
		phone = new JLabel("Phone:", SwingConstants.CENTER);
		tfp = new TextField("Enter Amount", 20);
		clothing = new JLabel("Clothing:", SwingConstants.CENTER);
		tfc = new TextField("Enter Amount", 20);
		rent = new JLabel("Rent:", SwingConstants.CENTER);
		tfr = new TextField("Enter Amount", 20);
		utilities = new JLabel("Utilities:", SwingConstants.CENTER);
		tfu = new TextField("Enter Amount", 20);
		gym = new JLabel("Gym Membership:", SwingConstants.CENTER);
		tfg = new TextField("Enter Amount", 20);
		
		 fieldPanel.add(car);
		 fieldPanel.add(tfcp);
		 fieldPanel.add(phone);
		 fieldPanel.add(tfp);
		 fieldPanel.add(clothing);
		 fieldPanel.add(tfc);
		 fieldPanel.add(rent);
		 fieldPanel.add(tfr);
		 fieldPanel.add(utilities);
		 fieldPanel.add(tfu);
		 fieldPanel.add(gym);
		 fieldPanel.add(tfg);
		 
		JPanel buttonPanel = new JPanel();
		GridLayout buttonGrid = new GridLayout(1,2);
		buttonPanel.setLayout(buttonGrid);
		nextButton = new JButton("Continue");
		nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		backButton = new JButton("Back");
		backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		buttonPanel.add(backButton);
		buttonPanel.add(nextButton);
		this.add(buttonPanel, BorderLayout.SOUTH);
		
		 this.add(fieldPanel, BorderLayout.CENTER);
		 
		 
		 tfcp.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfcp.getText().matches("Enter Amount"))
	            	tfcp.setText("$");
	            }
	        });
		 tfp.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfp.getText().matches("Enter Amount"))
	            	tfp.setText("$");
	            }
	        });
		 tfc.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfc.getText().matches("Enter Amount"))
	            	tfc.setText("$");
	            }
	        });
		 tfr.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfr.getText().matches("Enter Amount"))
	            	tfr.setText("$");
	            }
	        });
		 tfu.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfu.getText().matches("Enter Amount"))
	            	tfu.setText("$");
	            }
	        });
		 tfg.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfg.getText().matches("Enter Amount"))
	            	tfg.setText("$");
	            }
	        });
		 
		 nextButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					Menu.setState(4);
				}
			});
		 nextButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					Menu.setState(2);
				}
			});
		
		
		 
		
	}
}
