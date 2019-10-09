package main;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import races.Races;
import races.racePossible;
import races.subPossible;

import classesPack.*;

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
	//User Stuff
	Races race = new Races();
	dndClasses userClass = new dndClasses();
	int level = 1;
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
 	Frame warlockFrame = new Frame("Warlock");
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
 	Button transmutation = new Button("School of Trnsmutation");
	public AppletRunner() {
		setFrame(homeFrame, 1, 3, true);
		setFrame(raceFrame, 3, 3, false);
		setFrame(classFrame, 4, 3, false);
		setFrame(backgroundFrame, 1, 1, false);
		homeFrame.add(raceButton);
		raceButton.addActionListener(this);
		homeFrame.add(classButton);
		classButton.addActionListener(this);
		homeFrame.add(backgroundButton);
		backgroundButton.addActionListener(this);
		
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
	    	 homeFrame.setVisible(false);
	    	 setFrame(barbFrame, 1, 2, true);
	    	 barbFrame.add(berserker);
	    	 berserker.addActionListener(this);
	    	 barbFrame.add(totem);
	    	 totem.addActionListener(this);
	    	 classFrame.setVisible(false);
	     }
	     else if(evt.getSource() == berserker)
	     {
	    	 userClass.setClass(archPoss.berserker, classPoss.barbarian, level);
	    	 barbFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == totem)
	     {
	    	 userClass.setClass(archPoss.totem, classPoss.barbarian, level);
	    	 barbFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Bard Class Buttons
	     else if(evt.getSource() == bardB)
	     {
	    	 homeFrame.setVisible(false);
	    	 setFrame(bardFrame, 1, 2, true);
	    	 bardFrame.add(lore);
	    	 lore.addActionListener(this);
	    	 bardFrame.add(valor);
	    	 valor.addActionListener(this);
	    	 classFrame.setVisible(false);
	     }
	     else if(evt.getSource() == lore)
	     {
	    	 userClass.setClass(archPoss.lore, classPoss.bard, level);
	    	 bardFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == valor)
	     {
	    	 userClass.setClass(archPoss.valor, classPoss.bard, level);
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
	    	 userClass.setClass(archPoss.death, classPoss.cleric, level);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == forge)
	     {
	    	 userClass.setClass(archPoss.forge, classPoss.cleric, level);
	    	 clericFrame.setVisible(false);
	    	 clericFrame.setVisible(true);
	     }
	     else if(evt.getSource() == knowledge)
	     {
	    	 userClass.setClass(archPoss.knowledge, classPoss.cleric, level);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == light)
	     {
	    	 userClass.setClass(archPoss.light, classPoss.cleric, level);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == life)
	     {
	    	 userClass.setClass(archPoss.life, classPoss.cleric, level);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == nature)
	     {
	    	 userClass.setClass(archPoss.nature, classPoss.cleric, level);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == tempest)
	     {
	    	 userClass.setClass(archPoss.tempest, classPoss.cleric, level);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == trickery)
	     {
	    	 userClass.setClass(archPoss.trickery, classPoss.cleric, level);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == war)
	     {
	    	 userClass.setClass(archPoss.war, classPoss.cleric, level);
	    	 clericFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Druid Class Button
	     else if(evt.getSource() == druidB)
	     {
	    	 homeFrame.setVisible(false);
	    	 setFrame(druidFrame, 1, 2, true);
	    	 druidFrame.add(moon);
	    	 moon.addActionListener(this);
	    	 druidFrame.add(land);
	    	 land.addActionListener(this);
	    	 classFrame.setVisible(false);
	     }
	     else if(evt.getSource() == moon)
	     {
	    	 userClass.setClass(archPoss.moon, classPoss.druid, level);
	    	 druidFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == land)
	     {
	    	 userClass.setClass(archPoss.land, classPoss.druid, level);
	    	 druidFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Fighter Stuff
	     else if(evt.getSource() == fighterB)
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
	     else if(evt.getSource() == champion)
	     {
	    	 userClass.setClass(archPoss.champion, classPoss.fighter, level);
	    	 fighterFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == battle)
	     {
	    	 userClass.setClass(archPoss.battleMaster, classPoss.fighter, level);
	    	 fighterFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == eldritch)
	     {
	    	 userClass.setClass(archPoss.eldritchKnight, classPoss.fighter, level);
	    	 fighterFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Monk Stuff
	     else if(evt.getSource() == monkB)
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
	     else if(evt.getSource() == hand)
	     {
	    	 userClass.setClass(archPoss.hand, classPoss.monk, level);
	    	 monkFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == elements)
	     {
	    	 userClass.setClass(archPoss.elements, classPoss.monk, level);
	    	 monkFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == shadow)
	     {
	    	 userClass.setClass(archPoss.shadow, classPoss.monk, level);
	    	 monkFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Paladin Stuff
	     else if(evt.getSource() == paladinB)
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
	     else if(evt.getSource() == devotion)
	     {
	    	 userClass.setClass(archPoss.devotion, classPoss.paladin, level);
	    	 paladinFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == ancients)
	     {
	    	 userClass.setClass(archPoss.ancients, classPoss.paladin, level);
	    	 paladinFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == vengence)
	     {
	    	 userClass.setClass(archPoss.vengence, classPoss.paladin, level);
	    	 paladinFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Ranger Stuff
	     else if(evt.getSource() == rangerB)
	     {
	    	 homeFrame.setVisible(false);
	    	 setFrame(rangerFrame, 1, 2, true);
	    	 rangerFrame.add(hunter);
	    	 hunter.addActionListener(this);
	    	 rangerFrame.add(beast);
	    	 beast.addActionListener(this);
	    	 classFrame.setVisible(false);
	     }
	     else if(evt.getSource() == hunter)
	     {
	    	 userClass.setClass(archPoss.hunter, classPoss.ranger, level);
	    	 rangerFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == beast)
	     {
	    	 userClass.setClass(archPoss.beastMaster, classPoss.monk, level);
	    	 rangerFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Rogue Stuff
	     else if(evt.getSource() == rogueB)
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
	     else if(evt.getSource() == thief)
	     {
	    	 userClass.setClass(archPoss.thief, classPoss.rogue, level);
	    	 rogueFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == assassin)
	     {
	    	 userClass.setClass(archPoss.assassin, classPoss.rogue, level);
	    	 rogueFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == trick)
	     {
	    	 userClass.setClass(archPoss.trickster, classPoss.rogue, level);
	    	 rogueFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     //Sorcerer Stuff
	     else if(evt.getSource() == monkB)
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
	    	 userClass.setClass(archPoss.wild, classPoss.sorcerer, level);
	    	 sorcererFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	     else if(evt.getSource() == dragon)
	     {
	    	 userClass.setClass(archPoss.dragon, classPoss.sorcerer, level);
	    	 sorcererFrame.setVisible(false);
	    	 homeFrame.setVisible(true);
	     }
	}
	
}
