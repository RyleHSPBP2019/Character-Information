package classesPack;

public class dndClasses {
	public classPoss classType;
	public archPoss archType;
	public warlockPact pactType;
	public  String asi = "Increase one ability score by 2 or increase two ability scores by 1.";
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
	public String abt[] = new String[101];

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
				abt[8] = "Level 6: you can�t be charmed or frightened while raging, you have upgraded to 4 rages a day ";
				abt[12] = "Level 10: Action to frieghten someone, Wis Save DC(8 + prof + Cha) until end of your next turn.";
				abt[17] = "Level 14: when you take damage from a creature that is within 5 feet of you, you can use your reaction to make a melee weapon attack against that creature";
				break;
				
			
			case totem:
				abt[4] = "Level 3: Bear: Resistnt to all damage except psychic while raging. Eagle: If NO heavy armor, disadv. on oppurtunity attacks against you. Wolf: Allies have adv. on melee attacks against creatures within 5 ft of you. you've upgraded to 3 rages per day";
				abt[8] = "Level 6: Bear: Carry Capacity doubled, adv. on Str Checks made to interact with objects. Eagle: See up to one mile with no difficulty, dim light doesn't affect you. Wolf: Can track at normal pace. You also now have 4 rages per day";
				abt[12] = "Level 10: Can cast Commune with Nature as a ritual only.";
				abt[17] = "Level 14: Bear: While raging, Creatures have Disadv. on attack rolls within 5 ft of you. Eagle: While raging, gain fly speed = walking speed. Wolf: While raging can use bonus action to know Large or smaller creature prone.";
				break;
			default:
				break;
			}
			switch(level) {
			case 20:
				abt[24] = "Level 20: Strength and Constitution + 4 and maximum cap for those skills increase to 24, you have upgraded to have unlimted rages per day ";
			case 19:
				abt[23] = "Level 19: " + asi;
			case 18:
				abt[22] = "Level 18: if your strength check roll is lower than your actual strength score you can use actual score instead";
			case 17:
				abt[21] = "Level 17: roll three additional weapon damage dice after every crit, you know gain 6 rages per day";
			case 16:
				abt[19] = "Level 16: " + asi;
				abt[20] = "Level 16: your rage now adds +4 to your attacks";
			case 15:
				abt[18] = "Level 15: rage is so fierce that it ends early only if you fall unconscious or if you choose to end it";
			case 14:
			case 13:
				abt[16] = "Level 13: roll two additional weapon damage dice after every crit";
			case 12:
				abt[14] = "Level 12: " + asi;
				abt[15] = "Level 12: You now have 5 rages per day";
			case 11:
				abt[13] = "Level 11: While your raging if you drop to 0 hp you must make a Con. saving throw DC 10 (+5 number of times you have already used this skill) success 1hp else dead, resets after long rest";
			case 10:
			case 9:
				abt[11] = "Level 9: roll one additional weapon damage dice after every crit, your rage now adds +3 to your attacks ";
			case 8:
				abt[10] = "Level 8: " + asi;
			case 7:
				abt[9] = "Level 7: gain advantage on all initiative rolls";
			case 6:
			case 5:
				abt[6] = "Level 5: you can attack twice";
				abt[7] = "Level 5: your speed increases by 10 feet while you aren�t wearing heavy armor";
			case 4:
				abt[5] = "Level 4: " + asi;
			case 3:
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
			switch(archType){
			case valor:
				abt[5] = "Level 3: Prof in medium armor, shields, martial weapons. Also your inspiration can be added to damage or AC by a creature.";
				abt[9] = "Level 6: You can attack twice instead of once when you use the attack action.";
				abt[18] = "Level 14: When you cast a bard spell you can make a weapon attack as a bonus action.";
				break;
				
			
			case lore:
				abt[5] = "Level 3: Gain prof in 3 skills of your choice. Also you can use a reaction to spend an use of inspiration and instead use it to subtract the roll from a creature.";
				abt[9] = "Level 6: Learn 2 spells from any class list(doesn't count against spells known).";
				abt[18] = "Level 14: You can use bardic inspiration for yourself for ability checks.";
				break;
			default:
				break;
			}
			switch(level) {
			case 20:
				abt[24] = "Level 20: When you roll initiative and have no uses of inspiration, you regain one use of it.";
			case 19:
				abt[23] = "Level 19: " + asi;
			case 18:
				abt[22] = "Level 18: Learn 2 spells from any class spell list.";
			case 17:
				abt[21] = "Level 17: Level 5 ability is now d12.";
			case 16:
				abt[20] = "Level 16: " + asi;
			case 15:
				abt[19] = "Level 15: Inspiration die is now d12.";
			case 14:
				abt[17] = "Level 14: Learn 2 spells from any class spell list.";
			case 13:
				abt[16] = "Level 13: Level 5 ability is now d10.";
			case 12:
				abt[15] = "Level 12: " + asi;
			case 11:
				abt[14] = "Level 11: 5th Level spell slot.";
			case 10:
				abt[13] = "Level 10: Inspiration is now d10. Choose 2 more skills to double prof bonus. Learn 2 spells from any class spell list.";
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
			switch(archType){
			case life:
				abt[1] = "Level 1: Gain prof in heavy armor. Also add 2 + spell level when you cast a healing spell of 1st level or higher to heal another creature.";
				abt[2] = "Level 2: Channel Divinity. Turn Undead: Undead make WIS Save. If they fail they are turned. Perserve Life: Divide HP = 5 times your cleric level to creatures within 30 ft of you(Can't restore HP past half of a creature's max HP).";
				abt[7] = "Level 6: Add 2 + spell level when you cast a healing spell of 1st level or higher to heal another creature and add the same bonus to your own HP.";
				abt[10] = "Level 8: When you hit a creature with a weapon attack add 1d8 radiant damge.";
				abt[20] = "Level 17: No need to roll for healing, use max roll everytime (Ex. when rolling 2d6 the toral is always 12).";
				break;
			default:
				break;
			}
			switch(level) {
			case 20:
				abt[23] = "Level 20: Level 10 ability automatically succeeds, no roll required.";
			case 19:
				abt[22] = "Level 19: " + asi;
			case 18:
				abt[21] = "Level 18: You can use Channel Divinity 3 times per short or long rest.";
			case 17:
				abt[19] = "Level 17: Instantly destroy CR 4 undead with Turn Undead.";
			case 16:
				abt[18] = "Level 16: " + asi;
			case 15:
				abt[17] = "Level 15: Level 8 Spell slot.";
			case 14:
				abt[16] = "Level 14: Instantly destroy CR 3 undead with Turn Undead. Extra damage to weapon attacks increases to 2d8 radiant damage.";
			case 13:
				abt[15] = "Level 13: Level 7 Spell slot.";
			case 12:
				abt[14] = "Level 12: " + asi;
			case 11:
				abt[13] = "Level 11: Instantly destroy CR 2 undead with Turn Undead.";
			case 10:
				abt[12] = "Level 10: Call upon your god as an action. Roll percentile, if the number is equal to or lower than your cleric level then your god intervenes how you asked. IF success you can't use this feature for 7 days, otherwise you have to take a long rest.";
			case 9:
				abt[11] = "Level 9: Level 5 Spell slot.";
			case 8:
				abt[9] = "Level 8: Instantly destroy CR 1 undead with Turn Undead. " + asi;
			case 7:
				abt[8] = "Level 7: Level 4 Spell slot.";
			case 6:
				abt[6] = "Level 6: You can use Channel Divinity 2 times per short or long rest.";
			case 5:
				abt[5] = "Level 5: When you use your Turn Undead, undead of CR 1/2 or lower are instantly destroyed.";
			case 4:
				abt[4] = "Level 4: " + asi;
			case 3:
				abt[3] = "Level 3: Level 2 Spell slot.";
			case 2:
			case 1:
				abt[0] = "Level 1: Spellcsting, DC = 8 + prof + WIS, Attack Bonues = + prof + WIS. You can ritual cast. Holy symbol can be arcane focus.";
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
