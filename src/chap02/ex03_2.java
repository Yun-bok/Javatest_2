package chap02;

public class ex03_2 {
	public static void main(String[] args) {
		int i = 128; //127���Խ� �״�� ��µ����� 128���ʹ� ->
		if((i<Byte.MIN_VALUE) ||(i>Byte.MAX_VALUE) ){
			System.out.println("byte Ÿ�� ��ȯ x ");//-> ����Ʈ Ÿ�Ժ�ȯ ���Եȴ�
		}else{
			byte b =(byte) i;
			System.out.println(b);
		}
	}

}
