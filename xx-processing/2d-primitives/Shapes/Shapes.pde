  
PShape square;  // The PShape object
PShape circle;
int size = 5;
int temp = size;
int R = 0;
int G = 0;
int B = 0;
void setup() {
  size(1000, 900);//size of the window
  // Creating the PShape as a square. The
  // numeric arguments are similar to rect().
  background(184,216,211);
  noStroke();
}
void draw() {
  fill(255);
  square(240, 110, 120);
  fill(58,78,105);
  circle(300, 170, 100);
  fill(58,78,105);
  circle(300,170,100);
  fill(224,178,100);
  rect(240, 225, 120, 120);
  fill(0, 51, 90);
  circle(330, 260, 25);
  fill(184,216,211);
  triangle(330, 253, 336, 265, 324, 265);
  fill(255);
  circle(260, 290, 17);
  fill(184,216,211);
  rect(318, 280, 23, 4);
  circle(260, 240, 17);
  
  fill(222,236,219);
  rect(318, 290, 23, 4);
  circle(260, 265, 17);
  
}
