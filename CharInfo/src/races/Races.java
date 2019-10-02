package races;

public class Races {
		racePossible raceType = null;
		colorPossible colorType = null;
		public Races() {
			
		}
	
		
		public void Races(racePossible RaceType, colorPossible colortype) {
		raceType = RaceType;
		String asi= new String();
		String age = new String();
		String align = new String();
		String speed = new String();
		String extra = new String();
		String extra2 = new String();
		String extra3 = new String();
		String Languages = new String();
		
		
		
		switch (raceType) {
		case dragonborn:
			asi = "Strengh + 1 and Charisma + 2";
			age = "15-150";
			align = "Generally Chaotic Evil";
			speed = "30ft";
			languages = "You can speak"
			switch(colorType) {
			case white:
			case silver:
				extra2 = "15ft Cone (con. save). Cold Damage 2d6 damage if failed save. half as much damage on a successful one.damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level";
			}
			break;
				

		
		
			
		}
	}
	/*public String getAge() {
		return age;
	}*/
}

