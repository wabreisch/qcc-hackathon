import java.awt.Component;


import javax.swing.JFrame;

public class HackathonApp extends JFrame {
	public HackathonApp(){
	super("Hack-A-Thon Application");
	Menu menu = new Menu();
	this.add(menu);
	this.setVisible(true);
	this.setSize(800,600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	}
	
	public static void main(String[] args){
		new HackathonApp();
	}

}
