package chap02;

public class ex02 {
	public static void main(String[] args) {
		//[�⺻Ÿ��]
		//[������ �޴� Ÿ��]
		//����Ʈ�� �ǹ��ϴ� Ÿ��
		//byte 1����Ʈ (-128~127)
		byte val1 = 1;
		//������ ���� -> ����Ʈ ũ�⸦ �ʰ�
		//byte btyevalue = 128;
		
		//���ڸ� �����ϴ� Ÿ��
		//[������ �޴� Ÿ��]
		//�����δ� ''�� ���
		//0~65536 * 0~127 �ƽ�Ű �ڵ�
		char char_val = 97;
		System.out.println("char_val = " + char_val);
		//���ڸ� �������� �ִ�
		char val2 = '��';
		//Ư������ or �̽������� ����
		char val3 = '\t';
		//char val4 = '';
		
		//[������ �޴� Ÿ��]
		//������ �ǹ� �ϴ� Ÿ��
		short val5 = 2;
		//short, int, long �� �ּ� �ִ� ������ �ٸ� �ǹ̴�
		//short short_val =32768;
		int val6 = 32768;
		long val7 = 4;
		
		//[�Ǽ� Ÿ��]
		//������ ���ͷ�(���� ��) ������ f ���
		float val8 = 3.14f;
		
		//float���� ������ ū�� -> f �ʿ����
		double val9 = 3.14;
		double val10 = 3.14d;
		
		//[�� Ÿ��]
		//��, ���� �ǹ�
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
		
		//[Ŭ���� Ÿ��]
		//���ڿ��� �����ϴ� Ÿ�� String�� Ŭ����Ÿ���̴�.
		//���ڿ��� ""�� ����Ѵ�.
		//���ڿ��� ������ �����ϸ� ������ ���� ����Ǵ� ���� �ƴ϶�
		//String�̶�� ��ü�� �����ǰ� ������ ��ü�� �ּҸ� ����ġ�� �ȴ�.
		String str = "���ڿ�";
		//���ڿ��� ""ǥ�ð���
		String str2 = "";
		//������ ���� ���ڴ� ' '����
		//char ch1 = '';
		System.out.println(str);
	}

}
