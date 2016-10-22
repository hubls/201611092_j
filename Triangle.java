import ch.aplu.turtle.*; 

 
Turtle t1 = new Turtle(); 
class Triangle{ 
	void drawTriangle(int size){ 
		for(int i=0; i<3; i++){ 
			t1.fd(size); 
			t1.right(120); 
		} 
	} 
} 
Triangle a = new Triangle(); 
a.drawTriangle(100); 
