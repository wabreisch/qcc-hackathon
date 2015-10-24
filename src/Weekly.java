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

public class Weekly extends JPanel{
	private JLabel weekly,food,gas,laundry,entertainment,tabling,total;
	private TextField tff,tfg,tfl,tfe, tft,tftotal;
	private JButton nextButton, backButton;
	public static int weeklyDebt;
	
	public Weekly(){
		
		super();
		setLayout(new BorderLayout());
		
		weekly = new JLabel("Weekly Expenses", SwingConstants.CENTER);
		weekly.setPreferredSize(new Dimension(100, 100));
		this.add(weekly, BorderLayout.NORTH);
		
		JPanel fieldPanel = new JPanel();
		GridLayout fieldGrid = new GridLayout(6,2);
		fieldPanel.setLayout(fieldGrid);
		food = new JLabel("Food:", SwingConstants.CENTER);
		tff = new TextField("Enter Amount", 20);
		gas = new JLabel("Gas:", SwingConstants.CENTER);
		tfg = new TextField("Enter Amount", 20);
		laundry = new JLabel("Food:", SwingConstants.CENTER);
		tfl = new TextField("Enter Amount", 20);
		entertainment = new JLabel("Entertainment:", SwingConstants.CENTER);
		tfe = new TextField("Enter Amount", 20);
		tabling = new JLabel("Tabling Guilt:", SwingConstants.CENTER);
		tft = new TextField("Enter Amount", 20);
		total = new JLabel("Total:", SwingConstants.CENTER);
		tftotal = new TextField("Click To Calculate Total", SwingConstants.CENTER);
		tftotal.setEditable(false);

		
		fieldPanel.add(food);
		fieldPanel.add(tff);
		fieldPanel.add(gas);
		fieldPanel.add(tfg);
		fieldPanel.add(laundry);
		fieldPanel.add(tfl);
		fieldPanel.add(entertainment);
		fieldPanel.add(tfe);
		fieldPanel.add(tabling);
		fieldPanel.add(tft);
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

		
	tff.addFocusListener(new FocusListener() {
            public void focusLost(FocusEvent arg0) {
            }
            public void focusGained(FocusEvent arg0) {
            	if(tff.getText().matches("Enter Amount"))
            	tff.setText("$");
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
	 tfl.addFocusListener(new FocusListener() {
            public void focusLost(FocusEvent arg0) {
            }
            public void focusGained(FocusEvent arg0) {
            	if(tfl.getText().matches("Enter Amount"))
            	tfl.setText("$");
            }
        });
	 tfe.addFocusListener(new FocusListener() {
            public void focusLost(FocusEvent arg0) {
            }
            public void focusGained(FocusEvent arg0) {
            	if(tfe.getText().matches("Enter Amount"))
            	tfe.setText("$");
            }
        });
	 tft.addFocusListener(new FocusListener() {
         public void focusLost(FocusEvent arg0) {
         }
         public void focusGained(FocusEvent arg0) {
         	if(tft.getText().matches("Enter Amount"))
         	tft.setText("$");
         }
     });
	 tftotal.addFocusListener(new FocusListener() {
         public void focusLost(FocusEvent arg0) {
         }
         public void focusGained(FocusEvent arg0) {
         	tftotal.setText("$" + Integer.toString((Integer.parseInt(tff.getText().replaceAll( "[^\\d]", "" ))+
         			Integer.parseInt(tfg.getText().replaceAll( "[^\\d]", "" ))+
         			Integer.parseInt(tfl.getText().replaceAll( "[^\\d]", "" ))+
         			Integer.parseInt(tfe.getText().replaceAll( "[^\\d]", "" ))+
         			Integer.parseInt(tft.getText().replaceAll( "[^\\d]", "" )))));
         	
         }
     });
	 
	 nextButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Menu.setState(5);
				weeklyDebt = Integer.parseInt(tftotal.getText().replaceAll( "[^\\d]", "" ));
				//System.out.println(weeklyDebt);
			}
		});
	 backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Menu.setState(3);
			}
		});
		
		
		
		
		
	}
	public static int getWeekly(){
		return weeklyDebt;
	}

}
