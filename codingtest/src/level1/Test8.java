package level1;

public class Test8 {
	//���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
	//num�� int ������ �����Դϴ�. 0�� ¦���Դϴ�.
	public String solution(int num) {
		String answer = "";

		if (num%2 ==0) {
			answer="Even";	
		}else if (num%2 ==1 || num%2 ==-1 ) {
			answer="Odd";
		
		}else if (num==0) {
			answer="Even";
		}

		return answer;
	}
}