int getal1, getal2;
float resultaat;

void setup() {
  getal1 = 5;
  getal2 = 2;
  floatDelen();
  println(resultaat);//onnodig.
}

void floatDelen() {
  float f1 = (float)getal1; //je maakt van een float een float.
  float f2 = (float)getal2;
  resultaat = f1 / f2; //je zou gewoon hier een println kunnen doen, dan is hij in de setup niet nodig.
}