package com.kjhe1234.exer;

public class Car_s {
	
	String modelName;  //모델명
	int modelYear;        //년식
	private String horsePower;  //마력
	String color;           //차색깔
	
	public void printModel() {
		System.out.println("자동차 모델명:" + this.modelName);
		
	}

	public Car_s() {
		System.out.println("Car_s 클래스(부모클래스) 생성자 호출됨!!");
	}

	public Car_s(String modelName, int modelYear, String horsePower, String color) {
		super();
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.color = color;
	}
	
	
}
