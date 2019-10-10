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
		
		switch (classType) {
		case barbarian:
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
