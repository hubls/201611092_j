import ch.aplu.turtle.*; 

 
Turtle t1 = new Turtle(); 
class Star{ 
	void drawStar(int size){ 
		for(int i=0; i<5; i++){ 
			t1.fd(size); 
			t1.right(144); 
		} 
	} 
} 
Star a = new Star(); 
a.drawStar(100); 