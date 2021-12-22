package chap02;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[변수 선언]
		//int라는 4byte 정수를 저장하는 타입
		//num이라는 이름의 변수를 선언
		//타입 변수이름;
		int num;
		
		//같은 타입의 변수는 ,로 동시에 선언할수있다.
		int count, score;
		
		//컴파일 에러 -> 같은 영역에서 같은 이름의 변수 사용 불가능
		//int num;
		
		//선언과 동시에 초기화 (value라는 이름을 가진 공간에 30이란 값을 저장 명령)
		int value = 30;
		
		//[변수값 저장]
		num = 5;
		count = 10;
		
		//[변수의 사용]
		System.out.println("num = " + num); //num =변수의 값
		System.out.println("count = " + count);
		System.out.println("value = " +value);
		
		//컴파일 에러 -> score 값이 할당되지 않았기 때문에
		//System.out.println("score = " + score);
		
		//score라는 변수에 num값 + count값을 한 결과를 저장해라
		score = num + count;
		System.out.println("count = " + count);
		
		//[변수의 사용범위]
		//{}안에서만 사용 가능
		{
			int test_value =10;
			System.out.println("test_value = " + test_value);
		}
		
		// test_vlaue는 위에 블록에서만 사용가능
		//컴파일 에러 -> 해당하는 블록에 test_value 변수가 존재하지 않는다.
		//System.out.println("test_value = " + test_value);
		System.out.println("test_value = " + test_value);

	}

}
