package main;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;

public class AppletRunner extends Applet implements ActionListener{
	Frame homeFrame = new Frame("Homepage");
	Frame raceFrame = new Frame("Races");
	Frame classFrame = new Frame("Classes");
	Frame backgroundFrame = new Frame("Backgrounds");
	Button raceButton = new Button("Races");
	Button classButton = new Button("Classes");
	Button backgroundButton = new Button("Backgrounds");
	public AppletRunner() {
		/*Frame f=new Frame("Button Example");  
		Button b=new Button("Races");  
		b.setBounds(50,100,80,30);  
		f.add(b);  
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true);
		Frame racePage = new Frame("Races");
		racePage.setSize(400,400);
		f.setLayout(null);
		racePage.setVisible(true);*/
		turnOnFrame(homeFrame);
		turnOnFrame(raceFrame);
		turnOnFrame(classFrame);
		turnOnFrame(backgroundFrame);
		
		
		 }
	public void actionPerformed(ActionEvent arg0) {
		homeFrame.setVisible(false);
		races.setVisible(true);
	}
	public void turnOnFrame(Frame f) {
		f.setLayout(null);
		f.setSize(1000, 1000);
		f.setVisible(true);
	}
}