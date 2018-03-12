import processing.core.PApplet;

public abstract class Figuur extends WeergaveObject{

	protected int vulkleur;
	
	public Figuur(float x, float y, float hoogte, float breedte, int vulkleur) {
		super(x, y, hoogte, breedte);
		this.vulkleur = vulkleur;
	}
	
	@Override
	public abstract void geefWeer(PApplet app, float startX, float startY);

	@Override
	protected abstract boolean isMuisBinnen(int muisX, int muisY);
	
	public int getVulkleur() {
		return vulkleur;
	}

	public void setVulkleur(int vulkleur) {
		this.vulkleur = vulkleur;
	}
	
	
}
