class LeapYear {
	public void computeLeap(int[] y) {
		for (int x: y) {
			if (((x % 4 == 0) && (x % 100 != 0)) || (x % 400 == 0)) {
				System.out.printf("%d is LeapYear\n", x);
			}
			else{
				System.out.printf("%d isn't LeapYear\n", x);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] year = { 1234, 1200, 1997, 1998, 2000, 1592, 2016 };
		
		LeapYear l = new LeapYear();
		l.computeLeap(year);
	}
}