package races;

public class Races {
		racePossible raceType = null;
	public void Races(racePossible RaceType) {
		raceType = RaceType;
		String asi= new String();
		String age = new String();
		String align = new String();
		String extra = new String();
		
		
		switch (raceType) {
		case whitedragonborn:
			asi = "Strengh + 1 and Charisma + 2";
			age = "15-150";
			align = "Generally Chaotic Evil";
		}
	}
	/*public String getAge() {
		return age;
	}*/
}

