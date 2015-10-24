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

public class CareerDebt extends JPanel {
	private JLabel paragraph;
	private JButton reset;
	public CareerManager theManager;
	
	CareerDebt(){
	super();
	setLayout(new BorderLayout());
	
	theManager = new CareerManager();
	int totalDebt = Semester.getSemester() + Monthly.getMonthly() + Weekly.getWeekly() + QuarterlyExpenses.getQuarter();
	paragraph = new JLabel(theManager.debtToYears(InfoTotals.majorChoice, totalDebt));
	reset = new JButton("Reset");
	this.add(paragraph, BorderLayout.CENTER);
	this.add(reset, BorderLayout.SOUTH);
	
	reset.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event){
			Menu.setState(0);
		}
	});

	}// 
}