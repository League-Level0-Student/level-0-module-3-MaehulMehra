
void setup() {
 
  // set the size of your sketch
  size (500, 500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
       for (int i = 500; i >= 100; i -= 50){
        if (i % 100 == 0){
           fill (245, 56, 89);
        }
           else {
              fill (35, 45, 67);

           }
                    ellipse (250, 250, i, i);
       }
       
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
