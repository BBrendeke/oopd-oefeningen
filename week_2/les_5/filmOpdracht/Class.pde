class KaartjesAutomaat {

  float prijs,
        ingeworpenGeld,
        totaal;
  String titel;
  boolean voldoendeBetaald;
  
  KaartjesAutomaat(float prijs, String titel) {

    this.prijs = prijs;
    this.titel = titel;
  }


  void werpGeldIn(float ingeworpenGeld) {

    this.ingeworpenGeld += ingeworpenGeld;
  }
  void leegAutomaat() {

    this.totaal = 0;
  }

  void voldoendeBetaald() {

    if (this.ingeworpenGeld >= this.prijs) {

      this.voldoendeBetaald = true;
      this.totaal += this.prijs;
    } else { 

      this.voldoendeBetaald = false;
    }
  }

  float wisselgeld() {

    float wisselgeld;
    if (ingeworpenGeld - prijs > 0) {

      wisselgeld = ingeworpenGeld - prijs;
    } else {

      wisselgeld = 0;
    }

    return wisselgeld;
  }

  String toString() {

    String resultaat = "";

    if (voldoendeBetaald) {

      resultaat = "Kaartje gekocht voor de film: " + titel  + "\n" + "Prijs: €" + prijs + "\n" + "Het wisselgeld bedraagt: €" + wisselgeld() ;
    } else if (!voldoendeBetaald) {

      resultaat = "De prijs voor de film bedraagt: €" + prijs + "\n" + "U heeft het volgende bedrag ingeworpen: €" + ingeworpenGeld
        + "\n" + "Het resterende bedrag bedraagt: €" + (prijs - ingeworpenGeld);
    }



    return resultaat;
  }
}

class film {

}