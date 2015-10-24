import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Semester extends JPanel{
	private JLabel logo, tuition,housing,books,supplies,dorm;
	private TextField tft,tfh,tfb,tfs,tfd;
	private JButton nextButton;
	
	public Semester(){
		super();
		setLayout(new BorderLayout());
		
		 logo = new JLabel("Semester Expenses", SwingConstants.CENTER);
		 logo.setPreferredSize(new Dimension(100, 100));
		 this.add(logo, BorderLayout.NORTH);
		
		 JPanel fieldPanel = new JPanel();
		 GridLayout fieldGrid = new GridLayout(5,2);
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
		 
		nextButton = new JButton("Continue");
		nextButton.setPreferredSize(new Dimension(100,50));
		nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		 
		 this.add(fieldPanel, BorderLayout.CENTER);
		 this.add(nextButton, BorderLayout.SOUTH);
		 
		 tft.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	tft.setText("$");
	            }
	        });
		 tfh.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	tfh.setText("$");
	            }
	        });
		 tfb.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	tfb.setText("$");
	            }
	        });
		 tfs.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	tfs.setText("$");
	            }
	        });
		 tfd.addFocusListener(new FocusListener() {
	            public void focusLost(FocusEvent arg0) {
	            }
	            public void focusGained(FocusEvent arg0) {
	            	tfd.setText("$");
	            }
	        });
		 
		 
		
	}

}
