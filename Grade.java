﻿class Grade {
	String grade;
	void Grade(double marks){
		if(marks>=90&&marks<=100){
			grade="A";
		}
		else if(marks>=80&&marks<90){
			grade="B";
		}
		else if(marks>=70&&marks<80){
			grade="C";
		}
		else if(marks>=60&&marks<70){
			grade="D";
		}
		else{
			grade="F";
		}
		System.out.println("My score is "+marks+" then grade is "+grade);
	}
	public static void main(String[] args) {
		Grade g=new Grade();
		g.Grade(65);
	}
}