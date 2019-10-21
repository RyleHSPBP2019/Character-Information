package backgroundPack;

public class backgrounds {
	public backgroundPoss background;
	public backgrounds() {
		background = backgroundPoss.none;
		}
	public void setBackground(backgroundPoss b)
	{
		background = b;
		switch(background) {
		case acolyte:
			break;
		case charlatan:
			break;
		case criminal:
			break;
		case entertainer:
			break;
		case folkHero:
			break;
		case guildArtisan:
			break;
		case hermit:
			break;
		case noble:
			break;
		case outlander:
			break;
		case pirate:
			break;
		case sage:
			break;
		case sailor:
			break;
		case soldier:
			break;
		case spy:
			break;
		case urchin:
			break;
		default:
			break;
		}
	}
}
