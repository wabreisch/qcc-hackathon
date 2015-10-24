import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CareerDebt extends JPanel {
	private JButton reset;
	private TextField paragraph;
	public CareerManager theManager;
	
	CareerDebt(){
	super();
	setLayout(new BorderLayout());
	
	theManager = new CareerManager();
	int totalDebt = Semester.getSemester() + Monthly.getMonthly() + Weekly.getWeekly() + QuarterlyExpenses.getQuarter();
	paragraph = new TextField(theManager.debtToYears(InfoTotals.majorChoice, totalDebt));
	paragraph.setEditable(false);
	paragraph.setPreferredSize(new Dimension(400,400));
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