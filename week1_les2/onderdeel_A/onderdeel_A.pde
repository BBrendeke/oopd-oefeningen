void setup() {
  String[] productNaam = {"pc", "mac"};
  
  
  int[] productPrijs = {500, 2000};

  for(int i = 0; i<productNaam.length; i++){
  
  println(productNaam[i] + " kost: " + productPrijs[i] + " euro");

  }
}