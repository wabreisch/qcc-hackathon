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

public class Income extends JPanel{
	private JLabel income,job, allowance;
	private TextField tfj,tfa;
	private JButton nextButton, backButton;
	
	public Income(){
		super();
		setLayout(new BorderLayout());
		
		income = new JLabel("Income", SwingConstants.CENTER);
		income.setPreferredSize(new Dimension(100, 100));
		this.add(income, BorderLayout.NORTH);
		
		JPanel fieldPanel = new JPanel();
		GridLayout fieldGrid = new GridLayout(2,2);
		fieldPanel.setLayout(fieldGrid);
		
		job = new JLabel("Job:", SwingConstants.CENTER);
		tfj = new TextField("Enter Amount", 20);
		allowance = new JLabel("Allowance:", SwingConstants.CENTER);
		tfa = new TextField("Enter Amount", 20);
		
		fieldPanel.add(job);
		fieldPanel.add(tfj);
		fieldPanel.add(allowance);
		fieldPanel.add(tfa);
		
		JPanel buttonPanel = new JPanel();
		GridLayout buttonGrid = new GridLayout(1,2);
		buttonPanel.setLayout(buttonGrid);
		nextButton = new JButton("Finish");
		nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		backButton = new JButton("Back");
		backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		buttonPanel.add(backButton);
		buttonPanel.add(nextButton);
		this.add(buttonPanel, BorderLayout.SOUTH);
		
		this.add(fieldPanel, BorderLayout.CENTER);
		
		tfj.addFocusListener(new FocusListener() {
            public void focusLost(FocusEvent arg0) {
            }
            public void focusGained(FocusEvent arg0) {
            	if(tfj.getText().matches("Enter Amount"))
            	tfj.setText("$");
            }
        });
		tfa.addFocusListener(new FocusListener() {
            public void focusLost(FocusEvent arg0) {
            }
            public void focusGained(FocusEvent arg0) {
            	if(tfa.getText().matches("Enter Amount"))
            	tfa.setText("$");
            }
        });
		
		nextButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Menu.setState(6);
			}
		});
		
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Menu.setState(4);
			}
		});
	}
}
