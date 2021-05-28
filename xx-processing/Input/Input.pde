PShape circle;
  int i = 1;
void setup(){
   size(550,550);
   background(250);
   strokeWeight(1);
}
  void draw(){
      if(key == 'e' && keyPressed){
        background(250);
      }
      //shape(circle,mouseX,mouseY);
      if(mousePressed){
         float r = random(255);
         float g = random(255);
         float b = random(255);
         stroke(r,g,b);
         line(mouseX,mouseY,pmouseX,pmouseY);
      }
      if(key =='w' && keyPressed){
         strokeWeight(i+1);
         if(i <= 25){
           i = i + 1;
         }
         
      }
      if(key =='s' && keyPressed){
         if(i >=2){
           i = i - 1;
         }
         strokeWeight(i-1);
      }
  }
