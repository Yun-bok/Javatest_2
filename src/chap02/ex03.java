package chap02;

public class ex03 {
	public static void main(String[] args) {
		
	
	//타입변환
	//-데이터 타입을 다른 데이의 타입으로 변환하는 것
	// 자동(묵시적) 타입변환, 강제(명시적) 타입변환
	
	//[자동(묵시적)타입변환 - Promotion
	//사용되는 메모리 크기가 작은 타입에서 -> 큰타입으로 자동 타입 변환 가능
	//()는 메모리 사용크기
	//byte(1) < shor(2) , int(4) <long(8) < float(4) <double(8)
	
	byte byteValue = 100;
	// 자동(묵시적) 타입변환이 발생
	int intValue = byteValue;
	System.out.println("intValue");
	
	//[강제(명시적) 타입변환]
	//int -> byte 
	//강제 타입변환
	byteValue = (byte)intValue;
	int int_val = 10;
	System.out.println(byteValue);
	
	intValue = 350;
	//강제 타입변환은 컴파일러 에러가 안생김 -> 사람의 논리 오류
	byteValue = (byte)intValue;
	System.out.println(byteValue);
	
	int int_val =10;
	double double_val = 3.14;
	int result = int_val +(int)double_val;
	}
}
