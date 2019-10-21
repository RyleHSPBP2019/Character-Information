package races;

public class Races {
	public static racePossible raceType;
	public static subPossible subType;
	public String asi= new String();
	public static String age = new String();
	public static String align = new String();
	public static String size = new String();
	public static String speed = new String();
	public static String extra = new String();
	public static String extra2 = new String();
	public static String extra3 = new String();
	public static String extra4 = new String();
	public static String extra5 = new String();
	public static String extra6 = new String ();
	public static String languages = new String();
	public static String cantrips = new String ();
	public static String name = new String();
	public static boolean vision = false;
		public Races() {
			raceType = racePossible.none;
			subType = subPossible.nun;
		}
	
		
		public void setRaces(racePossible RaceType, subPossible SubType) {
		raceType = RaceType;
		subType = SubType;
		
		//Sets Base Race
		switch (raceType) {
		case dragonborn:
			
			asi = "Strengh + 1 and Charisma + 2";
			age = "15-150";
			align = "Generally Chaotic Evil";
			speed = "30ft";
			languages = "You can read, speak, and write in common and draconic";
			break;
		case dwarf:
			age = "50-350";
			align = "Generally Lawful Good";
			size = "Genreally 4ft - 5ft";
			speed = "25ft";
			vision = true;
			languages = "You can read, speak, and write in common and dwarvish";
			extra = "You have advantages on saving rolls against poison, you are also resistance agaisnt poison";
			extra2 = "You have proficiency in battleaxes, handaxe, lighhammer. you also have proficiency in artisan's tools such as smith’s tools, brewer’s supplies, or mason’s tools.";
			extra3 = "You can make a intell(history) check on stonework to see when it was made";		
		case elf:
			age = "100-750";
			align = "Generally Chaotic Good";
			size = "Genreally 5ft - 6'5ft";
			vision = true;
			extra = "Proficiency in the Perception skill";
			extra2 = "advantage on saving throws against being charmed, and magic can’t put you to sleep";
			extra3 = "Elves don’t need to sleep. Instead, they meditate deeply";
		case gnome:
			extra ="You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic";
			break;
		case halfElf:
			asi = "Charisma + 2 and two other ability scores of your choice increase by 1";
			age = "20 - 180";
			align = "Generally True Nertual";
			size = "Generally 5ft - 6ft";
			speed = "30ft";
			vision = true;
			extra = "advantage on saving throws against being charmed, and magic can’t put you to sleep";
			extra2 = "You gain proficiency in two skills of your choice";
			languages = "You can speak, read, and write Common, Elvish, and one extra language of your choice";
			break;
		case halfling:
			age = "20 - 200";
			align = "generally Lawful Good";
			size = "genereally 3ft tall";
			speed = "25ft";
			extra = "When you roll a 1 on the d20 for an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll";
			extra2 = "You have advantage on saving throws against being frightened";
			extra3 = "You can move through the space of any creature that is of a size larger than yours";
			languages = "You can speak, read, and write Common and Halfling";
			break;
		case halfOrc:
			asi = "Strength + 2 and Constitution + 1";
			age = "14 to 75";
			align = "Chaotic Neutral";
			size = "generally 5ft to well over 6ft";
			speed = "30ft";
			vision = true;
			extra = "You gain proficiency in the Intimidation skill";
			extra2 = "When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest";
			extra3 = "When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit";
			languages = "You can speak, read, and write Common and Orc";
			break;
		case human:
			asi = "Ability + 1";
			age = "18 to 100";
			align = "genereally true neutral";
			size = "genereally 5 ft to 6 ft";
			speed = "30ft";
			languages = "You can speak, read, and write Common and one extra language of your choice";
			break;
		case tiefling:
			asi = "Intelligence + 1 and Charisma + 2";
			age = "18 to 120";
			align = "genereally Chaotic Evil";
			size = "genereally 5 ft to 6 ft";
			speed = "30ft";
			vision = true;
			extra = "You have resistance to fire damage";
			extra2 = "You know the thaumaturgy cantrip";
			languages = "You can speak, read, and write Common and Infernal";
			break;
		default:
			break;
		
		}
		//Sets Sub Race
		switch(subType) {
		//Dragonborn Subraces
		case white:
		case silver:
			extra = "15ft Cone (con. save). Cold Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			extra2 ="You are also resistant to Cold damage";
			break;
		case green:
			extra = "15ft Cone (con. save). Poison Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			extra2 ="You are also resistant to Poison damage";
			break;
		case black:
		case copper:
			extra = "5 by 30 ft. line (Dex. save). Acid Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			extra2 ="You are also resistant to Acid damage";
			break;
		case blue:
		case bronze:
			extra = "5 by 30 ft. line (Dex. save). Lightning Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			extra2 ="You are also resistant to Lightning damage";
			break;
		case red:
		case gold:
			extra = "5 by 30 ft. line (Dex. save). Fire Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			extra2 ="You are also resistant to Fire damage";
			break;
		case brass:
			extra = "15ft Cone (con. save). Fire Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			extra2 ="You are also resistant to Fire damage";
			break;
		//Dwarf Subraces
		case hill:
			 asi = "Constitution + 1 and Wisdom + 1";
			 extra4 = "Your maximum HP increases by 1 every level";
			 break;
		case mountain:
			asi = "Constitution + 1 and Strength + 2";
			extra4 = " proficiency with light and medium armor";
			break;
		//Elf Subraces
		case high:
			asi = "Dexterity + 2 and Intelligence + 1";
			speed = "30ft";
			extra4 = "Proficiency with the longsword, shortsword, shortbow, and longbow";
			cantrips = "You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it";
			languages = "You can read, speak, and write in common and elvish + 1 extra language of your choice";
			break;
		case wood:
			asi = "Dexterity + 2 and Wisdom + 1";
			speed = "35ft";
			extra4 = "proficiency with the longsword, shortsword, shortbow, and longbow";
			extra5 = "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena";
			languages = "You can read, speak, and write in common and elvish";
			break;
		//Gnome Subraces
		case deep:
			asi = "Intelligence + 2 and Dexterity + 1";
			align = "Generally Netrual";
			age = "20 - 250";
			size = "Generally 3 to 3'6";
			speed = "25ft";
			vision = true;
			extra2 = " advantage on Dexterity (stealth) checks to hide in rocky terrain";
			languages = "You can read, speak, and write in Common, Gnomish, and Undercommon";
			break;
		case rock:
			asi = "Constitution + 1 and Intelligence + 2";
			align = "Generally Netrual";
			age = "40 - 350";
			size = "Generally 3 to 4";
			speed = "25ft";
			vision = true;
			languages = "You can read, speak, and write in Common and Gnomish";
			extra2 = "Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply";
			extra3 = "You have proficiency with artisan’s tools (tinker’s tools)";
			break;
		//Halflings Subraces
		case light:
			asi = "Charisma + 1 and Dexterity + 2";
			extra4 = "You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you";
			break;
		case stout:
			asi = "Constitution + 1 and Dexterity + 2";
			extra4 = "You have advantage on saving throws against poison, and you have resistance against poison damage";
			break;
		case nun:
			break;
		}
	}
	/*public String getAge() {
		return age;
	}*/
}

