package chap02;

public class ex02_3 {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		int uniCode = c1;
		//2byte char c1 �� 4(int)�� �ڵ���ȯ�Ѱ�
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(uniCode);
	}

}
