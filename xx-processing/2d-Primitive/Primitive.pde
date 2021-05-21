  
PShape square;  // The PShape object
PShape circle;
void setup() {
  size(500, 500);//size of the window
  // Creating the PShape as a square. The
  // numeric arguments are similar to rect().
  circle = createShape(CIRCLE, );
  square = createShape(RECT, 0, 0, 50, 50);
  square.setFill(color(0,0,225));
  background(184, 216, 211);
  square.setStroke(false);
}
void draw() {
  shape(circle,)
  shape(square, 50, 50);
  point(50,100);
  shape(square, 50, 50);
}
