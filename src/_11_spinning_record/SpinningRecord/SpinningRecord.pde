import ddf.minim.*;
PImage pictureOfRecord;
Minim minim;
AudioPlayer song;
int angle = 99999999;
void setup(){
  size(600,600);
  pictureOfRecord= loadImage("record2.jpeg");
  pictureOfRecord.resize(600, 600);
  minim = new Minim(this);
  song = minim.loadFile("MeLike.mp3", 512);
}

void draw(){
    if(mousePressed){
    rotateImage(pictureOfRecord, angle);
    song.play();
    angle=angle+20;
    }
    else{
      song.pause();
    }
  image(pictureOfRecord, 0, 0);
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
