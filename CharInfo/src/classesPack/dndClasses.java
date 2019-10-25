package classesPack;

public class dndClasses {
	public classPoss classType;
	public archPoss archType;
	public warlockPact pactType;
	public  String asi = "increase one ability score by 2 or increase two ability scores by 1 ";
	public  String twentyAbt1 = new String();
	public  String twentyAbt2 = new String();
	public  String twentyAbt3 = new String();
	public  String nineteenAbt1 = new String();
	public  String nineteenAbt2 = new String();
	public  String nineteenAbt3 = new String();
	public  String eighteenAbt1 = new String();
	public  String eighteenAbt2 = new String();
	public  String eighteenAbt3 = new String();
	public  String seventeenAbt1 = new String();
	public  String seventeenAbt2 = new String();
	public  String seventeenAbt3 = new String();
	public  String sixteenAbt1 = new String();
	public  String sixteenAbt2 = new String();
	public  String sixteenAbt3 = new String();
	public  String fifteenAbt1 = new String();
	public  String fifteenAbt2 = new String();
	public  String fifteenAbt3 = new String();
	public  String fourteenAbt1 = new String();
	public  String fourteenAbt2 = new String();
	public  String fourteenAbt3 = new String();
	public  String fourteenArch = new String();
	public  String thirteenAbt1 = new String();
	public  String thirteenAbt2 = new String();
	public  String thirteenAbt3 = new String();
	public  String twelveAbt1 = new String();
	public  String twelveAbt2 = new String();
	public  String twelveAbt3 = new String();
	public  String elevenAbt1 = new String();
	public  String elevenAbt2 = new String();
	public  String elevenAbt3 = new String();
	public 	String tenAbt1 = new String();
	public 	String tenAbt2 = new String();
	public 	String tenAbt3 = new String();
	public 	String tenArch = new String();
	public  String nineAbt1 = new String();
	public  String nineAbt2 = new String();
	public  String nineAbt3 = new String();
	public 	String eightAbt1 = new String();
	public 	String eightAbt2 = new String();
	public 	String eightAbt3 = new String();
	public 	String sevenAbt1 = new String();
	public 	String sevenAbt2 = new String();
	public 	String sevenAbt3 = new String();
	public 	String sixAbt1 = new String();
	public 	String sixAbt2 = new String();
	public 	String sixAbt3 = new String();
	public  String sixArch = new String();
	public  String fiveAbt1 = new String();
	public 	String fiveAbt2 = new String();
	public 	String fiveAbt3 = new String();
	public 	String fourAbt1 = new String();
	public 	String fourAbt2 = new String();
	public 	String fourAbt3 = new String();
	public 	String threeAbt1 = new String();
	public 	String threeAbt2 = new String();
	public 	String threeAbt3 = new String();	
	public  String threeArch = new String();
	public 	String twoAbt1 = new String();
	public 	String twoAbt2 = new String();
	public  String twoAbt3 = new String();
	public 	String oneAbt1 = new String();
	public 	String oneAbt2 = new String();
	public  String oneAbt3 = new String();
	public  String name = new String();
	public String abt[] = new String[100];

	public 	String proficiencyBonus = new String();
	
