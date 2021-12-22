package chap02;

public class ex03_2 {
	public static void main(String[] args) {
		int i = 128; //127기입시 그대로 출력되지만 128부터는 ->
		if((i<Byte.MIN_VALUE) ||(i>Byte.MAX_VALUE) ){
			System.out.println("byte 타입 변환 x ");//-> 바이트 타입변환 기입된다
		}else{
			byte b =(byte) i;
			System.out.println(b);
		}
	}

}
