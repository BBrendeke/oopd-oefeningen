KaartjesAutomaat fiftyShades = new KaartjesAutomaat(5.00, "Fifty Shades"); 
KaartjesAutomaat blackPanter = new KaartjesAutomaat(7.50, "Black Panter"); 
void setup() { 

 
  fiftyShades.werpGeldIn(10.05);
  fiftyShades.voldoendeBetaald();
  println(fiftyShades);
  blackPanter.werpGeldIn(10.00);
  blackPanter.voldoendeBetaald();
  println(blackPanter);
  println(fiftyShades.totaal);
}

void draw() {
}