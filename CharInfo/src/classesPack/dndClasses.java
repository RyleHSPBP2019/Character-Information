package classesPack;

public class dndClasses {
	public dndClasses() {
		archPoss archType = archPoss.none;
		classPoss classType = classPoss.none;
		warlockPact pactType = warlockPact.none;
	}
	public void setClass(archPoss Archtype, classPoss ClassType, warlockPact PactType, int lvl) {
		classPoss classType = ClassType;
		archPoss archType = Archtype;
		warlockPact pactType = PactType;
		int level = lvl;
		
		String asi = "increase one ability score by 2 or increase two ability scores by 1 ";
		String twentyAbt1 = new String();
		String nineteenAbt1 = new String();
		String eightteenAbt1 = new String();
		String seventeenAbt1 = new String();
		String sixteenAbt1 = new String();
		String fifthteenAbt1 = new String();
		String fourteenAbt1 = new String();
		String thirteenAbt1 = new String();
		String twelveAbt1 = new String();
		String elevenAbt1 = new String();
		String tenAbt1 = new String();
		String nineAbt1 = new String();
		String eightAbt1 = new String();
		String sevenAbt1 = new String();
		String sixAbt1 = new String();
		String fiveAbt1 = new String();
		String fiveAbt2 = new String();
		String fourAbt1 = new String();
		String threeAbt1 = new String();
		String twoAbt1 = new String();
		String twoAbt2 = new String();
		String oneAbt1 = new String();
		String oneAbt2 = new String();
		String feat = new String();
		String feat2 = new String();
		String feat3 = new String();
		String feat4 = new String();
		String proficiencyBonus = new String();
		
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
			switch(level) {
			case 20:
				twentyAbt1 = "Strength and Constitution + 4 and maximum cap for those skills increase to 24";
			case 19:
				nineteenAbt1 = asi;
			case 18:
				eightteenAbt1 = "if your strength check roll is lower than your actual strength score you can use actual score instead";
			case 17:
				seventeenAbt1 = "roll three additional weapon damage dice after every crit";
			case 16:
				sixteenAbt1 = asi;
			case 15:
				fifthteenAbt1 = "rage is so fierce that it ends early only if you fall unconscious or if you choose to end it";
			case 14:
				fourteenAbt1 = feat4;
			case 13:
				thirteenAbt1 = "roll two additional weapon damage dice after every crit";
			case 12:
				twelveAbt1 = asi;
			case 11:
				elevenAbt1 = "your rage can keep you fighting despite grievous wounds";
			case 10:
				tenAbt1 = feat3;
			case 9:
				nineAbt1 = "roll one additional weapon damage dice after every crit";
			case 8:
				eightAbt1 = asi;
			case 7:
				sevenAbt1 = "gain advantage on all initiative rolls";
			case 6:
				sixAbt1 = feat2;
			case 5:
				fiveAbt1 = "you can attack twice";
				fiveAbt2 = " your speed increases by 10 feet while you aren�t wearing heavy armor";
			case 4:
				fourAbt1 = asi;
			case 3:
				threeAbt1 = feat;
			case 2:
				twoAbt1 = "you can throw aside all concern for defense to attack with fierce desperation";
				twoAbt2 = "you gain an uncanny sense of when things nearby aren�t as they should be, giving you an edge when you dodge away from danger";
			case 1:
				oneAbt1 = "while i rage You have adv on Strength checks and Strength saving throws, you make a melee weapon attack using Strength, You have resistance to bludgeoning, piercing, and slashing damage";
				oneAbt2 = "While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit";
				break;
			}
			switch(archType) {
			
			case berserker:
				feat = "you can go into a frenzy when you rage, your rage you can make a single melee weapon attack as a bonus action on each of your turns after this one";
				feat2 = "you can�t be charmed or frightened while raging";
				feat3 = "you can use your action to frighten someone, choose one creature that you can see within 30 feet.it must succeed on a Wisdom saving throw (DC equal to 8 + your proficiency bonus + your Charisma modifier) or be frightened of you until the end of your next turn.";
				feat4 = "when you take damage from a creature that is within 5 feet of you, you can use your reaction to make a melee weapon attack against that creature";
				break;
				
			
			case totem:
				break;
			}
				
		
			break;
		case bard:
			break;
		case cleric:
			break;
		case druid:
			break;
		case fighter:
			break;
		case monk:
			break;
		case paladin:
			break;
		case ranger:
			break;
		case rogue:
			break;
		case sorcerer:
			break;
		case warlock:
			break;
		case wizard:
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
