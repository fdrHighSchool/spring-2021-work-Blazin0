int [][]placement;
color red = color(200,0,0);
color blue = color(0,0,200);
int amount = 4;
void setup(){
  size(650,650);
  placement = new int[amount][amount*2];
  for(int i = 0;i<amount;i++){
    for(int j =0;j<amount*2;j++){
      placement[i][j] = (int)random(5+width);
      System.out.println(placement.length);
    }
  }
} 
  void create() {   
    for(int k = 0;k < amount;k++){
      for(int j = 1; j < amount;j+=4){
        if(placement[k][j] % 2 == 0){
          fill(red);
          rect(placement[k][j]-25,placement[k][j+1]-25, 25,25);
        }
        else{
          fill(blue);
          rect(placement[k][j]-25,placement[k][j+1]-25, 25,25);
        }
   }
 }
}
void draw(){
  background(225);
  create();
}
