int ys = 5;
int f = 5;
int score = 0;
int randy = (int) random(width);
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
void setup(){
  size(600, 600);
}

void draw(){
  background(255, 255, 255);
  fill(0, 0, 255);
  stroke(4, 6, 244);
  ellipse(randy, ys, 10, 10);
  rect(mouseX, 585, 16, 16);
  fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
  ys+=f;
  if(ys==585){
    checkCatch(randy);
  }
  if(ys>=600){
    ys=5;
    randy = (int) random(width);
   if(score>=20){
     f=10;
    if(score<20){
      f=5;
    }
   }
  }
}
