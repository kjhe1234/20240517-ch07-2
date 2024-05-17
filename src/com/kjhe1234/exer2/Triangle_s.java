package com.kjhe1234.exer2;

public class Triangle_s extends Shape_s { //Shape_s 클래스를 상속 받음

	@Override
	public void areaPrint() {
		// TODO Auto-generated method stub
		super.areaPrint();  // 부모클래스에서 정의된 원본 메소드 호출
		System.out.println(width * height * 0.5);
	}

//	@Override
//	public void namePrint() {
//		// TODO Auto-generated method stub
//		System.out.println("도형이름:Triangle");
//	}  
	
//	public void areaPrint() {  // 오버라이딩 -> 삼각형 넓이 출력
//		System.out.println(width * height * 0.5);
//	}
	
	

}
