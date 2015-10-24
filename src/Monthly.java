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
	private JLabel logo,car,phone,clothing,rent,utilities,gym,total;
	private TextField tfcp,tfp,tfc,tfr,tfu,tfg,tftotal;
	private JButton nextButton, backButton;
	public static int monthlyDebt;
	
	public Monthly(){
		
		super();
		setLayout(new BorderLayout());
		
		logo = new JLabel("Monthly Expenses", SwingConstants.CENTER);
		logo.setPreferredSize(new Dimension(100, 100));
		this.add(logo, BorderLayout.NORTH);
		
		JPanel fieldPanel = new JPanel();
		GridLayout fieldGrid = new GridLayout(7,2);
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
		total = new JLabel("Total:", SwingConstants.CENTER);
		tftotal = new TextField("Click To Calculate Total", SwingConstants.CENTER);
		tftotal.setEditable(false);

		
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
		 fieldPanel.add(total);
		 fieldPanel.add(tftotal);
		 
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
		 tftotal.addFocusListener(new FocusListener() {
	         public void focusLost(FocusEvent arg0) {
	         }
	         public void focusGained(FocusEvent arg0) {
	         	tftotal.setText("$" + Integer.toString((Integer.parseInt(tfcp.getText().replaceAll( "[^\\d]", "" ))+
	         			Integer.parseInt(tfp.getText().replaceAll( "[^\\d]", "" ))+
	         			Integer.parseInt(tfc.getText().replaceAll( "[^\\d]", "" ))+
	         			Integer.parseInt(tfr.getText().replaceAll( "[^\\d]", "" ))+
	         			Integer.parseInt(tfu.getText().replaceAll( "[^\\d]", "" ))+
	         			Integer.parseInt(tfg.getText().replaceAll( "[^\\d]", "" )))));
	         	
	         }
	     });
		 nextButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					Menu.setState(4);
					monthlyDebt = Integer.parseInt(tftotal.getText().replaceAll( "[^\\d]", "" ));
					//System.out.println(monthlyDebt);
				}
			});
		 backButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					Menu.setState(2);
				}
			});
		
		
		 
		
	}
	public static int getMonthly(){
		return monthlyDebt;
	}
}
