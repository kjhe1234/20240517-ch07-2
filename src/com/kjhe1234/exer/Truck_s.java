package com.kjhe1234.exer;

public class Truck_s extends Car_s {
	
	int tire;  // 타이어 수
	int weight; // 차량무게
	
	public void setTire(int tire) {
		this.tire = tire;
	}

	public Truck_s() {
		super("소나타",2022,"300마력","black");  // 부모클래스 생성자 호출
		// TODO Auto-generated constructor stub
	}

	
}
