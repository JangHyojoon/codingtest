package level1;

public class Test4 {
	//���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
	//��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, 
	//��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	//phone_number�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
	public String solution(String phone_number) {
		String front = "";
		for (int i = 0; i <  phone_number.length()-4;i++) {
			front +="*";
		}
		String answer = front + phone_number.substring(phone_number.length()-4,phone_number.length());

		return answer;
	}
}
//substring �żҵ� �������.