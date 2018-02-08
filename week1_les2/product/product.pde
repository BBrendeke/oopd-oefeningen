class Product {
  String naam;
  int prijs;
  
  Product(String naam, int prijs){
  this.naam = naam;
  this.prijs = prijs;
  }
}



void setup() {
  Product product1 = new Product("pc", 2500);
  Product product2 = new Product("mac", 2000);

  Product[] producten = {product1, product2};
  
  for (int i = 0; i < producten.length; i++) {
    println(producten[i].naam + " kost: " + producten[i].prijs + " euro");
  }
}