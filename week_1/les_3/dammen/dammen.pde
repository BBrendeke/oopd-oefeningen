Damsteen wit1;
Damsteen wit2;
Damsteen zwart1;
Damsteen zwart2;

int[][] stenen = {
{100, 100, 50, 255},
{100, 175, 50, 255},
{200, 200, 50, 0},
{200, 275, 50, 0}
};

void setup() {
  size(500, 500);
  for(int i = 1; i < 3; i++){
  wit = new Damsteen(stenen[][], 100, 50, 255);
  zwart1 = new Damsteen(200, 200, 50, 0);
  }
}

void draw() {
  background(175);
  wit1.tekenDamSteen();
  zwart1.tekenDamSteen();
}