import java.util.ArrayList;

import processing.core.PApplet;

public class GraphicsEngineApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main("GraphicsEngineApp");
	}

	protected ArrayList<WeergaveObject> weergaveLijst = new ArrayList<WeergaveObject>();
	public WeergaveObjectContainer woc = new WeergaveObjectContainer(50, 50);

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		weergaveLijst.add(woc);
		
		Rechthoek r1 = new Rechthoek(20, 20, 100, 100, 40);
		Rechthoek r2 = new Rechthoek(40, 40, 100, 100, 60);
		woc.voegToe(r1);
		woc.voegToe(r2);
	}

	public void draw() {
		background(255);
		for (WeergaveObject wo : weergaveLijst) {
			wo.geefWeer(this, wo.x, wo.y);
			//wo.doeStap();
		}
	}

	public void mousePressed() {
		for (WeergaveObject wo : weergaveLijst) {
			if (wo.isMuisBinnen(mouseX, mouseY)) {
				System.out.println("Hallo");
				woc.verwijder(wo);
			}
		}
	}
}