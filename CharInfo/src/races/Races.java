package races;

public class Races {
		public Races() {
			racePossible raceType = null;
			subPossible subType = null;
		}
	
		
		public void setRaces(racePossible RaceType, subPossible SubType) {
		racePossible raceType = RaceType;
		subPossible subType = SubType;
		String asi= new String();
		String age = new String();
		String align = new String();
		String size = new String();
		String speed = new String();
		String extra = new String();
		String extra2 = new String();
		String extra3 = new String();
		String extra4 = new String();
		String extra5 = new String();
		String extra6 = new String ();
		String languages = new String();
		String cantrips = new String ();
		
		boolean vision = false;
		
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
			extra2 = "You have proficiency in battleaxes, handaxe, lighhammer. you also have proficiency in artisan's tools such as smith�s tools, brewer�s supplies, or mason�s tools.";
			extra3 = "You can make a intell(history) check on stonework to see when it was made";		
		case elf:
			age = "100-750";
			align = "Generally Chaotic Good";
			size = "Genreally 5ft - 6'5ft";
			vision = true;
			extra = "Proficiency in the Perception skill";
			extra2 = "advantage on saving throws against being charmed, and magic can�t put you to sleep";
			extra3 = "Elves don�t need to sleep. Instead, they meditate deeply";
		case gnome:
			extra ="You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic";
					
		}
		//Sets Sub Race
		switch(subType) {
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
		
		case hill:
			 asi = "Constitution + 1 and Wisdom + 1";
			 extra4 = "Your maximum HP increases by 1 every level";
			 break;
		case mountain:
			asi = "Constitution + 1 and Strength + 2";
			extra4 = " proficiency with light and medium armor";
			break;
			
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
		case nun:
			break;
		}
	}
	/*public String getAge() {
		return age;
	}*/
}

