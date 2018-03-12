
import java.util.ArrayList;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class KnoppenApp extends PApplet {
	
	public final int SIZE = 50;
	public final int X = 60;
	public final int Y = 60;
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"KnoppenApp"});
	}
	
	private ArrayList<Knop> knoppen = new ArrayList<>();

	public void setup() {
		background(0);
		
		// set 1
		RadioKnop radio = new RadioKnop(this, X, Y, SIZE, SIZE);			
		knoppen.add(radio);
		RadioKnop radio2 = new RadioKnop(this, X + X, Y, SIZE, SIZE);			
		knoppen.add(radio2);
		RadioKnop radio3 = new RadioKnop(this, X + X * 2, Y, SIZE, SIZE);			
		knoppen.add(radio3);
		
		radio.voegDoelwitToe(radio2);
		radio.voegDoelwitToe(radio3);
		
		radio2.voegDoelwitToe(radio);
		radio2.voegDoelwitToe(radio3);
		
		radio3.voegDoelwitToe(radio);
		radio3.voegDoelwitToe(radio2);
		
		
	}
	
	public void settings() {
		size(400, 400);	
	}
	
	public void draw() {

		for (Knop k : knoppen) {
			k.tekenKnop();
		}
	}
	
	public void mousePressed() {
		for (Knop k : knoppen) {
			if (k.isMuisOverKnop()) {
				k.handelInteractieAf();
			}
		}
	}
}