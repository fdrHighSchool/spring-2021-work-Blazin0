  
PShape square;  // The PShape object
PShape circle;
void setup() {
  size(500, 500);//size of the window
  // Creating the PShape as a square. The
  // numeric arguments are similar to rect().
  background(184, 216, 211);
  noStroke();
}
void draw() {
  
  circle(50,50,50);
  rect(50,50,50, 60);
  fill(124,148,159,255);
  point(50,100);
  square(50,50,50);
}
