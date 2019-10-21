package classesPack;

public class dndClasses {
	public classPoss classType;
	public archPoss archType;
	public warlockPact pactType;
	
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
		String fourAbt1 = new String();
		String threeAbt1 = new String();
		String twoAbt1 = new String();
		String oneAbt1 = new String();
		
		
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
				fourteenAbt1 = "";
			case 13:
				thirteenAbt1 = "";
			case 12:
				twelveAbt1 = asi;
			case 11:
				elevenAbt1 = "";
			case 10:
				tenAbt1 = "";
			case 9:
				nineAbt1 = "";
			case 8:
				eightAbt1 = asi;
			case 7:
				sevenAbt1 = "";
			case 6:
				sixAbt1 = "";
			case 5:
				fiveAbt1 = "";
			case 4:
				fourAbt1 = asi;
			case 3:
				threeAbt1 = "";
			case 2:
				twoAbt1 = "";
			case 1:
				oneAbt1 = "";
				break;
			}
			switch(archType) {
			
			case berserker:
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
