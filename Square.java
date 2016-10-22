import ch.aplu.turtle.*; 

 
Turtle t1 = new Turtle(); 
class Square{ 
	void drawSquare(int size){ 
		for(int i=0; i<4; i++){ 
			t1.fd(size); 
			t1.right(90); 
		} 
	} 
} 
Square a = new Square(); 
a.drawSquare(100); 
