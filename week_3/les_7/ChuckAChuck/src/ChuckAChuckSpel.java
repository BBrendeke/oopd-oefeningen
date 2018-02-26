
public class ChuckAChuckSpel {
	DobbelBeker dobbelBeker = new DobbelBeker();
	int waarde[] = dobbelBeker.driecijfers[];
	int ogen;
	int inzet;
	int verdubbelaar;
	
	ChuckAChuckSpel(int ogen, int inzet) {
		this.ogen = ogen;
		this.inzet = inzet;
	}
	private int gewonnen() {
		verdubbelaar = 0;
		for(int i; i<3; i++) {
			if(waarde[i] == ogen) {
				switch (verdubbelaar) {
				case 0:
					verdubbelaar = 1;
					break;
				case 1:
					verdubbelaar = 2;
					break;
				case 2:
					verdubbelaar = 10;
					break;
				}
			}
		}
		return inzet * verdubbelaar;
	}
}
