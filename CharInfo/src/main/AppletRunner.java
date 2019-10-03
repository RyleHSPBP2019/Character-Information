package main;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import races.Races;
import races.racePossible;
import races.subPossible;

public class AppletRunner extends Applet implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//General Initialization
	Frame homeFrame = new Frame("Homepage");
	Frame raceFrame = new Frame("Races");
	Frame classFrame = new Frame("Classes");
	Frame backgroundFrame = new Frame("Backgrounds");
	Button raceButton = new Button("Races");
	Button classButton = new Button("Classes");
	Button backgroundButton = new Button("Backgrounds");
	//Race Buttons
	Button dragonbornB = new Button("Dragonborn");
	Button dwarfB = new Button("Dwarf");
	Button elfB = new Button("Elf");
	Button gnomeB = new Button("Gnome");
	Button halfElfB = new Button("Half-Elf");
	Button halflingB = new Button("Halfling");
	Button halfOrcB = new Button("Half-Orc");
	Button humanB = new Button("Human");
	Button tieflingB = new Button("Tiefling");
	//Race Stuff
	Races race = new Races();
	//Dragon Color Buttons
	Button blackD = new Button("Black Dragonborn");
 	Button blueD = new Button("Blue Dragonborn");
 	Button brassD = new Button("Brass Dragonborn");
 	Button bronzeD = new Button("Bronze Dragonborn");
 	Button copperD = new Button("Copper Dragonborn");
 	Button goldD = new Button("Gold Dragonborn");
 	Button greenD = new Button("Green Dragonborn");
 	Button redD = new Button("Red Dragonborn");
 	Button silverD = new Button("Silver Dragonborn");
 	Button whiteD = new Button("White Dragonborn");
 	//Dwarf Buttons
 	Button mountD = new Button("Mountain Dwarf");
 	Button hillD = new Button("Hill Dwarf");
 	//Elf Buttons
 	Button highE = new Button("High Elf");
 	Button woodE = new Button("Wood Elf");
 	// Gnome Buttons
 	Button deepG = new Button("Deep Gnome");
 	Button rockG = new Button("Rock Gnome");
 	//Halfling Buttons
 	Button stoutH = new Button("Stout Halfling");
 	Button lightH  = new Button("Lightfoot Halfling");
 	
 	//Classes Buttons
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
		
		raceFrame.add(dragonbornB);
		dragonbornB.addActionListener(this);
		raceFrame.add(dwarfB);
		dwarfB.addActionListener(this);
		raceFrame.add(elfB);
		elfB.addActionListener(this);
		raceFrame.add(gnomeB);
		gnomeB.addActionListener(this);
		raceFrame.add(halfElfB);
		halfElfB.addActionListener(this);
		raceFrame.add(halflingB);
		halflingB.addActionListener(this);
		raceFrame.add(halfOrcB);
		halfOrcB.addActionListener(this);
		raceFrame.add(humanB);
		humanB.addActionListener(this);
		raceFrame.add(tieflingB);
		tieflingB.addActionListener(this);
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
	     //Dragonborn Selection
	     else if (evt.getSource()==dragonbornB)
         {
    	 	Frame dragonFrame = new Frame("Dragonborn Colors");
    	 	raceFrame.setVisible(false);
    	 	setFrame(dragonFrame, 2, 5, true);
    	 	
    	 	dragonFrame.add(blackD);
    	 	blackD.addActionListener(this);
    	 	dragonFrame.add(blueD);
    	 	blueD.addActionListener(this);
    	 	dragonFrame.add(brassD);
    	 	brassD.addActionListener(this);
    	 	dragonFrame.add(bronzeD);
    	 	bronzeD.addActionListener(this);
    	 	dragonFrame.add(copperD);
    	 	copperD.addActionListener(this);
    	 	dragonFrame.add(goldD);
    	 	goldD.addActionListener(this);
    	 	dragonFrame.add(greenD);
    	 	greenD.addActionListener(this);
    	 	dragonFrame.add(redD);
    	 	redD.addActionListener(this);
    	 	dragonFrame.add(silverD);
    	 	silverD.addActionListener(this);
    	 	dragonFrame.add(whiteD);
    	 	whiteD.addActionListener(this);
    	 	if (evt.getSource()==blackD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.black);
    	 		dragonFrame.setVisible(false);
            }
    	 	else if (evt.getSource()==blueD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.blue);
    	 		dragonFrame.setVisible(false);
            }
    	 	else if (evt.getSource()==brassD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.brass);
    	 		dragonFrame.setVisible(false);
            }
    	 	else if (evt.getSource()==bronzeD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.bronze);
    	 		dragonFrame.setVisible(false);
            }
    	 	else if (evt.getSource()==copperD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.copper);
    	 		dragonFrame.setVisible(false);
            }
    	 	else if (evt.getSource()==goldD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.gold);
    	 		dragonFrame.setVisible(false);
            }
    	 	else if (evt.getSource()==greenD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.green);
    	 		dragonFrame.setVisible(false);
            }
    	 	else if (evt.getSource()==redD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.red);
    	 		dragonFrame.setVisible(false);
            }
    	 	else if (evt.getSource()==silverD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.silver);
    	 		dragonFrame.setVisible(false);
            }
    	 	else if (evt.getSource()==whiteD)
            {
    	 		race.setRaces(racePossible.dragonborn, subPossible.white);
    	 		dragonFrame.setVisible(false);
            }
         }
	     //Dwarf Selection
	     else if (evt.getSource()==dwarfB)
         {
    	 	Frame dwarfFrame = new Frame("Dwarf Subrace");
    	 	raceFrame.setVisible(false);
    	 	setFrame(dwarfFrame, 1, 2, true);
    	 	
    	 	dwarfFrame.add(mountD);
    	 	mountD.addActionListener(this);
    	 	dwarfFrame.add(hillD);
    	 	hillD.addActionListener(this);
    	 	if (evt.getSource() == mountD)
    	 	{
    	 		dwarfFrame.setVisible(false);
    	 		race.setRaces(racePossible.dwarf, subPossible.mountain);
    	 	}
    	 	else if (evt.getSource() == hillD)
    	 	{
    	 		dwarfFrame.setVisible(false);
    	 		race.setRaces(racePossible.dwarf, subPossible.hill);
    	 	}
         }
	     //Elf Selection
	     else if (evt.getSource()==elfB)
         {
    	 	Frame elfFrame = new Frame("Elf Subrace");
    	 	raceFrame.setVisible(false);
    	 	setFrame(elfFrame, 1, 2, true);
    	 	
    	 	elfFrame.add(woodE);
    	 	highE.addActionListener(this);
    	 	elfFrame.add(highE);
    	 	woodE.addActionListener(this);
    	 	if (evt.getSource() == highE)
    	 	{
    	 		race.setRaces(racePossible.elf, subPossible.high);
    	 		elfFrame.setVisible(false);
    	 	}
    	 	else if (evt.getSource() == woodE)
    	 	{
    	 		race.setRaces(racePossible.elf, subPossible.wood);
    	 		elfFrame.setVisible(false);
    	 	}
         }
	     //Gnome Selection
	     else if (evt.getSource()==gnomeB)
         {
    	 	Frame gnomeFrame = new Frame("Gnome Subrace");
    	 	raceFrame.setVisible(false);
    	 	setFrame(gnomeFrame, 1, 2, true);
    	 	
    	 	gnomeFrame.add(deepG);
    	 	deepG.addActionListener(this);
    	 	gnomeFrame.add(rockG);
    	 	rockG.addActionListener(this);
    	 	if (evt.getSource() == deepG)
    	 	{
    	 		race.setRaces(racePossible.gnome, subPossible.deep);
    	 		gnomeFrame.setVisible(false);
    	 	}
    	 	else if (evt.getSource() == rockG)
    	 	{
    	 		race.setRaces(racePossible.gnome, subPossible.rock);
    	 		gnomeFrame.setVisible(false);
    	 	}
         }
	     //Half-Elf Selection
	     else if (evt.getSource() == halfElfB)
	     {
	    	 race.setRaces(racePossible.halfElf, null);
	     }
	     //Halfling Selection
	     else if (evt.getSource()==gnomeB)
         {
    	 	Frame halflingFrame = new Frame("Halflinf Subrace");
    	 	raceFrame.setVisible(false);
    	 	setFrame(halflingFrame, 1, 2, true);
    	 	
    	 	halflingFrame.add(stoutH);
    	 	stoutH.addActionListener(this);
    	 	halflingFrame.add(lightH);
    	 	lightH.addActionListener(this);
    	 	if (evt.getSource() == lightH)
    	 	{
    	 		race.setRaces(racePossible.halfling, subPossible.light);
    	 		halflingFrame.setVisible(false);
    	 	}
    	 	else if (evt.getSource() == stoutH)
    	 	{
    	 		race.setRaces(racePossible.halfling, subPossible.stout);
    	 		halflingFrame.setVisible(false);
    	 	}
         }
	     //Half-Orc Selection
	     else if(evt.getSource() == halfOrcB)
	     {
	    	 race.setRaces(racePossible.halfOrc, null);
	     }
	     //Human Selection
	     else if(evt.getSource() == humanB)
	     {
	    	 race.setRaces(racePossible.human,  null);
	     }
	     //Tiefling Selection
	     else if(evt.getSource() == tieflingB)
	     {
	    	 race.setRaces(racePossible.tiefling,  null);
	     }
	     //Back to Home
	     else if(race != null)
	     {
	    	 raceFrame.setVisible(false);
	    	 homeFrame.remove(raceButton);
	    	 setFrame(homeFrame, 1, 2, true);
	     }
	}
	
}
