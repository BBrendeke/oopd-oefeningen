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
        for (WeergaveObject wObject: weergaveLijst) {
            wObject.geefWeer(app, wObject.x + startX, wObject.y + startY);
        }
    }

	@Override
	protected boolean isMuisBinnen(int muisX, int muisY) {
		for(WeergaveObject wObject : weergaveLijst) {
			if(wObject.isMuisBinnen((int)(muisX - x), (int)(muisY - y))) {
				return true;
			}
		}
		return false;
	}	
}
