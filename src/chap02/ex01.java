package chap02;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[���� ����]
		//int��� 4byte ������ �����ϴ� Ÿ��
		//num�̶�� �̸��� ������ ����
		//Ÿ�� �����̸�;
		int num;
		
		//���� Ÿ���� ������ ,�� ���ÿ� �����Ҽ��ִ�.
		int count, score;
		
		//������ ���� -> ���� �������� ���� �̸��� ���� ��� �Ұ���
		//int num;
		
		//����� ���ÿ� �ʱ�ȭ (value��� �̸��� ���� ������ 30�̶� ���� ���� ���)
		int value = 30;
		
		//[������ ����]
		num = 5;
		count = 10;
		
		//[������ ���]
		System.out.println("num = " + num); //num =������ ��
		System.out.println("count = " + count);
		System.out.println("value = " +value);
		
		//������ ���� -> score ���� �Ҵ���� �ʾұ� ������
		//System.out.println("score = " + score);
		
		//score��� ������ num�� + count���� �� ����� �����ض�
		score = num + count;
		System.out.println("count = " + count);
		
		//[������ ������]
		//{}�ȿ����� ��� ����
		{
			int test_value =10;
			System.out.println("test_value = " + test_value);
		}
		
		// test_vlaue�� ���� ��Ͽ����� ��밡��
		//������ ���� -> �ش��ϴ� ��Ͽ� test_value ������ �������� �ʴ´�.
		//System.out.println("test_value = " + test_value);
		System.out.println("test_value = " + test_value);

	}

}
