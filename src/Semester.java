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

public class Semester extends JPanel{
	private JLabel logo, tuition,housing,books,supplies,dorm, total;
	private TextField tft,tfh,tfb,tfs,tfd,tftotal;
	private JButton nextButton, backButton;
	public static int semesterDebt;
	
	public Semester(){
		super();
		setLayout(new BorderLayout());
		
		 logo = new JLabel("Semester Expenses", SwingConstants.CENTER);
		 logo.setPreferredSize(new Dimension(100, 100));
		 this.add(logo, BorderLayout.NORTH);
		
		 JPanel fieldPanel = new JPanel();
		 GridLayout fieldGrid = new GridLayout(6,2);
		 fieldPanel.setLayout(fieldGrid);
		 tuition = new JLabel("Tution:", SwingConstants.CENTER);
		 tft = new TextField("Enter Amount", 20);
		 housing = new JLabel("Housing:", SwingConstants.CENTER);
		 tfh = new TextField("Enter Amount", 20);
		 books = new JLabel("Books:", SwingConstants.CENTER);
		 tfb = new TextField("Enter Amount", SwingConstants.CENTER);
		 supplies = new JLabel("School Supplies:", SwingConstants.CENTER);
		 tfs = new TextField("Enter Amount", SwingConstants.CENTER);
		 dorm = new JLabel("Dorm Furnishing:", SwingConstants.CENTER);
		 tfd = new TextField("Enter Amount", SwingConstants.CENTER);
		 total = new JLabel("Total:", SwingConstants.CENTER);
		 tftotal = new TextField("Click To Calculate Total", SwingConstants.CENTER);
		 tftotal.setEditable(false);

		 
		 fieldPanel.add(tuition);
		 fieldPanel.add(tft);
		 fieldPanel.add(housing);
		 fieldPanel.add(tfh);
		 fieldPanel.add(books);
		 fieldPanel.add(tfb);
		 fieldPanel.add(supplies);
		 fieldPanel.add(tfs);
		 fieldPanel.add(dorm);
		 fieldPanel.add(tfd);
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
		 
		 
		 tft.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tft.getText().matches("Enter Amount"))
	            	tft.setText("$");
	            }
	        });
		 tfh.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfh.getText().matches("Enter Amount"))
	            	tfh.setText("$");
	            }
	        });
		 tfb.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfb.getText().matches("Enter Amount"))
	            	tfb.setText("$");
	            }
	        });
		 tfs.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfs.getText().matches("Enter Amount"))
	            	tfs.setText("$");
	            }
	        });
		 tfd.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	if(tfd.getText().matches("Enter Amount"))
	            	tfd.setText("$");
	            }
	        });
		 tftotal.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	tftotal.setText("$" + Integer.toString((Integer.parseInt(tft.getText().replaceAll( "[^\\d]", "" ))+
	            			Integer.parseInt(tfh.getText().replaceAll( "[^\\d]", "" ))+
	            			Integer.parseInt(tfb.getText().replaceAll( "[^\\d]", "" ))+
	            			Integer.parseInt(tfs.getText().replaceAll( "[^\\d]", "" ))+
	            			Integer.parseInt(tfd.getText().replaceAll( "[^\\d]", "" )))));
	            	
	            }
	        });
		 nextButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					Menu.setState(2);
					semesterDebt = Integer.parseInt(tftotal.getText().replaceAll( "[^\\d]", "" ));
					//System.out.println(semesterDebt);
				}
			});
		 backButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					Menu.setState(0);
				}
			});
				
		 
		 
		
	}
	public static int getSemester(){
		return semesterDebt;
	}
}
