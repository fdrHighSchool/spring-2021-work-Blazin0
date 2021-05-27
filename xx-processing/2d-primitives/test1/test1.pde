PShape circle;
void setup(){
   size(550,550);
   background(250);
   circle = createShape(ELLIPSE, 0, 0, 40, 40);
   stroke(2);
}
  void draw(){
    
      //shape(circle,mouseX,mouseY);
      if(mousePressed){
         float r = random(255);
         float g = random(255);
         float b = random(255);
         stroke(r,g,b);
         line(mouseX,mouseY,pmouseX,pmouseY);
      }
      if(keyPressed){
      background(250);
      }
      
  }
