class Student{
  String voornaam, achternaam;
  int nummer;
  
  Student(String voornaam, String achternaam, int nummer){
    this.voornaam = voornaam;
    this.achternaam = achternaam;
    this.nummer = nummer;
  }
  String toString(){
    return voornaam + achternaam + nummer;
  }
}

void setup(){
  Student Niels = new Student("Niels", "Engelharf" , 42069710);
  println(Niels);
}