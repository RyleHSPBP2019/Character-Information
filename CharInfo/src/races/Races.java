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
		String speed = new String();
		String extra = new String();
		String extra2 = new String();
		String extra3 = new String();
		String languages = new String();
		
		
		//Sets Base Race
		switch (raceType) {
		case dragonborn:
			asi = "Strengh + 1 and Charisma + 2";
			age = "15-150";
			align = "Generally Chaotic Evil";
			speed = "30ft";
			languages = "You can read, speak, and write in common and draconic";
			break;
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
		}
	}
	/*public String getAge() {
		return age;
	}*/
}

