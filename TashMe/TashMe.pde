void setup() {
size (600,600);
}
void draw() {
if(mousePressed){
fill(#F37651);
} else{
fill(255,0,0);
}
 ellipse(300,300,400,400);
}


PImage mustache;
PImage friend;
friend = loadImage("friend.jpeg");
size(800,600);
friend.resize(width,height);