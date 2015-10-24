import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class InfoTotals extends JPanel{
	private JLabel info,debt,income, major,debtLabel,incomeLabel;
	private JButton backButton, nextButton;
	private String[] majors = {"Software", "Cheetos", "Yeezus"};
	public static String majorChoice;
	
	public InfoTotals(){
		super();
		setLayout(new BorderLayout());
		System.out.println(Income.getIncome());
		
		info = new JLabel("Results", SwingConstants.CENTER);
		info.setPreferredSize(new Dimension(100, 100));
		this.add(info, BorderLayout.NORTH);
		
		JPanel fieldPanel = new JPanel();
		GridLayout fieldGrid = new GridLayout(3,2);
		fieldPanel.setLayout(fieldGrid);
		
		int totalDebt = Semester.getSemester() + Monthly.getMonthly() + Weekly.getWeekly() + QuarterlyExpenses.getQuarter();
		debt = new JLabel("Total Debt:", SwingConstants.CENTER);
		debtLabel = new JLabel("$" + Integer.toString(totalDebt), SwingConstants.LEFT);

		
		income = new JLabel("Total Income:", SwingConstants.CENTER);
		int totalIncome = Income.getIncome();
		
		incomeLabel = new JLabel("$" + Integer.toString(totalIncome), SwingConstants.LEFT);
		
		major = new JLabel("Select A Major!", SwingConstants.CENTER);
		final JComboBox majorList = new JComboBox(majors);
		
		fieldPanel.add(debt);
		fieldPanel.add(debtLabel);
		fieldPanel.add(income);
		fieldPanel.add(incomeLabel);
		fieldPanel.add(major);
		fieldPanel.add(majorList);

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
		
		
		
		
		nextButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Menu.setState(7);
				majorChoice = new String((String) majorList.getSelectedItem()).toLowerCase();
				System.out.println(majorChoice);
			}
		});
		
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Menu.setState(5);
			}
		});
		
		
		
	}
	

}
