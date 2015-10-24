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

public class QuarterlyExpenses extends JPanel {
	private JLabel quarterly, medical,travel,greek,bday,total;
	private TextField tfm,tft,tfg,tff,tftotal;
	private JButton nextButton, backButton;
	public static int quarterDebt;
	
	public QuarterlyExpenses(){
		
		super();
		setLayout(new BorderLayout());
		
		quarterly = new JLabel("Quarterly Expenses", SwingConstants.CENTER);
		quarterly.setPreferredSize(new Dimension(100, 100));
		this.add(quarterly, BorderLayout.NORTH);
		
		JPanel fieldPanel = new JPanel();
		GridLayout fieldGrid = new GridLayout(5,2);
		fieldPanel.setLayout(fieldGrid);
		medical = new JLabel("Medical/Dental:", SwingConstants.CENTER);
		tfm = new TextField("Enter Amount", 20);
		travel = new JLabel("Travel:", SwingConstants.CENTER);
		tft = new TextField("Enter Amount", 20);
		greek = new JLabel("Greek Dues:", SwingConstants.CENTER);
		tfg = new TextField("Enter Amount", 20);
		bday = new JLabel("Friends Birthday Presents:", SwingConstants.CENTER);
		tff = new TextField("Enter Amount", 20);
		total = new JLabel("Total:", SwingConstants.CENTER);
		tftotal = new TextField("Click To Calculate Total", SwingConstants.CENTER);
		tftotal.setEditable(false);

		
		fieldPanel.add(medical);
		fieldPanel.add(tfm);
		fieldPanel.add(travel);
		fieldPanel.add(tft);
		fieldPanel.add(greek);
		fieldPanel.add(tfg);
		fieldPanel.add(bday);
		fieldPanel.add(tff);
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
		
		 tfm.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfm.getText().matches("Enter Amount"))
	            	tfm.setText("$");
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
		 tfg.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfg.getText().matches("Enter Amount"))
	            	tfg.setText("$");
	            }
	        });
		 tff.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tff.getText().matches("Enter Amount"))
	            	tff.setText("$");
	            }
	        });
		 tftotal.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	tftotal.setText("$" + Integer.toString((Integer.parseInt(tfm.getText().replaceAll( "[^\\d]", "" ))+
	            			Integer.parseInt(tft.getText().replaceAll( "[^\\d]", "" ))+
	            			Integer.parseInt(tfg.getText().replaceAll( "[^\\d]", "" ))+
	            			Integer.parseInt(tff.getText().replaceAll( "[^\\d]", "" )))));
	            	
	            }
	        });
		 
		 nextButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					Menu.setState(3);
					quarterDebt = Integer.parseInt(tftotal.getText().replaceAll( "[^\\d]", "" ));
					//System.out.println(quarterDebt);
				}
			});
		 backButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					Menu.setState(1);
				}
			});
	}
	
}