	public dndClasses() {
		archType = archPoss.none;
		classType = classPoss.none;
		pactType = warlockPact.none;
	}
	public void setClass(archPoss Archtype, classPoss ClassType, warlockPact PactType, int lvl) {
		classType = ClassType;
		archType = Archtype; 
		pactType = PactType;
		int level = lvl;
		
		switch(level) {
		case 1:
		case 2:
		case 3:
		case 4:
			proficiencyBonus = "Proficiency Bonus +2";
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			proficiencyBonus = "Proficiency Bonus +3";
			break;
		case 9 :
		case 10:
		case 11:
		case 12:
			proficiencyBonus = "Proficiency Bonus +4";
			break;
		case 13:
		case 14:
		case 15:
		case 16:
			proficiencyBonus = "Proficiency Bonus +5";
			break;
		case 17:
		case 18:
		case 19:
		case 20:
			proficiencyBonus = "Proficiency Bonus +6";
			break;
		}
		
		
		switch (classType) {
		case barbarian:
			switch(archType){
			case berserker:
				abt[4] = "Level 3: you can go into a frenzy when you rage, your rage you can make a single melee weapon attack as a bonus action on each of your turns after this one, you have upgraded to 3 rages a day";
				abt[11] = "Level 6: you can’t be charmed or frightened while raging, you have upgraded to 4 rages a day ";
				abt[19] = "Level 10: Action to frieghten someone, Wis Save DC(8 + prof + Cha) until end of your next turn.";
				abt[27] = "Level 14: when you take damage from a creature that is within 5 feet of you, you can use your reaction to make a melee weapon attack against that creature";
				break;
				
			
			case totem:
				abt[4] = "Level 3: Bear: Resistnt to all damage except psychic while raging. Eagle: If NO heavy armor, disadv. on oppurtunity attacks against you. Wolf: Allies have adv. on melee attacks against creatures within 5 ft of you. you've upgraded to 3 rages per day";
				abt[11] = "Level 6: Bear: Carry Capacity doubled, adv. on Str Checks made to interact with objects. Eagle: See up to one mile with no difficulty, dim light doesn't affect you. Wolf: Can track at normal pace. You also now have 4 rages per day";
				abt[19] = "Level 10: Can cast Commune with Nature as a ritual only.";
				abt[27] = "Level 14: Bear: While raging, Creatures have Disadv. on attack rolls within 5 ft of you. Eagle: While raging, gain fly speed = walking speed. Wolf: While raging can use bonus action to know Large or smaller creature prone.";
				break;
			default:
				break;
			}
			switch(level) {
			case 20:
				abt[38] = "Level 20: Strength and Constitution + 4 and maximum cap for those skills increase to 24, you have upgraded to have unlimted rages per day ";
				abt[39] = "";
			case 19:
				abt[36] = "Level 19: " + asi;
				abt[37] = "";
			case 18:
				abt[34] = "Level 18: if your strength check roll is lower than your actual strength score you can use actual score instead";
				abt[35] = "";
			case 17:
				abt[32] = "Level 17: roll three additional weapon damage dice after every crit, you know gain 6 rages per day";
				abt[33] = "";
			case 16:
				abt[30] = "Level 16: " + asi;
				abt[31] = "Level 16: your rage now adds +4 to your attacks";
			case 15:
				abt[28] = "Level 15: rage is so fierce that it ends early only if you fall unconscious or if you choose to end it";
				abt[29] = "";
			case 14:
				abt[26] = "";
			case 13:
				abt[24] = "Level 13: roll two additional weapon damage dice after every crit";
				abt[25] = "";
			case 12:
				abt[22] = "Level 12: " + asi;
				abt[23] = "Level 12: You now have 5 rages per day";
			case 11:
				abt[20] = "Level 11: While your raging if you drop to 0 hp you must make a Con. saving throw DC 10 (+5 number of times you have already used this skill) success 1hp else dead, resets after long rest";
				abt[21] = "";
			case 10:
				abt[18] = "";
			case 9:
				abt[16] = "Level 9: roll one additional weapon damage dice after every crit, your rage now adds +3 to your attacks ";
				abt[17] = "";
			case 8:
				abt[14] = "Level 8: " + asi;
				abt[15] = "";
			case 7:
				abt[12] = "Level 7: gain advantage on all initiative rolls";
				abt[13]= "";
			case 6:
				abt[10] = "";
			case 5:
				abt[8] = "Level 5: you can attack twice";
				abt[9] = "Level 5: your speed increases by 10 feet while you aren’t wearing heavy armor";
			case 4:
				abt[6] = "Level 4: " + asi;
				abt[7] = "";
			case 3:
				abt[5] = "";
			case 2:
				abt[2] = "Level 2: you can choose to gain advantage on all attacks for your turn, enemies also gain advantage on attacks against you";
				abt[3] = "Level 2: adv. on Dex. saving throws against effects that you can see";
			case 1:
				abt[0] = "Level 1: while raging You have adv on Strength checks and Strength saving throws, you make a melee weapon attack using Strength, You have resistance to bludgeoning, piercing, and slashing damage, your rage adds +2 to your attacks";
				abt[1] = "Level 1: While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit. You get 2 rages a day";
				name = "Barbarian";
				break;
			}
			break;
		case bard:
			switch(level) {
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
				abt[13] = "Inspiration is now d10. Choose 2 more skills to double prof bonus. Learn 2 spells from any class spell list.";
			case 9:
				abt[12] = "Level 9: Level 5 ability is now d8";
			case 8:
				abt[11] = "Level 8: " + asi;
			case 7:
				abt[10] = "Level 7: Level 4 spell slot.";
			case 6:
				abt[8] = "Level 6: As an action you can do a performance to give advantage on saves against charm and fear for allies until end of next turn.";
			case 5:
				abt[7] = "Level 5: Regain all expended uses of Inspiration after short or long rest. Insiration die is now d8.";
			case 4:
				abt[6] = "Level 4: " + asi;
			case 3:
				abt[4] = "Level 3: Choose 2 skills and double your prof bonus.";
			case 2:
				abt[2] = "Level 2: Add half your prof bonus to any ability you are NOT proficient in.";
				abt[3] = "Level 2: During short rest add 1d6 HP to anyone spending hit dice";
			case 1:
				abt[0] = "Level 1: Spellcsting, DC = 8 + prof + CHA, Attack Bonues = + prof + CHA. You can ritual cast. Instruments count as arcane focus.";
				abt[1] = "Level 1: Give a creature a d6 for their next ability check, attack roll, or saving throw for next 10 min. Not reusable";
				name = "Bard";
				break;
			}
			break;
			
		case cleric:
			switch(level) {
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
			case 2:
			case 1:
			name = "Cleric";
				break;
			}
			break;
			
		case druid:
			switch(level) {
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
			case 2:
			case 1:
			name = "Druid";
				break;
			}
			break;
			
		case fighter:
			switch(level) {
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
			case 2:
			case 1:
			name = "Fighter";
				break;
			}
			break;
			
		case monk:
			switch(level) {
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
			case 2:
			case 1:
			name = "Monk";
				break;
			}
			break;
			
		case paladin:
			switch(level) {
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
			case 2:
			case 1:
			name = "Paladin";
				break;
			}
			break;
			
		case ranger:
			switch(level) {
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
			case 2:
			case 1:
			name = "Ranger";
				break;
			}
			break;
			
		case rogue:
			switch(level) {
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
			case 2:
			case 1:
			name = "Rogue";
				break;
			}
			break;
			
		case sorcerer:
			switch(level) {
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
			case 2:
			case 1:
			name = "Sorcerer";
				break;
			}
			break;
			
		case warlock:
			switch(level) {
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
			case 2:
			case 1:
			name = "Warlock";
				break;
			}
			break;
			
		case wizard:
			switch(level) {
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
			case 2:
			case 1:
			name = "Wizard";
				break;
			}
			break;
			
		default:
			break;
		}
		switch(archType) {
		case totem:
			break;
		case berserker:
			break;
		case lore:
			break;
		case valor:
			break;
		case knowledge:
			break;
		case light:
			break;
		case life:
			break;
		case nature:
			break;
		case tempest:
			break;
		case trickery:
			break;
		case war:
			break;
		case land:
			break;
		case moon:
			break;
		case battleMaster:
			break;
		case champion:
			break;
		case eldritchKnight:
			break;
		case shadow:
			break;
		case elements:
			break;
		case hand:
			break;
		case devotion:
			break;
		case ancients:
			break;
		case vengence:
			break;
		case hunter:
			break;
		case beastMaster:
			break;
		case assassin:
			break;
		case thief:
			break;
		case trickster:
			break;
		case wild:
			break;
		case dragon:
			break;
		case fiend:
			break;
		case fey:
			break;
		case gOO:
			break;
		case abjuration:
			break;
		case conjuration:
			break;
		case divination:
			break;
		case enchantment:
			break;
		case evocation:
			break;
		case illusion:
			break;
		case necromancy:
			break;
		case transmutation:
			break;
		case none:
			break;
		}
	}
}
