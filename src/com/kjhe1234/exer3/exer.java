package com.kjhe1234.exer3;

public class exer {
	public String nation;
	
	public exer() {
		this("대한민국");
		System.out.println("exer() call");

	}
	
	public exer(String nation) {
		this.nation = nation;
		System.out.println("exer(String nation) call");		
	}

}
