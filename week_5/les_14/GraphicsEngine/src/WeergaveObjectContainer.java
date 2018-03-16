import java.util.ArrayList;

import processing.core.PApplet;

public class WeergaveObjectContainer extends WeergaveObject {
	
	protected ArrayList<WeergaveObject> weergaveLijst = new ArrayList<>();
	
	public WeergaveObjectContainer(float x, float y) {
		super(x, y, 0, 0);
	}
		
	public void voegToe(WeergaveObject wObject) {
		weergaveLijst.add(wObject);
	}
	
	public void verwijder(WeergaveObject wObject) {
		weergaveLijst.remove(wObject);
	}
	
	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		for(WeergaveObject wObject : weergaveLijst) {
			wObject.geefWeer(app, startX + x, startY + y);
		}		
	}

	@Override
	protected boolean isMuisBinnen(int mouseX, int mouseY) {
		if (mouseX >= x && mouseX < x + breedte && mouseY >= y && mouseY < y + hoogte) {
			return true;
		} else {
			return false;
		}
	}	
}
