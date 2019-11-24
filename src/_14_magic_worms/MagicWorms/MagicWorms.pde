int xx = (int) random(600);
int yy = (int) random(600);
void setup(){
  size(600, 600);
  background(138, 146, 136);
  frameRate(50000000);
}

void draw(){
  makeMagical();
  for(int i=0;i<300;i++){
    xx = (int) random(600);
    yy = (int) random(600);
    fill((int) random(255), (int) random(255), (int) random(255));
    ellipse(getWormX(i), getWormY(i), (int) random(10), (int) random(10));
  }
}
float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
