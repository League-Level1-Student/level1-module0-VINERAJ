PImage backgroundImage;
import ddf.minim.*;
  Minim minim;
  AudioSample sound;
int xpo = 300;
int ypo = 300;
int s = 5;
int s1 = 4;
void setup(){
  backgroundImage = loadImage("pong.png");
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  size(600, 600);
  background(0, 0, 255);
}

void draw(){
  background(0, 0, 255);
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, 600, 600);
  fill(255, 0, 0);
  stroke(255, 136, 149);
  ellipse(xpo, ypo, 20, 20);
  rect(mouseX, 590, 60, 10);
  xpo+=s;
  ypo+=s1;
  if(xpo>width||xpo<0){
    s=-s;
  }
  if(ypo>height||ypo<0){
    s1=-s1;
  }
  if(ypo==height){
    sound.trigger();
  }
  if(ypo==590){
    if(xpo==mouseX){
      s1=-s1;
    }
  }
}
