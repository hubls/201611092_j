package com.sd.ch8; 

 
class Hello{ 
	private String name; 
	public Hello(String name){ 
		this.name = name; 
	} 
	public void sayHello(){ 
		System.out.println("Hello "+name); 
	} 
	public static void main(String[] args){ 
		Hello[] h = new Hello[5]; 
		h[0] = new Hello("LKJ"); 
		h[1] = new Hello("LSJ"); 
		h[2] = new Hello("LOJ"); 
		h[3] = new Hello("LUJ"); 
		h[4] = new Hello("LDJ"); 
		for(Hello e:h){ 
			e.sayHello(); 
		} 
	} 
} 
