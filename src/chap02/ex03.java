package chap02;

public class ex03 {
	public static void main(String[] args) {
		
	
	//Ÿ�Ժ�ȯ
	//-������ Ÿ���� �ٸ� ������ Ÿ������ ��ȯ�ϴ� ��
	// �ڵ�(������) Ÿ�Ժ�ȯ, ����(�����) Ÿ�Ժ�ȯ
	
	//[�ڵ�(������)Ÿ�Ժ�ȯ - Promotion
	//���Ǵ� �޸� ũ�Ⱑ ���� Ÿ�Կ��� -> ūŸ������ �ڵ� Ÿ�� ��ȯ ����
	//()�� �޸� ���ũ��
	//byte(1) < shor(2) , int(4) <long(8) < float(4) <double(8)
	
	byte byteValue = 100;
	// �ڵ�(������) Ÿ�Ժ�ȯ�� �߻�
	int intValue = byteValue;
	System.out.println("intValue");
	
	//[����(�����) Ÿ�Ժ�ȯ]
	//int -> byte 
	//���� Ÿ�Ժ�ȯ
	byteValue = (byte)intValue;
	int int_val = 10;
	System.out.println(byteValue);
	
	intValue = 350;
	//���� Ÿ�Ժ�ȯ�� �����Ϸ� ������ �Ȼ��� -> ����� �� ����
	byteValue = (byte)intValue;
	System.out.println(byteValue);
	
	int int_val =10;
	double double_val = 3.14;
	int result = int_val +(int)double_val;
	}
}
