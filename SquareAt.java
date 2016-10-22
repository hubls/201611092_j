import ch.aplu.turtle.*; 

 
Turtle t1 = new Turtle(); 
class SquareAt{ 
	void drawSquareat(int size, double x, double y){ 
	    t1.penUp(); 
	    t1.moveTo(x,y); 
	    t1.penDown(); 
	    t1.setHeading(0); 
	    for(int i=0; i<4; i++){ 
	        t1.fd(size); 
	        t1.right(90); 
	    } 
	} 
} 
SquareAt a = new SquareAt();
a.drawSquareat(100, 50, 50);