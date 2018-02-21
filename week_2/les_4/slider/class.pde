class Slider {
  float x, y, breedte, hoogte;
  int nPosities, positie;
  float blokjeBreedte = breedte / nPosities;

  Slider() {
    breedte = 200;
    hoogte = 50;
    x = (width - breedte) / 2;
    y = 50;
    nPosities = 5;
    positie = bepaalSliderPositie();
  }
  Slider(float x, float y, float breedte, float hoogte, int nPosities, int positie) {
    this.x = x;
    this.y = y;
    this.breedte = breedte;
    this.hoogte = hoogte;
    this.nPosities = nPosities;
    this.positie = positie;
  }
  void tekenSlider() {
    noStroke();
    fill(255);
    rect(x, y, breedte, hoogte);

    fill(#2257F0);
    rect(x + positie * blokjeBreedte, y, blokjeBreedte, hoogte);
  }
  int bepaalSliderPositie() {
    
    if (mouseX < x) {
      return 0;
    } else if (mouseX >= breedte + x) {
      return nPosities - 1;
    } else {
      return floor((mouseX  - x) / blokjeBreedte);
    }
  }
  String toString(){
    return "De waarde van de slider is: " + x;
  }
}