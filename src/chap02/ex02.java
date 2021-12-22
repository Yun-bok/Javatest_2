package chap02;

public class ex02 {
	public static void main(String[] args) {
		//[기본타입]
		//[정수를 받는 타입]
		//바이트를 의미하는 타입
		//byte 1바이트 (-128~127)
		byte val1 = 1;
		//컴파일 에러 -> 바이트 크기를 초과
		//byte btyevalue = 128;
		
		//문자를 저장하는 타입
		//[정수를 받는 타입]
		//값으로는 ''을 사용
		//0~65536 * 0~127 아스키 코드
		char char_val = 97;
		System.out.println("char_val = " + char_val);
		//문자를 넣을수도 있다
		char val2 = '가';
		//특수문자 or 이스케이프 문자
		char val3 = '\t';
		//char val4 = '';
		
		//[정수를 받는 타입]
		//정수를 의미 하는 타입
		short val5 = 2;
		//short, int, long 은 최소 최대 범위만 다른 의미다
		//short short_val =32768;
		int val6 = 32768;
		long val7 = 4;
		
		//[실수 타입]
		//우측에 리터럴(우측 값) 무조건 f 사용
		float val8 = 3.14f;
		
		//float보다 범위가 큰놈 -> f 필요없음
		double val9 = 3.14;
		double val10 = 3.14d;
		
		//[논리 타입]
		//참, 거짓 의미
		//true, false
		boolean val11 = true;
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val5);
		System.out.println(val6);
		System.out.println(val7);
		System.out.println(val8);
		System.out.println(val9);
		System.out.println(val10);
		System.out.println(val11);
		
		//[클래스 타입]
		//문자열을 저장하는 타입 String은 클래스타입이다.
		//문자열을 ""을 사용한다.
		//문자열을 변수에 저장하면 변수에 직접 저장되는 것이 아니라
		//String이라는 객체가 생성되고 변수는 객체의 주소를 가르치게 된다.
		String str = "문자열";
		//빈문자열을 ""표시가능
		String str2 = "";
		//컴파일 에러 빈문자는 ' '공백
		//char ch1 = '';
		System.out.println(str);
	}

}
