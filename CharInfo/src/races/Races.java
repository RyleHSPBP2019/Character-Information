package races;

public class Races {
		racePossible raceType = null;
	public void Races(racePossible RaceType) {
		raceType = RaceType;
		String asi= new String();
		String age = new String();
		String align = new String();
		String speed = new String();
		String extra = new String();
		
		
		
		switch (raceType) {
		case whitedragonborn:
			asi = "Strengh + 1 and Charisma + 2";
			age = "15-150";
			align = "Generally Chaotic Evil";
			speed = "30ft";
			extra = "Cold Damage (Fires in a 15ft cone, con. save)";
			extra = "Cold Damage (Fires in a 15ft cone, con. save)";
			extra = "Cold Damage (Fires in a 15ft cone, con. save)";
			
		}
	}
	public String getAge() {
		return age;
	}
}

