package main;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import races.Races;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;

public class AppletRunner extends Applet implements ActionListener{
	//General Initialization
	Frame homeFrame = new Frame("Homepage");
	Frame raceFrame = new Frame("Races");
	Frame classFrame = new Frame("Classes");
	Frame backgroundFrame = new Frame("Backgrounds");
	Button raceButton = new Button("Races");
	Button classButton = new Button("Classes");
	Button backgroundButton = new Button("Backgrounds");
	//Race Buttons
	Button dragonborn = new Button("Dragonborn");
	Button dwarf = new Button("Dwarf");
	Button elf = new Button("Elf");
	Button gnome = new Button("Gnome");
	Button halfElf = new Button("Half-Elf");
	Button halfling = new Button("Halfling");
	Button halfOrc = new Button("Half-Orc");
	Button human = new Button("Human");
	Button tiefling = new Button("Tiefling");
	//Race Stuff
	Races race = new Races();
	//Dragon Color Buttons
	Button black = new Button("Black Dragonborn");
 	Button blue = new Button("Blue Dragonborn");
 	Button brass = new Button("Brass Dragonborn");
 	Button bronze = new Button("Bronze Dragonborn");
 	Button copper = new Button("Copper Dragonborn");
 	Button gold = new Button("Gold Dragonborn");
 	Button green = new Button("Green Dragonborn");
 	Button red = new Button("Red Dragonborn");
 	Button silver = new Button("Silver Dragonborn");
 	Button white = new Button("White Dragonborn");
	public AppletRunner() {
		setFrame(homeFrame, 1, 3, true);
		setFrame(raceFrame, 3, 3, false);
		setFrame(classFrame, 1, 1, false);
		setFrame(backgroundFrame, 1, 1, false);
		homeFrame.add(raceButton);
		raceButton.addActionListener(this);
		homeFrame.add(classButton);
		classButton.addActionListener(this);
		homeFrame.add(backgroundButton);
		backgroundButton.addActionListener(this);
		
		raceFrame.add(dragonborn);
		dragonborn.addActionListener(this);
		raceFrame.add(dwarf);
		dwarf.addActionListener(this);
		raceFrame.add(elf);
		elf.addActionListener(this);
		raceFrame.add(gnome);
		gnome.addActionListener(this);
		raceFrame.add(halfElf);
		halfElf.addActionListener(this);
		raceFrame.add(halfling);
		halfling.addActionListener(this);
		raceFrame.add(halfOrc);
		halfOrc.addActionListener(this);
		raceFrame.add(human);
		human.addActionListener(this);
		raceFrame.add(tiefling);
		tiefling.addActionListener(this);
		 }
	public void setFrame(Frame f, int x, int y, boolean onOff) {
		f.setLayout(new GridLayout(x, y));
		f.setSize(1000, 1000);
		f.setVisible(onOff);
	}
	public void actionPerformed(ActionEvent evt)
	{
	     if (evt.getSource()==raceButton)
	         {
	            homeFrame.setVisible(false);
	            raceFrame.setVisible(true);
	         }
	     else if (evt.getSource()==classButton)
	         {
	    	 	homeFrame.setVisible(false);
	    	 	classFrame.setVisible(true);
	         }
	     else if (evt.getSource()==backgroundButton)
	         {
	    	 	homeFrame.setVisible(false);
	    	 	backgroundFrame.setVisible(true);
	         }
	     else if (evt.getSource()==dragonborn)
         {
    	 	Frame dragonFrame = new Frame("Dragonborn Colors");
    	 	raceFrame.setVisible(false);
    	 	setFrame(dragonFrame, 2, 5, true);
    	 	
    	 	dragonFrame.add(black);
    	 	black.addActionListener(this);
    	 	dragonFrame.add(blue);
    	 	blue.addActionListener(this);
    	 	dragonFrame.add(brass);
    	 	brass.addActionListener(this);
    	 	dragonFrame.add(bronze);
    	 	bronze.addActionListener(this);
    	 	dragonFrame.add(copper);
    	 	copper.addActionListener(this);
    	 	dragonFrame.add(gold);
    	 	gold.addActionListener(this);
    	 	dragonFrame.add(green);
    	 	green.addActionListener(this);
    	 	dragonFrame.add(red);
    	 	red.addActionListener(this);
    	 	dragonFrame.add(silver);
    	 	silver.addActionListener(this);
    	 	dragonFrame.add(white);
    	 	white.addActionListener(this);
         }
	     else if (evt.getSource()==black)
         {
    	 	race.setRaces()
         }
	}
	
}
