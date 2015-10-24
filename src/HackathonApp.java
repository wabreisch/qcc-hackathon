import java.awt.Component;


import javax.swing.JFrame;

public class HackathonApp extends JFrame {
	public HackathonApp(){
	super("Hack-A-Thon Application");
	while(true){
		
		this.setVisible(true);
		Menu menu = new Menu();
		this.add(menu);
		
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	
		while(menu.getState() == 0){
		this.setVisible(true);
		menu.setVisible(true);
		}
		
		Semester semester = new Semester();
		this.setSize(400,300);
		this.add(semester);
		this.setVisible(false);
	
		while(menu.getState() == 1){
		semester.setVisible(true);
		this.setVisible(true);
		this.remove(menu);
		}
		QuarterlyExpenses qexpenses = new QuarterlyExpenses();
		this.setSize(400, 300);
		this.add(qexpenses);
		this.setVisible(false);
		
		while(menu.getState() == 2){
		qexpenses.setVisible(true);
		this.setVisible(true);
		this.remove(semester);
		}
		
		Monthly monthly = new Monthly();
		this.setSize(400, 300);
		this.add(monthly);
		this.setVisible(false);
		
		while(menu.getState() == 3){
		monthly.setVisible(true);
		this.setVisible(true);
		this.remove(qexpenses);
		}
		
		Weekly week = new Weekly();
		this.setSize(400, 300);
		this.add(week);
		this.setVisible(false);
		
		while(menu.getState() == 4){
		week.setVisible(true);
		this.setVisible(true);
		this.remove(monthly);
		}
		
		Income income = new Income();
		this.setSize(400, 300);
		this.add(income);
		this.setVisible(false);
		
		while(menu.getState() == 5){
		income.setVisible(true);
		this.setVisible(true);
		this.remove(week);
		}
		
		InfoTotals info = new InfoTotals();
		this.setSize(400, 300);
		this.add(info);
		this.setVisible(false);
		
		while(menu.getState() == 6){
		info.setVisible(true);
		this.setVisible(true);
		this.remove(income);
		}
		
		CareerDebt career = new CareerDebt();
		this.setSize(800,1000);
		this.add(career);
		this.setVisible(false);
		
		while(menu.getState() == 7){
		career.setVisible(true);
		this.setVisible(true);
		this.remove(info);
		}
//		this.setVisible(true);
//		this.remove();
		}
		
	}
	public static void main(String[] args){
		new HackathonApp();
	}

}
