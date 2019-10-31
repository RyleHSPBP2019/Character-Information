package main;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import races.Races;
import races.racePossible;
import races.subPossible;

import classesPack.*;
import backgroundPack.*;
import outputPackage.*;

public class AppletRunner extends Applet implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//General Initialization
	Frame userFrame = new Frame("Character Info");
	Frame homeFrame = new Frame("Homepage");
	Frame raceFrame = new Frame("Races");
	Frame classFrame = new Frame("Classes");
	Frame levelFrame = new Frame("Level");
	TextField text = new TextField("Enter a level please");
	Button submit = new Button("Submit");
	Button done = new Button("Done");
	Button raceButton = new Button("Races");
	Button classButton = new Button("Classes");
	lineVars l = new lineVars();
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
	//User Stuff
	Races race = new Races();
	Races testRace = new Races();
	dndClasses userClass = new dndClasses();
	dndClasses testClass = new dndClasses();
	
	String level = new String("1");
	int numLevel = 1;
	//Dragon Stuff
 	Frame dragonFrame = new Frame("Dragonborn Colors");
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
 	//Dwarf Stuff
 	Frame dwarfFrame = new Frame("Dwarf Subrace");
 	Button mountD = new Button("Mountain Dwarf");
 	Button hillD = new Button("Hill Dwarf");
 	//Elf Stuff
 	Frame elfFrame = new Frame("Elf Subrace");
 	Button highE = new Button("High Elf");
 	Button woodE = new Button("Wood Elf");
 	// Gnome Stuff
 	Frame gnomeFrame = new Frame("Gnome Subrace");
 	Button deepG = new Button("Deep Gnome");
 	Button rockG = new Button("Rock Gnome");
 	//Halfling Stuff
 	Frame halflingFrame = new Frame("Halflinf Subrace");
 	Button stoutH = new Button("Stout Halfling");
 	Button lightH  = new Button("Lightfoot Halfling");
 	
 	//Classes Buttons
 	Button barbarianB = new Button("Barbarian");
 	Button bardB = new Button("Bard");
 	Button clericB = new Button("Cleric");
 	Button druidB = new Button("Druid");
 	Button fighterB = new Button("Fighter");
 	Button monkB = new Button("Monk");
 	Button paladinB = new Button("Paladin");
 	Button rangerB = new Button("Ranger");
 	Button rogueB = new Button("Rogue");
 	Button sorcererB = new Button("Sorcerer");
 	Button warlockB = new Button("Warlock");
 	Button wizardB = new Button("Wizard");
 	//Barbarian
 	Frame barbFrame = new Frame("Barbrian");
 	Button berserker = new Button("Berserker Barbarian");
 	Button totem = new Button("Totem Warrior Barbarian");
 	//Bard
 	Frame bardFrame = new Frame("Bard");
 	Button lore = new Button("College of Lore");
 	Button valor = new Button("College of Valor");
 	//Cleric
 	Frame clericFrame = new Frame("Cleric");
 	Button death = new Button("Death Domain");
 	Button forge = new Button("Forge Domain");
 	Button knowledge = new Button("Knowledge Domain");
 	Button life = new Button("Life Domain");
 	Button light = new Button("Light Domain");
 	Button nature = new Button("Nature Domain");
 	Button tempest = new Button("Tempest Domain");
 	Button trickery = new Button("Trickery Domain");
 	Button war = new Button("War Domain");
 	//Druid
 	Frame druidFrame = new Frame("Druid");
 	Button land = new Button("Circle of Land");
 	Button moon = new Button("Circle of Moon");
 	//Fighter
 	Frame fighterFrame = new Frame("Fighter");
 	Button champion = new Button("Champion Fighter");
 	Button battle = new Button("Battle Master");
 	Button eldritch = new Button("Eldritch Knight");
 	//Monk
 	Frame monkFrame = new Frame("Monk");
 	Button elements = new Button("Way of the Four Elements");
 	Button shadow = new Button("Way of the Shadow");
 	Button hand = new Button("Way of the Open Hand");
 	//Paladin
 	Frame paladinFrame = new Frame("Paladin");
 	Button vengence = new Button("Oath of Vengence");
 	Button devotion = new Button("Oath of Devotion");
 	Button ancients = new Button("Oath of the Ancients");
 	//Ranger
 	Frame rangerFrame = new Frame("Ranger");
 	Button hunter = new Button("Hunter Ranger");
 	Button beast = new Button("Beast Master Ranger");
 	//Rogue
 	Frame rogueFrame = new Frame("Rogue");
 	Button assassin = new Button("Assassin Rogue");
 	Button thief = new Button("Thief Rogue");
 	Button trick = new Button("Arcan Trickster Rogue");
 	//Sorcerer
 	Frame sorcererFrame = new Frame("Sorcerer");
 	Button wild = new Button("Wild Magic Sorcerer");
 	Button dragon = new Button("Draconic Sorcerer");
 	//Warlock
 	String warl = "none";
 	Frame warlockFrame = new Frame("Warlock");
 	Frame warlock2Frame = new Frame("Warlock Pact");
 	Button fiend = new Button("Fiend Patron");
 	Button fey = new Button("Fey Patron");
 	Button gOO = new Button("Great Old One Patron");
 	Button blade = new Button("Pact of the Blade");
 	Button tome = new Button("Pact of the Tome");
 	Button chain = new Button("Pact of the Chain");
 	//Wizard
 	Frame wizardFrame = new Frame("Wizard");
 	Button abjuration = new Button("School of Abjuration");
 	Button conjuration = new Button("School of Conjuration");
 	Button divination = new Button("School of Divination");
 	Button enchantment = new Button("School of Enchantment");
 	Button evocation = new Button("School of Evocation");
 	Button illusion = new Button("School of Illusion"); 
 	Button necromancy = new Button("School of Necromancy");
 	Button transmutation = new Button("School of Transmutation");
 	
 	//Background
 	backgroundButtons b = new backgroundButtons();
 	public void paint(Graphics g)
 	{
 		for(int i = 0; i < 100; i++)
 		{
 			int x = 5;
 			int y = 10 + 12 * i;
 			g.drawString(Gloabals.line[i], x, y);
 		}
 	}
	public AppletRunner() {
		setFrame(homeFrame, 2, 2, true);
		setFrame(raceFrame, 3, 3, false);
		setFrame(classFrame, 4, 3, false);
		setFrame(b.backgroundFrame, 1, 1, false);
		homeFrame.add(raceButton);
		raceButton.addActionListener(this);
		homeFrame.add(classButton);
		classButton.addActionListener(this);
		homeFrame.add(b.backgroundButton);
		b.backgroundButton.addActionListener(this);
		homeFrame.add(done);
		done.addActionListener(this);
		
		
		
		//Race Frame Button setting
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
		
		//Level Frame
		levelFrame.setSize(500, 500);
		levelFrame.add(text);
		levelFrame.add(submit);
		submit.addActionListener(this);
		
		//Class Frame Button Setting
		classFrame.add(barbarianB);
		barbarianB.addActionListener(this);
		classFrame.add(bardB);
		bardB.addActionListener(this);
		classFrame.add(clericB);
		clericB.addActionListener(this);
		classFrame.add(druidB);
		druidB.addActionListener(this);
		classFrame.add(fighterB);
		fighterB.addActionListener(this);
		classFrame.add(monkB);
		monkB.addActionListener(this);
		classFrame.add(paladinB);
		paladinB.addActionListener(this);
		classFrame.add(rangerB);
		rangerB.addActionListener(this);
		classFrame.add(rogueB);
		rogueB.addActionListener(this);
		classFrame.add(sorcererB);
		sorcererB.addActionListener(this);
		classFrame.add(warlockB);
		warlockB.addActionListener(this);
		classFrame.add(wizardB);
		wizardB.addActionListener(this);
		
		//Background Frame Initialization
		b.backgroundFrame.add(b.acolyte);
		b.acolyte.addActionListener(this);
		b.backgroundFrame.add(b.charlatan);
		b.charlatan.addActionListener(this);
		b.backgroundFrame.add(b.criminal);
		b.criminal.addActionListener(this);
		b.backgroundFrame.add(b.entertainer);
		b.entertainer.addActionListener(this);
		b.backgroundFrame.add(b.folkHero);
		b.folkHero.addActionListener(this);
		b.backgroundFrame.add(b.guildArtisan);
		b.guildArtisan.addActionListener(this);
		b.backgroundFrame.add(b.hermit);
		b.hermit.addActionListener(this);
		b.backgroundFrame.add(b.noble);
		b.noble.addActionListener(this);
		b.backgroundFrame.add(b.outlander);
		b.outlander.addActionListener(this);
		b.backgroundFrame.add(b.pirate);
		b.pirate.addActionListener(this);
		b.backgroundFrame.add(b.sage);
		b.sage.addActionListener(this);
		b.backgroundFrame.add(b.sailor);
		b.sailor.addActionListener(this);
		b.backgroundFrame.add(b.soldier);
		b.soldier.addActionListener(this);
		b.backgroundFrame.add(b.spy);
		b.spy.addActionListener(this);
		b.backgroundFrame.add(b.urchin);
		b.urchin.addActionListener(this);
		setFrame(b.backgroundFrame, 3, 5, false);
		for(int i = 0; i < 100; i++)
			l.line[i] = "";
	}
	public void setFrame(Frame f, int x, int y, boolean onOff) {
		f.setLayout(new GridLayout(x, y));
		f.setSize(500, 500);
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
	    	 	setFrame(levelFrame, 1, 2, true);
	     }
	     else if(evt.getSource() == submit)
	     {
	    	level = text.getText();
	    	levelFrame.setVisible(false);
	    	classFrame.setVisible(true);
	     }
	     else if (evt.getSource()== b.backgroundButton)
	         {
	    	 	homeFrame.setVisible(false);
	    	 	b.backgroundFrame.setVisible(true);
	         }
	     //Dragonborn Selection
	     else if (evt.getSource()==dragonbornB)
         {
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
         }
	     else if (evt.getSource()==blackD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.black);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
 	 	 else if (evt.getSource()==blueD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.blue);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
 	 	 else if (evt.getSource()==brassD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.brass);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
 	 	 else if (evt.getSource()==bronzeD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.bronze);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
 	 	 else if (evt.getSource()==copperD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.copper);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
 	 	 else if (evt.getSource()==goldD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.gold);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
 	 	 else if (evt.getSource()==greenD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.green);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
 	 	 else if (evt.getSource()==redD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.red);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
 	 	 else if (evt.getSource()==silverD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.silver);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
 	 	 else if (evt.getSource()==whiteD)
         {
 	 		race.setRaces(racePossible.dragonborn, subPossible.white);
 	 		dragonFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
         }
	     //Dwarf Selection
	     else if (evt.getSource()==dwarfB)
         {
    	 	raceFrame.setVisible(false);
    	 	setFrame(dwarfFrame, 1, 2, true);
    	 	
    	 	dwarfFrame.add(mountD);
    	 	mountD.addActionListener(this);
    	 	dwarfFrame.add(hillD);
    	 	hillD.addActionListener(this);
    	 }
	     if (evt.getSource() == mountD)
 	 	 {
 	 		dwarfFrame.setVisible(false);
 	 		race.setRaces(racePossible.dwarf, subPossible.mountain);
 	 		homeFrame.setVisible(true);
 	 	 }
 	 	 else if (evt.getSource() == hillD)
 	 	 {
 	 		dwarfFrame.setVisible(false);
 	 		race.setRaces(racePossible.dwarf, subPossible.hill);
 	 		homeFrame.setVisible(true);
 	 	 }
      
	     //Elf Selection
	     else if (evt.getSource()==elfB)
         {
    	 	raceFrame.setVisible(false);
    	 	setFrame(elfFrame, 1, 2, true);
    	 	
    	 	elfFrame.add(woodE);
    	 	woodE.addActionListener(this);
    	 	elfFrame.add(highE);
    	 	highE.addActionListener(this);
    	 }
	     else if (evt.getSource() == highE)
 	 	 {
 	 		race.setRaces(racePossible.elf, subPossible.high);
 	 		elfFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
 	 	 }
 	 	 else if (evt.getSource() == woodE)
 	 	 {
 	 		race.setRaces(racePossible.elf, subPossible.wood);
 	 		elfFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
 	 	 }
      
	     //Gnome Selection
	     else if (evt.getSource()==gnomeB)
         {
    	 	raceFrame.setVisible(false);
    	 	setFrame(gnomeFrame, 1, 2, true);
    	 	
    	 	gnomeFrame.add(deepG);
    	 	deepG.addActionListener(this);
    	 	gnomeFrame.add(rockG);
    	 	rockG.addActionListener(this);
    	 }
	     else if (evt.getSource() == deepG)
 	 	 {
 	 		race.setRaces(racePossible.gnome, subPossible.deep);
 	 		gnomeFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
 	 	 }
 	 	 else if (evt.getSource() == rockG)
 	 	 {
 	 		race.setRaces(racePossible.gnome, subPossible.rock);
 	 		gnomeFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
 	 	 }
	     //Half-Elf Selection
	     else if (evt.getSource() == halfElfB)
	     {
	    	 race.setRaces(racePossible.halfElf, subPossible.nun);
	    	 raceFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Halfling Selection
	     else if (evt.getSource()==halflingB)
         {
    	 	raceFrame.setVisible(false);
    	 	setFrame(halflingFrame, 1, 2, true);
    	 	
    	 	halflingFrame.add(stoutH);
    	 	stoutH.addActionListener(this);
    	 	halflingFrame.add(lightH);
    	 	lightH.addActionListener(this);
         }
	     else if (evt.getSource() == lightH)
 	 	 {
 	 		race.setRaces(racePossible.halfling, subPossible.light);
 	 		halflingFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
 	 	 }
 	 	 else if (evt.getSource() == stoutH)
 	 	 {
 	 		race.setRaces(racePossible.halfling, subPossible.stout);
 	 		halflingFrame.setVisible(false);
 	 		homeFrame.setVisible(true);
 	 	 }
	     //Half-Orc Selection
	     else if(evt.getSource() == halfOrcB)
	     {
	    	 race.setRaces(racePossible.halfOrc, subPossible.nun);
	    	 raceFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Human Selection
	     else if(evt.getSource() == humanB)
	     {
	    	 race.setRaces(racePossible.human,  subPossible.nun);
	    	 raceFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Tiefling Selection
	     else if(evt.getSource() == tieflingB)
	     {
	    	 race.setRaces(racePossible.tiefling,  subPossible.nun);
	    	 raceFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Classes
	     //Barbarian
	     else if (evt.getSource() == barbarianB)
	     {
	    	 getLevel();
	    	 if(numLevel >= 3)
	    	 {
	    		 homeFrame.setVisible(false);
		    	 setFrame(barbFrame, 1, 2, true);
		    	 barbFrame.add(berserker);
		    	 berserker.addActionListener(this);
		    	 barbFrame.add(totem);
		    	 totem.addActionListener(this);
		    	 classFrame.setVisible(false);
	    	 }
	    	 else
	    	 {
	    		 userClass.setClass(archPoss.none, classPoss.barbarian, warlockPact.none, numLevel);
	    		 classFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 
	     }
	     else if(evt.getSource() == berserker)
	     {
	    	 userClass.setClass(archPoss.berserker, classPoss.barbarian, warlockPact.none, numLevel);
	    	 barbFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == totem)
	     {
	    	 userClass.setClass(archPoss.totem, classPoss.barbarian, warlockPact.none, numLevel);
	    	 barbFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Bard Class Buttons
	     else if(evt.getSource() == bardB)
	     {
	    	 getLevel();
	    	 if(numLevel >= 3)
	    	 {
	    		 homeFrame.setVisible(false);
		    	 setFrame(bardFrame, 1, 2, true);
		    	 bardFrame.add(lore);
		    	 lore.addActionListener(this);
		    	 bardFrame.add(valor);
		    	 valor.addActionListener(this);
		    	 classFrame.setVisible(false);
	    	 }
	    	 else
	    	 {
	    		 userClass.setClass(archPoss.none, classPoss.bard, warlockPact.none, numLevel);
	    		 classFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	     }
	     else if(evt.getSource() == lore)
	     {
	    	 userClass.setClass(archPoss.lore, classPoss.bard, warlockPact.none, numLevel);
	    	 bardFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == valor)
	     {
	    	 userClass.setClass(archPoss.valor, classPoss.bard, warlockPact.none, numLevel);
	    	 bardFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	   //Cleric Class Buttons
	     else if(evt.getSource() == clericB)
	     {
	    	 homeFrame.setVisible(false);
	    	 setFrame(clericFrame, 3, 3, true);
	    	 clericFrame.add(death);
	    	 death.addActionListener(this);
	    	 clericFrame.add(forge);
	    	 forge.addActionListener(this);
	    	 clericFrame.add(knowledge);
	    	 knowledge.addActionListener(this);
	    	 clericFrame.add(life);
	    	 life.addActionListener(this);
	    	 classFrame.setVisible(false);
	    	 clericFrame.add(light);
	    	 light.addActionListener(this);
	    	 clericFrame.add(nature);
	    	 nature.addActionListener(this);
	    	 classFrame.setVisible(false);
	    	 clericFrame.add(tempest);
	    	 tempest.addActionListener(this);
	    	 clericFrame.add(trickery);
	    	 trickery.addActionListener(this);
	    	 classFrame.setVisible(false);
	    	 clericFrame.add(war);
	    	 war.addActionListener(this);
	     }
	     else if(evt.getSource() == death)
	     {
	    	 userClass.setClass(archPoss.death, classPoss.cleric, warlockPact.none, numLevel);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == forge)
	     {
	    	 userClass.setClass(archPoss.forge, classPoss.cleric, warlockPact.none, numLevel);
	    	 clericFrame.setVisible(false);
	    	 clericFrame.setVisible(true);
	     }
	     else if(evt.getSource() == knowledge)
	     {
	    	 userClass.setClass(archPoss.knowledge, classPoss.cleric, warlockPact.none, numLevel);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == light)
	     {
	    	 userClass.setClass(archPoss.light, classPoss.cleric, warlockPact.none, numLevel);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == life)
	     {
	    	 userClass.setClass(archPoss.life, classPoss.cleric, warlockPact.none, numLevel);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == nature)
	     {
	    	 userClass.setClass(archPoss.nature, classPoss.cleric, warlockPact.none, numLevel);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == tempest)
	     {
	    	 userClass.setClass(archPoss.tempest, classPoss.cleric, warlockPact.none, numLevel);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == trickery)
	     {
	    	 userClass.setClass(archPoss.trickery, classPoss.cleric, warlockPact.none, numLevel);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == war)
	     {
	    	 userClass.setClass(archPoss.war, classPoss.cleric, warlockPact.none, numLevel);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Druid Class Button
	     else if(evt.getSource() == druidB)
	     {
	    	 getLevel();
	    	 if(numLevel >= 2)
	    	 {
	    		 homeFrame.setVisible(false);
		    	 setFrame(druidFrame, 1, 2, true);
		    	 druidFrame.add(moon);
		    	 moon.addActionListener(this);
		    	 druidFrame.add(land);
		    	 land.addActionListener(this);
		    	 classFrame.setVisible(false);
	    	 }
	    	 else
	    	 {
	    		 userClass.setClass(archPoss.none, classPoss.druid, warlockPact.none, numLevel);
	    		 classFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 
	     }
	     else if(evt.getSource() == moon)
	     {
	    	 userClass.setClass(archPoss.moon, classPoss.druid, warlockPact.none, numLevel);
	    	 druidFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == land)
	     {
	    	 userClass.setClass(archPoss.land, classPoss.druid, warlockPact.none, numLevel);
	    	 druidFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Fighter Stuff
	     else if(evt.getSource() == fighterB)
	     {
	    	 getLevel();
	    	 if(numLevel >= 3)
	    	 {
	    		 homeFrame.setVisible(false);
		    	 setFrame(fighterFrame, 1, 2, true);
		    	 fighterFrame.add(champion);
		    	 champion.addActionListener(this);
		    	 fighterFrame.add(battle);
		    	 battle.addActionListener(this);
		    	 fighterFrame.add(eldritch);
		    	 eldritch.addActionListener(this);
		    	 classFrame.setVisible(false);
	    	 }
	    	 else
	    	 {
	    		 userClass.setClass(archPoss.none, classPoss.fighter, warlockPact.none, numLevel);
	    		 classFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 
	     }
	     else if(evt.getSource() == champion)
	     {
	    	 userClass.setClass(archPoss.champion, classPoss.fighter, warlockPact.none, numLevel);
	    	 fighterFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == battle)
	     {
	    	 userClass.setClass(archPoss.battleMaster, classPoss.fighter, warlockPact.none, numLevel);
	    	 fighterFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == eldritch)
	     {
	    	 userClass.setClass(archPoss.eldritchKnight, classPoss.fighter, warlockPact.none, numLevel);
	    	 fighterFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Monk Stuff
	     else if(evt.getSource() == monkB)
	     {
	    	 getLevel();
	    	 if(numLevel >= 3)
	    	 {
	    		 homeFrame.setVisible(false);
		    	 setFrame(monkFrame, 1, 2, true);
		    	 monkFrame.add(shadow);
		    	 shadow.addActionListener(this);
		    	 monkFrame.add(hand);
		    	 hand.addActionListener(this);
		    	 monkFrame.add(elements);
		    	 elements.addActionListener(this);
		    	 classFrame.setVisible(false);
	    	 }
	    	 else
	    	 {
	    		 userClass.setClass(archPoss.none, classPoss.monk, warlockPact.none, numLevel);
	    		 classFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	     }
	     else if(evt.getSource() == hand)
	     {
	    	 userClass.setClass(archPoss.hand, classPoss.monk, warlockPact.none, numLevel);
	    	 monkFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == elements)
	     {
	    	 userClass.setClass(archPoss.elements, classPoss.monk, warlockPact.none, numLevel);
	    	 monkFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == shadow)
	     {
	    	 userClass.setClass(archPoss.shadow, classPoss.monk, warlockPact.none, numLevel);
	    	 monkFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Paladin Stuff
	     else if(evt.getSource() == paladinB)
	     {
	    	 getLevel();
	    	 if(numLevel >= 3)
	    	 {
	    		 homeFrame.setVisible(false);
		    	 setFrame(paladinFrame, 1, 2, true);
		    	 paladinFrame.add(devotion);
		    	 devotion.addActionListener(this);
		    	 paladinFrame.add(ancients);
		    	 ancients.addActionListener(this);
		    	 paladinFrame.add(vengence);
		    	 vengence.addActionListener(this);
		    	 classFrame.setVisible(false);
	    	 }
	    	 else
	    	 {
	    		 userClass.setClass(archPoss.none, classPoss.paladin, warlockPact.none, numLevel);
	    		 classFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	     }
	     else if(evt.getSource() == devotion)
	     {
	    	 userClass.setClass(archPoss.devotion, classPoss.paladin, warlockPact.none, numLevel);
	    	 paladinFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == ancients)
	     {
	    	 userClass.setClass(archPoss.ancients, classPoss.paladin, warlockPact.none, numLevel);
	    	 paladinFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == vengence)
	     {
	    	 userClass.setClass(archPoss.vengence, classPoss.paladin, warlockPact.none, numLevel);
	    	 paladinFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Ranger Stuff
	     else if(evt.getSource() == rangerB)
	     {
	    	 getLevel();
	    	 if(numLevel >= 3)
	    	 {
	    		 homeFrame.setVisible(false);
		    	 setFrame(rangerFrame, 1, 2, true);
		    	 rangerFrame.add(hunter);
		    	 hunter.addActionListener(this);
		    	 rangerFrame.add(beast);
		    	 beast.addActionListener(this);
		    	 classFrame.setVisible(false);
	    	 }
	    	 else
	    	 {
	    		 userClass.setClass(archPoss.none, classPoss.ranger, warlockPact.none, numLevel);
	    		 classFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 
	     }
	     else if(evt.getSource() == hunter)
	     {
	    	 userClass.setClass(archPoss.hunter, classPoss.ranger, warlockPact.none, numLevel);
	    	 rangerFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == beast)
	     {
	    	 userClass.setClass(archPoss.beastMaster, classPoss.ranger, warlockPact.none, numLevel);
	    	 rangerFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Rogue Stuff
	     else if(evt.getSource() == rogueB)
	     {
	    	 getLevel();
	    	 if(numLevel >= 3)
	    	 {
	    		 homeFrame.setVisible(false);
		    	 setFrame(rogueFrame, 1, 2, true);
		    	 rogueFrame.add(thief);
		    	 thief.addActionListener(this);
		    	 rogueFrame.add(assassin);
		    	 hand.addActionListener(this);
		    	 rogueFrame.add(trick);
		    	 trick.addActionListener(this);
		    	 classFrame.setVisible(false);
	    	 }
	    	 else
	    	 {
	    		 userClass.setClass(archPoss.none, classPoss.rogue, warlockPact.none, numLevel);
	    		 classFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 homeFrame.setVisible(false);
	    	 setFrame(rogueFrame, 1, 2, true);
	    	 rogueFrame.add(thief);
	    	 thief.addActionListener(this);
	    	 rogueFrame.add(assassin);
	    	 hand.addActionListener(this);
	    	 rogueFrame.add(trick);
	    	 trick.addActionListener(this);
	    	 classFrame.setVisible(false);
	     }
	     else if(evt.getSource() == thief)
	     {
	    	 userClass.setClass(archPoss.thief, classPoss.rogue, warlockPact.none, numLevel);
	    	 rogueFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == assassin)
	     {
	    	 userClass.setClass(archPoss.assassin, classPoss.rogue, warlockPact.none, numLevel);
	    	 rogueFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == trick)
	     {
	    	 userClass.setClass(archPoss.trickster, classPoss.rogue, warlockPact.none, numLevel);
	    	 rogueFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Sorcerer Stuff
	     else if(evt.getSource() == sorcererB)
	     {
	    	 homeFrame.setVisible(false);
	    	 setFrame(sorcererFrame, 1, 2, true);
	    	 sorcererFrame.add(wild);
	    	 wild.addActionListener(this);
	    	 sorcererFrame.add(dragon);
	    	 dragon.addActionListener(this);
	    	 classFrame.setVisible(false);
	     }
	     else if(evt.getSource() == wild)
	     {
	    	 userClass.setClass(archPoss.wild, classPoss.sorcerer, warlockPact.none, numLevel);
	    	 sorcererFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == dragon)
	     {
	    	 userClass.setClass(archPoss.dragon, classPoss.sorcerer, warlockPact.none, numLevel);
	    	 sorcererFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Warlock Stuff
	     else if(evt.getSource() == warlockB)
	     {
	    	homeFrame.setVisible(false);
	    	setFrame(warlockFrame, 1, 3, true);
	    	warlockFrame.add(fiend);
	    	fiend.addActionListener(this);
	    	warlockFrame.add(fey);
	    	fey.addActionListener(this);
	    	warlockFrame.add(gOO);
	    	gOO.addActionListener(this);
	    	classFrame.setVisible(false);
	     }
	     else if(evt.getSource() == fiend)
	     {
	    	 getLevel();
	    	 switch(numLevel) {
	    	 case 20:
	    	 case 19:
	    	 case 18:
	    	 case 17:
	    	 case 16:
	    	 case 15:
	    	 case 14:
	    	 case 13:
	    	 case 12:
	    	 case 11:
	    	 case 10:
	    	 case 9:
	    	 case 8:
	    	 case 7:
	    	 case 6:
	    	 case 5:
	    	 case 4:
	    	 case 3:
	    		 warlockFrame.setVisible(false);
	    		 setFrame(warlock2Frame, 1, 3, true);
	    		 warlock2Frame.add(blade);
	    		 blade.addActionListener(this);
	    		 warlock2Frame.add(tome);
	    		 tome.addActionListener(this);
	    		 warlock2Frame.add(chain);
	    		 chain.addActionListener(this);
	    		 break;
	    	 case 2:
	    	 case 1:
	    		 userClass.setClass(archPoss.fiend, classPoss.warlock, warlockPact.none, numLevel);
	    		 warlockFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    		 break;
	    	default:
	    		warlockFrame.setVisible(false);
	    		homeFrame.setVisible(true);
	    	 }
	    	 warl = "fiend";
	     }
	     else if(evt.getSource() == fey)
	     {
	    	 getLevel();
	    	 switch(numLevel) {
	    	 case 20:
	    	 case 19:
	    	 case 18:
	    	 case 17:
	    	 case 16:
	    	 case 15:
	    	 case 14:
	    	 case 13:
	    	 case 12:
	    	 case 11:
	    	 case 10:
	    	 case 9:
	    	 case 8:
	    	 case 7:
	    	 case 6:
	    	 case 5:
	    	 case 4:
	    	 case 3:
	    		 warlockFrame.setVisible(false);
	    		 setFrame(warlock2Frame, 1, 3, true);
	    		 warlock2Frame.add(blade);
	    		 blade.addActionListener(this);
	    		 warlock2Frame.add(tome);
	    		 tome.addActionListener(this);
	    		 warlock2Frame.add(chain);
	    		 chain.addActionListener(this);
	    		 break;
	    	 case 2:
	    	 case 1:
	    		 userClass.setClass(archPoss.fey, classPoss.warlock, warlockPact.none, numLevel);
	    		 warlockFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    		 break;
	    	default:
	    		warlockFrame.setVisible(false);
	    		homeFrame.setVisible(true);
	    	 }
	    	 warl = "fey";
	     }
	     else if(evt.getSource() == gOO)
	     {
	    	getLevel();
	    	switch(numLevel) {
	    	 case 20:
	    	 case 19:
	    	 case 18:
	    	 case 17:
	    	 case 16:
	    	 case 15:
	    	 case 14:
	    	 case 13:
	    	 case 12:
	    	 case 11:
	    	 case 10:
	    	 case 9:
	    	 case 8:
	    	 case 7:
	    	 case 6:
	    	 case 5:
	    	 case 4:
	    	 case 3:
	    		 warlockFrame.setVisible(false);
	    		 warlock2Frame.add(blade);
	    		 blade.addActionListener(this);
	    		 warlock2Frame.add(tome);
	    		 tome.addActionListener(this);
	    		 warlock2Frame.add(chain);
	    		 chain.addActionListener(this);
	    		 setFrame(warlock2Frame, 1, 3, true);
	    		 break;
	    	 case 2:
	    	 case 1:
	    		 userClass.setClass(archPoss.gOO, classPoss.warlock, warlockPact.none, numLevel);
	    		 warlockFrame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    		 break;
	    	default:
	    		warlockFrame.setVisible(false);
	    		wizardFrame.setVisible(true);
	    	 }
	    	 warl = "gOO";
	     }
	     else if(evt.getSource() == blade)
	     {
	    	 if(warl == "fiend")
	    	 {
	    		 userClass.setClass(archPoss.fiend, classPoss.warlock, warlockPact.blade, numLevel);
	    		 warlock2Frame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 else if(warl == "fey")
	    	 {
	    		 userClass.setClass(archPoss.fey, classPoss.warlock, warlockPact.blade, numLevel);
	    		 warlock2Frame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 else if(warl == "gOO")
	    	 {
	    		 userClass.setClass(archPoss.gOO, classPoss.warlock, warlockPact.blade, numLevel);
	    		 warlock2Frame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	     }
	     else if(evt.getSource() == tome)
	     {
	    	 if(warl == "fiend")
	    	 {
	    		 userClass.setClass(archPoss.fiend, classPoss.warlock, warlockPact.tome, numLevel);
	    		 warlock2Frame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 else if(warl == "fey")
	    	 {
	    		 userClass.setClass(archPoss.fey, classPoss.warlock, warlockPact.tome, numLevel);
	    		 warlock2Frame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 else if(warl == "gOO")
	    	 {
	    		 userClass.setClass(archPoss.gOO, classPoss.warlock, warlockPact.tome, numLevel);
	    		 warlock2Frame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	     }
	     else if(evt.getSource() == chain)
	     {
	    	 if(warl == "fiend")
	    	 {
	    		 userClass.setClass(archPoss.fiend, classPoss.warlock, warlockPact.chain, numLevel);
	    		 warlock2Frame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 else if(warl == "fey")
	    	 {
	    		 userClass.setClass(archPoss.fey, classPoss.warlock, warlockPact.chain, numLevel);
	    		 warlock2Frame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	    	 else if(warl == "gOO")
	    	 {
	    		 userClass.setClass(archPoss.gOO, classPoss.warlock, warlockPact.chain, numLevel);
	    		 warlock2Frame.setVisible(false);
	    		 homeFrame.setVisible(true);
	    	 }
	     }
	     //Wizard Stuff
    	 else if(evt.getSource() == wizardB)
    	 {
    		 getLevel();
    		 if(numLevel >= 2)
    		 {
    			 classFrame.setVisible(false);
    			 wizardFrame.add(abjuration);
    			 abjuration.addActionListener(this);
    			 wizardFrame.add(conjuration);
    			 conjuration.addActionListener(this);
    			 wizardFrame.add(divination);
    			 divination.addActionListener(this);
    			 wizardFrame.add(enchantment);
    			 enchantment.addActionListener(this);
    			 wizardFrame.add(evocation);
    			 evocation.addActionListener(this);
    			 wizardFrame.add(illusion);
    			 illusion.addActionListener(this);
    			 wizardFrame.add(necromancy);
    			 necromancy.addActionListener(this);
    			 wizardFrame.add(transmutation);
    			 transmutation.addActionListener(this);
    			 setFrame(wizardFrame, 2, 4, true);
    		 }
    		 else if(numLevel == 1)
    		 {
    			 userClass.setClass(archPoss.none, classPoss.wizard, warlockPact.none, numLevel);
    			 classFrame.setVisible(false);
    			 homeFrame.setVisible(true);
    		 }
    	 }
    	 else if(evt.getSource() == abjuration)
    	 {
    		 userClass.setClass(archPoss.abjuration, classPoss.wizard, warlockPact.none, numLevel);
    		 wizardFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == conjuration)
    	 {
    		 userClass.setClass(archPoss.conjuration, classPoss.wizard, warlockPact.none, numLevel);
    		 wizardFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == divination)
    	 {
    		 userClass.setClass(archPoss.divination, classPoss.wizard, warlockPact.none, numLevel);
    		 wizardFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == enchantment)
    	 {
    		 userClass.setClass(archPoss.enchantment, classPoss.wizard, warlockPact.none, numLevel);
    		 wizardFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == illusion)
    	 {
    		 userClass.setClass(archPoss.illusion, classPoss.wizard, warlockPact.none, numLevel);
    		 wizardFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == necromancy)
    	 {
    		 userClass.setClass(archPoss.necromancy, classPoss.wizard, warlockPact.none, numLevel);
    		 wizardFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == evocation)
    	 {
    		 userClass.setClass(archPoss.evocation, classPoss.wizard, warlockPact.none, numLevel);
    		 wizardFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == transmutation)
    	 {
    		 userClass.setClass(archPoss.transmutation, classPoss.wizard, warlockPact.none, numLevel);
    		 wizardFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
	     //Background Start
	     //Bacground Buttons
    	 else if(evt.getSource() == b.acolyte)
    	 {
    		 b.userB.setBackground(backgroundPoss.acolyte);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.charlatan)
    	 {
    		 b.userB.setBackground(backgroundPoss.charlatan);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.criminal)
    	 {
    		 b.userB.setBackground(backgroundPoss.criminal);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.entertainer)
    	 {
    		 b.userB.setBackground(backgroundPoss.entertainer);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.folkHero)
    	 {
    		 b.userB.setBackground(backgroundPoss.folkHero);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.guildArtisan)
    	 {
    		 b.userB.setBackground(backgroundPoss.guildArtisan);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.hermit)
    	 {
    		 b.userB.setBackground(backgroundPoss.hermit);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.noble)
    	 {
    		 b.userB.setBackground(backgroundPoss.noble);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.outlander)
    	 {
    		 b.userB.setBackground(backgroundPoss.outlander);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.pirate)
    	 {
    		 b.userB.setBackground(backgroundPoss.pirate);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.sage)
    	 {
    		 b.userB.setBackground(backgroundPoss.sage);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.sailor)
    	 {
    		 b.userB.setBackground(backgroundPoss.sailor);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.soldier)
    	 {
    		 b.userB.setBackground(backgroundPoss.soldier);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.spy)
    	 {
    		 b.userB.setBackground(backgroundPoss.spy);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
    	 else if(evt.getSource() == b.urchin)
    	 {
    		 b.userB.setBackground(backgroundPoss.urchin);
    		 b.backgroundFrame.setVisible(false);
    		 homeFrame.setVisible(true);
    	 }
	     //Output Frame Stuff
    	 else if(evt.getSource() == done)
    	 {
    		homeFrame.setVisible(false);
       		repaint();
    	 }
	}
	public void getLevel() {		
		if(level.contentEquals("20"))
			numLevel = 20;
		else if(level.equals("19"))
			numLevel = 19;
		else if(level.equals("18"))
			numLevel = 18;
		else if(level.equals("17"))
			numLevel = 17;
		else if(level.equals("16"))
			numLevel = 16;
		else if(level.equals("15"))
			numLevel = 15;
		else if(level.equals("14"))
			numLevel = 14;
		else if(level.equals("13"))
			numLevel = 13;
		else if(level.equals("12"))
			numLevel = 12;
		else if(level.equals("11"))
			numLevel = 11;
		else if(level.equals("10"))
			numLevel = 10;
		else if(level.equals("9"))
			numLevel = 9;
		else if(level.equals("8"))
			numLevel = 8;
		else if(level.equals("7"))
			numLevel = 7;
		else if(level.equals("6"))
			numLevel = 6;
		else if(level.equals("5"))
			numLevel = 5;
		else if(level.equals("4"))
			numLevel = 4;
		else if(level.equals("3"))
			numLevel = 3;
		else if(level.equals("2"))
			numLevel = 2;
		else if(level.equals("1"))
			numLevel = 1;
	}
	
	
}
