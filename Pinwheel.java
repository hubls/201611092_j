import ch.aplu.turtle.*;
class Pinwheel{
	Turtle t1=new Turtle();
	void drawPinwheel(int size,int bigger,int turns,double degree){
		t1.home();
		t1.clear();
		for(int i=0;i<turns;i++) {
			if (i%2!=0) {
				t1.fd(size);
				t1.rt(degree);
				size=size+bigger;
			}
		}
	}
	public static void main(String[] args){
	Pinwheel p=new Pinwheel();
	p.drawPinwheel(30,20,30,90);
	}
}