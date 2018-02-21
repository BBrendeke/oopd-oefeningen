Slider eenSlider;

void setup() {
  size(300, 200);
  background(0);
  eenSlider = new Slider();
}

void draw() {
  eenSlider.tekenSlider();
  println(eenSlider);
}