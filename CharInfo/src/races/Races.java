package races;
import main.Gloabals;
public class Races {
	public racePossible raceType;
	public static subPossible subType;
	public static String cantrips = new String ();
	public static String archName = new String();
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
			Gloabals.line[1] = "Ability Score Improvements: Strengh + 1 and Charisma + 2";
			Gloabals.line[2] = "Age: 15-150";
			Gloabals.line[3] = "Alignment: Generally Chaotic Evil";
			Gloabals.line[4] = "Size: Ggenereally 5 ft to 6 ft";
			Gloabals.line[5] = "Speed: 30ft";
			Gloabals.line[6] = "Languages: You can read, speak, and write in common and draconic";
			break;
		case dwarf:
			Gloabals.line[2] = "Age: 50-350";
			Gloabals.line[3] = "Alignment: Generally Lawful Good";
			Gloabals.line[4] = "Size: Genreally 4ft - 5ft";
			Gloabals.line[5] = "Speed: 25ft";
			vision = true;
			Gloabals.line[6] = "Languages: You can read, speak, and write in common and dwarvish";
			Gloabals.line[7] = "You have advantages on saving rolls against poison, you are also resistance agaisnt poison";
			Gloabals.line[8] = "You have proficiency in battleaxes, handaxe, lighhammer. Choose prof. in mason's, brewer's, or smith's tools.";
			Gloabals.line[9] = "You can make a intell(history) check on stonework to see when it was made";	
			break;
		case elf:
			Gloabals.line[2] = "Age: 100-750";
			Gloabals.line[3] = "Alignment: Generally Chaotic Good";
			Gloabals.line[4] = "Size: Genreally 5ft - 6'5ft";
			vision = true;
			Gloabals.line[7] = "Proficiency in the Perception skill";
			Gloabals.line[8] = "advantage on saving throws against being charmed, and magic can’t put you to sleep";
			Gloabals.line[9] = "Elves don’t need to sleep. Instead, they meditate deeply";
			break;
		case gnome:
			Gloabals.line[7] ="You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic";
			break;
		case halfElf:
			Gloabals.line[0] = "Name: Half Elf";
			Gloabals.line[1] = "Ability Score Improvements: Charisma + 2 and two other ability scores of your choice increase by 1";
			Gloabals.line[2] = "Age: 20 - 180";
			Gloabals.line[3] = "Alignment: Generally True Nertual";
			Gloabals.line[4] = "Size: Generally 5ft - 6ft";
			Gloabals.line[5] = "Speed: 30ft";
			vision = true;
			Gloabals.line[7] = "advantage on saving throws against being charmed, and magic can’t put you to sleep";
			Gloabals.line[8] = "You gain proficiency in two skills of your choice";
			Gloabals.line[6] = "Languages: You can speak, read, and write Common, Elvish, and one extra language of your choice";
			break;
		case halfling:
			Gloabals.line[2] = "Age: 20 - 200";
			Gloabals.line[3] = "Alignment: Generally Lawful Good";
			Gloabals.line[4] = "Size: Genereally 3ft tall";
			Gloabals.line[5] = "Speed: 25ft";
			Gloabals.line[7] = "When you roll a 1 on the d20 for an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll";
			Gloabals.line[8] = "You have advantage on saving throws against being frightened";
			Gloabals.line[9] = "You can move through the space of any creature that is of a size larger than yours";
			Gloabals.line[6] = "Languages: You can speak, read, and write Common and Halfling";
			break;
		case halfOrc:
			Gloabals.line[0] = "Name: Half Orc";
			Gloabals.line[1] = "Ability Score Improvements: Strength + 2 and Constitution + 1";
			Gloabals.line[2] = "Age: 14 to 75";
			Gloabals.line[3] = "Alignment: Chaotic Neutral";
			Gloabals.line[4] = "Size: Generally 5ft to well over 6ft";
			Gloabals.line[5] = "Speed: 30ft";
			vision = true;
			Gloabals.line[7] = "You gain proficiency in the Intimidation skill";
			Gloabals.line[8] = "When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest";
			Gloabals.line[9] = "When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit";
			Gloabals.line[6] = "Languages: You can speak, read, and write Common and Orc";
			break;
		case human:
			Gloabals.line[0] = "Name: Human";
			Gloabals.line[1] = "Ability Score Improvements: All Abilities + 1";
			Gloabals.line[2] = "Age: 18 to 100";
			Gloabals.line[3] = "Alignment: Genereally true neutral";
			Gloabals.line[4] = "Size: Ggenereally 5 ft to 6 ft";
			Gloabals.line[5] = "Speed: 30ft";
			Gloabals.line[6] = "Languages: You can speak, read, and write Common and one extra language of your choice";
			break;
		case tiefling:
			Gloabals.line[0] = "Name: Tiefling";
			Gloabals.line[1] = "Ability Score Improvements: Intelligence + 1 and Charisma + 2";
			Gloabals.line[2] = "Age: 18 to 120";
			Gloabals.line[3] = "Alignment: Genereally Chaotic Evil";
			Gloabals.line[4] = "Size: Genereally 5 ft to 6 ft";
			Gloabals.line[5] = "Speed: 30ft";
			vision = true;
			Gloabals.line[7] = "You have resistance to fire damage";
			Gloabals.line[8] = "You know the thaumaturgy cantrip";
			Gloabals.line[6] = "Languages: You can speak, read, and write Common and Infernal";
			break;
		default:
			break;
		
		}
		//Sets Sub Race
		switch(subType) {
		//Dragonborn Subraces
		case white:
		case silver:
			Gloabals.line[0] = "White or Silver Dragonborn";
			Gloabals.line[7] = "15ft Cone (con. save). Cold Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			Gloabals.line[8] ="You are also resistant to Cold damage";
			break;
		case green:
			Gloabals.line[0] = "Green Dragonborn";
			Gloabals.line[7] = "15ft Cone (con. save). Poison Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			Gloabals.line[8] ="You are also resistant to Poison damage";
			break;
		case black:
		case copper:
			Gloabals.line[0] = "Black or Copper Dragonborn";
			Gloabals.line[7] = "5 by 30 ft. line (Dex. save). Acid Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			Gloabals.line[8] ="You are also resistant to Acid damage";
			break;
		case blue:
		case bronze:
			Gloabals.line[0] = "Blue or Bronze Dragonborn";
			Gloabals.line[7] = "5 by 30 ft. line (Dex. save). Lightning Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			Gloabals.line[8] ="You are also resistant to Lightning damage";
			break;
		case red:
		case gold:
			Gloabals.line[0] = "Red or Gold Dragonborn";
			Gloabals.line[7] = "5 by 30 ft. line (Dex. save). Fire Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			Gloabals.line[8] ="You are also resistant to Fire damage";
			break;
		case brass:
			Gloabals.line[0] = "Brass Dragonborn";
			Gloabals.line[7] = "15ft Cone (con. save). Fire Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			Gloabals.line[8] ="You are also resistant to Fire damage";
			break;
		//Dwarf Subraces
		case hill:
			Gloabals.line[0] = "Hill Dwarf";
			 Gloabals.line[1] = "Ability Score Improvements: Constitution + 1 and Wisdom + 1";
			 Gloabals.line[10] = "Your maximum HP increases by 1 every level";
			 break;
		case mountain:
			Gloabals.line[0] = "Mountain Dwarf";
			Gloabals.line[1] = "Ability Score Improvements: Constitution + 1 and Strength + 2";
			Gloabals.line[10] = "Proficiency with light and medium armor";
			break;
		//Elf Subraces
		case high:
			Gloabals.line[0] = "High Elf";
			Gloabals.line[1] = "Ability Score Improvements: Dexterity + 2 and Intelligence + 1";
			Gloabals.line[5] = "Speed: 30ft";
			Gloabals.line[10] = "Proficiency with the longsword, shortsword, shortbow, and longbow";
			Gloabals.line[11] = "You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it";
			Gloabals.line[6] = "Languages: You can read, speak, and write in common and elvish + 1 extra language of your choice";
			break;
		case wood:
			Gloabals.line[0] = "Wood Elf";
			Gloabals.line[1] = "Ability Score Improvements: Dexterity + 2 and Wisdom + 1";
			Gloabals.line[5] = "Speed: 35ft";
			Gloabals.line[10] = "proficiency with the longsword, shortsword, shortbow, and longbow";
			Gloabals.line[11] = "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena";
			Gloabals.line[6] = "Languages: You can read, speak, and write in common and elvish";
			break;
		//Gnome Subraces
		case deep:
			Gloabals.line[0] = "Deep Gnome";
			Gloabals.line[1] = "Ability Score Improvements: Intelligence + 2 and Dexterity + 1";
			Gloabals.line[3] = "Generally Netrual";
			Gloabals.line[2] = "20 - 250";
			Gloabals.line[4] = "Generally 3 to 3'6";
			Gloabals.line[5] = "Speed: 25ft";
			vision = true;
			Gloabals.line[8] = " advantage on Dexterity (stealth) checks to hide in rocky terrain";
			Gloabals.line[6] = "Languages: You can read, speak, and write in Common, Gnomish, and Undercommon";
			break;
		case rock:
			Gloabals.line[0] = "Rock Gnome";
			Gloabals.line[1] = "Ability Score Improvements: Constitution + 1 and Intelligence + 2";
			Gloabals.line[3] = "Generally Netrual";
			Gloabals.line[2] = "40 - 350";
			Gloabals.line[4] = "Generally 3 to 4";
			Gloabals.line[5] = "Speed: 25ft";
			vision = true;
			Gloabals.line[6] = "Languages: You can read, speak, and write in Common and Gnomish";
			Gloabals.line[8] = "Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply";
			Gloabals.line[9] = "You have proficiency with artisan’s tools (tinker’s tools)";
			break;
		//Halflings Subraces
		case light:
			Gloabals.line[0] = "Light Halfling";
			Gloabals.line[1] = "Ability Score Improvements: Charisma + 1 and Dexterity + 2";
			Gloabals.line[10] = "You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you";
			break;
		case stout:
			Gloabals.line[0] = "Stout Halfling";
			Gloabals.line[1] = "Ability Score Improvements: Constitution + 1 and Dexterity + 2";
			Gloabals.line[10] = "You have advantage on saving throws against poison, and you have resistance against poison damage";
			break;
		case nun:
			Gloabals.line[0] = "";
			break;
		}
	}
}

